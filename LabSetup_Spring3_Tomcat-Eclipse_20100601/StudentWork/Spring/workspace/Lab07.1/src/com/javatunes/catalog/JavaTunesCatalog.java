/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */


package com.javatunes.catalog;

import java.util.Collection;
import java.util.List;

import com.javatunes.util.MusicItem;

// TODO - Make sure JavaTunesCatalog implments Catalog
public class JavaTunesCatalog implements Catalog {

	// Properties
   private SearchUtility searchUtil;

   private int maxSearchResults = 0;
   public void setMaxSearchResults(int maxIn) {
	maxSearchResults = maxIn;
   }
   public int getMaxSearchResults() { return maxSearchResults; }

	// Constructor - We require a JavaTunesCatalog to be initialized with a SearchUtility bean when created
	public JavaTunesCatalog(SearchUtility suIn) {
		searchUtil = suIn;
	}

	// Business methods

   public MusicItem findById(Long id) {
	   System.out.println("JavaTunesCatalog:findById - " + id);

      // delegate to the search bean
      return searchUtil.findById(id);
  }

   public Collection<MusicItem> findByKeyword(String keyword)  {
      System.out.println("JavaTunesCatalog:findByKeyword - " + keyword);
      System.out.println("maxSearchResults = " + maxSearchResults);

      // delegate to the search Bean, then trim the results
      return trim(searchUtil.findByKeyword(keyword));
   }

	// Simple method to trim the results collection down to a size of maxSearchResults
	// We only bother to do it for Lists because their is an easy method to do so, and that's adequate to test the lab
@SuppressWarnings("unchecked")
private Collection<MusicItem> trim (Collection<MusicItem> results) {
	   Collection<MusicItem> ret = results;
	   if ( (maxSearchResults > 0) 
			&& (results.size() > maxSearchResults) 
			&& (results instanceof List) ) {
		   ret = ((List<MusicItem>)results).subList(0,maxSearchResults);
	   }
	   return ret;
   }
}
