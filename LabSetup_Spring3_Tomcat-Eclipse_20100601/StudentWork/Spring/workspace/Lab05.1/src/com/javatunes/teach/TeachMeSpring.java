/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */
 
 package com.javatunes.teach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeachMeSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext( "beans.xml" );
			
		Teacher teacher = ctx.getBean("springGuru", Teacher.class);
		teacher.teach();
		
		// Optional part, try creating an instructor rather than looking it up
		JavaInstructor ji = new JavaInstructor();
		ji.setInfo(new SpringCourseBook());
		System.out.println("*** Teaching with 'new'ed instructor - no advice run ***");
		ji.teach();
	}
}