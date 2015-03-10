/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.javatunes.jdbc;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Collection;

import java.math.BigDecimal;

import com.javatunes.util.MusicItem;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.RowMapper;

// TODO extend the JdbcDaoSupport class
public class JdbcMusicItemDAO implements MusicItemDAO
{
      private static final String INSERT = "INSERT INTO Item (NUM, Title, Artist, ReleaseDate, ListPrice, Price) VALUES (?, ?, ?, ?, ?, ?)";

	  private static final String SELECT_ALL_PROPS = "SELECT ITEM_ID, NUM, Title, Artist, ReleaseDate, ListPrice, Price FROM Item ";
	  
      private static final String FIND_BY_KEYWORD = SELECT_ALL_PROPS + " WHERE Title LIKE ? OR Artist LIKE ?";      
	  
      private static final String FIND_BY_ID = SELECT_ALL_PROPS + " WHERE ITEM_ID = ?";   
   
	private static final class MIRowMapper implements RowMapper<MusicItem> {
		// TODO - Lab 4.2 Implement This method to create a MusicItem from the result set values, and return the MusicItem
		public MusicItem mapRow(ResultSet rs, int rowNum) throws SQLException {
	         return null;
     }
	}
}
