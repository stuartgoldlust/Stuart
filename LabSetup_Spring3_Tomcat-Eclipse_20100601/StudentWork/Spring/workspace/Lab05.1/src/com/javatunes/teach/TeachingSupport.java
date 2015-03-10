/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */
 
package com.javatunes.teach;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

// TODO Declare class to be an aspect
public class TeachingSupport {

	// TODO declare point cuts
	
   // TODO Declare this method as before advice
   public void setupDisplayProjector() {
      System.out.println("Turning Display Projector On");
   }

   // TOOO (Optional) Declare method to be before advice
   public void checkData() {
      System.out.println("Data is OK");
   }   
   
}