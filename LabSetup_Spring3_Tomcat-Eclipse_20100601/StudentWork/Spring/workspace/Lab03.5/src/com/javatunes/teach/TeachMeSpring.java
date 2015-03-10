/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */
 
package com.javatunes.teach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeachMeSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = null;  // TODO: Initialize properly
	    Teacher teacher = ctx.getBean("springGuru", Teacher.class);
	    teacher.teach();
	}
}