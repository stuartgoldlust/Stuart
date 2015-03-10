package com.javatunes.persist.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatunes.persist.MusicItem;
import com.javatunes.persist.MusicItemDAO;

public class JPATest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext( "beans.xml" );
		System.out.println("Created container");
		MusicItemDAO dao = ctx.getBean("musicItemDAO", MusicItemDAO.class);

		try {         
         // test searchById
		 System.out.println("*** searchById = 2 ***");
         MusicItem item = dao.findById(new Long(2));
         System.out.println(item);
		} 
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	}
}
