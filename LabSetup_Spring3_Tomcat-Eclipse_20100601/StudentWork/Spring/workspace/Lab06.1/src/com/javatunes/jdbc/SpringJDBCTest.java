/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.javatunes.jdbc;

import java.util.Collection;

import com.javatunes.tx.TestTx;
import com.javatunes.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringJDBCTest
{
   public static void main(String[] args)
   {
		ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext( "beans.xml" );
		System.out.println("Created container");
		// TODO - Look up musicItemDAO and testTx
		MusicItemDAO dao = ctx.getBean("musicItemDAO", MusicItemDAO.class);
		TestTx test = ctx.getBean("testTx", TestTx.class);


		// Run the test program.
		
		try {
			test.runTest();
		} catch (Exception e) {
			System.out.println("Exception thrown in TextTxImpl: " + e.getMessage());
		}

         // See if the music item was created
         Collection<MusicItem> results = dao.searchByKeyword("Transaction");
         System.out.println("*** searchByKeyword for 'Transaction' found the following: ***\n");
		 for (MusicItem curItem : results) {
            System.out.println(curItem);
         }
		 System.out.println("*** searchByKeyword = Transaction finished ***\n");		 
    }
}
