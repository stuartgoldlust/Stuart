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
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Teacher teacher = (Teacher)ctx.getBean("springGuru");
		teacher.teach();
	}
}