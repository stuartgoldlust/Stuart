/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */
 
package com.javatunes.catalog;

import com.javatunes.util.MusicItem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class JavaTunes {

	public static void main(String[] args) {
		// Create the resource that reads the spring configuration file to initialize the res variable
		Resource res = new FileSystemResource("src/beans.xml");
		// Create a BeanFactory - using the resource above- to initilize the factory variable
		BeanFactory factory = new XmlBeanFactory(res);
		// Look up the javaTunesCatalog bean 
		Catalog cat = (Catalog)factory.getBean("javaTunesCatalog");

		// Search by id - returns a single item
		System.out.println(cat.findById(new Long(2)));
		// Retrieve one of the MusicItem beans used in the constructor
		MusicItem mi = (MusicItem)factory.getBean("mi1");
		System.out.println(mi);
	}
}