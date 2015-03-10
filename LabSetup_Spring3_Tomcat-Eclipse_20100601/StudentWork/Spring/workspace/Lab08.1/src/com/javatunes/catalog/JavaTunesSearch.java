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

import java.util.ArrayList;
import java.util.Collection;


/**
 * This class is a simple bean that emulates the search of some catalog.
 * We do this so we don't need a database at this early stage of the course.  This will be
 * replaced with a persistent entity that goes to a database in a later lab.
 */

public class JavaTunesSearch implements SearchUtility {

   // catalog of MusicItem objects
   private Collection<MusicItem> catalog;
   
   // Constructor - JavaTunesSearch must be created with a catalog passed in
   public JavaTunesSearch(Collection<MusicItem> catalogIn) {
	catalog = catalogIn;
   }

   // searches catalog by ID
   public MusicItem findById(Long id)
   {
      // declare return value
      MusicItem result = null;

      // iterate through the catalog, looking for an ID match
      for (MusicItem item : catalog) {
         if (item.getId().equals(id))
         {
            result = item;    // assign to return value
            break;            // found it - stop looping
         }
      }
      return result;
   }

   // searches catalog by keyword
   public Collection<MusicItem> findByKeyword(String keyword)
   {
      // declare return value
      Collection<MusicItem> result = new ArrayList<MusicItem>();

      // remove case sensitivity
      keyword = keyword.toLowerCase();

      // iterate through the catalog, looking for a keyword match
      for (MusicItem item : catalog) {
         if (item.getTitle().toLowerCase().indexOf(keyword) != -1 ||
             item.getArtist().toLowerCase().indexOf(keyword) != -1)
         {
            result.add(item);
         }
      }
      return result;
   }

}
