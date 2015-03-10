/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */
 
package com.javatunes.teach;

// TODO import Component
// TODO import Resource

// TODO - Add Component annotation
public class JavaInstructor implements Teacher {
	
	// TODO - Add Resource annotation
	private InfoSource info;
	public void setInfo (InfoSource infoIn) {
      info=infoIn;
  }
	public void teach() {
		System.out.println(info.getData());
	}
}

