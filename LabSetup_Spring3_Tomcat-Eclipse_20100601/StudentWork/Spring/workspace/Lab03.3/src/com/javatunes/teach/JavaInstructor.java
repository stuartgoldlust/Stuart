/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.javatunes.teach;

public class JavaInstructor implements Teacher {
	private InfoSource info;
	public void setInfo (InfoSource infoIn) {
      info=infoIn;
  }

	private String favoriteTopic;
	public void setFavoriteTopic (String topic) {
      favoriteTopic = topic;
  }
	public String getFavoriteTopic() { return favoriteTopic; }

	private Double age;
	public void setAge (Double d) {
      age = d;
  }
	public Double getAge() { return age; }
	

  public void teach() {
		System.out.println(info.getData());
	}
}

