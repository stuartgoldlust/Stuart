/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.javatunes.jdbc;

import java.sql.*;
import java.util.Collection;
import java.math.BigDecimal;
import com.javatunes.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringJDBCTest
{
   public static void main(String[] args)
   {
		ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext( "beans.xml" );
		System.out.println("Created container");
		// TODO - Look up musicItemDAO
   }
}
