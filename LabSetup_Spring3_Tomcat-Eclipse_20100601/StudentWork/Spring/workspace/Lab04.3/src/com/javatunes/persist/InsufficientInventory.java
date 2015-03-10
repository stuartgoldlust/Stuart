/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-9 LearningPatterns Inc.
 */

package com.javatunes.persist;

public class InsufficientInventory extends Exception
{
	private static final long serialVersionUID = 1L;

	public InsufficientInventory(String message)  {
      super(message);
   }
}
