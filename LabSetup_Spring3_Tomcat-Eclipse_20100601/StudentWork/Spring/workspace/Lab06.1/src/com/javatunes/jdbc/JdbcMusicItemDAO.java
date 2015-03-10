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
public class JdbcMusicItemDAO extends JdbcDaoSupport implements MusicItemDAO
{
      private static final String INSERT = "INSERT INTO Item (NUM, Title, Artist, ReleaseDate, ListPrice, Price) VALUES (?, ?, ?, ?, ?, ?)";

	  private static final String SELECT_ALL_PROPS = "SELECT ITEM_ID, NUM, Title, Artist, ReleaseDate, ListPrice, Price FROM Item ";
	  
      private static final String FIND_BY_KEYWORD = SELECT_ALL_PROPS + " WHERE Title LIKE ? OR Artist LIKE ?";      
	  
      private static final String FIND_BY_ID = SELECT_ALL_PROPS + " WHERE ITEM_ID = ?";   
   
	private static final class MIRowMapper implements RowMapper<MusicItem> {
		// TODO - Lab 4.2 Implement This method to create a MusicItem from the result set values, and return the MusicItem
      public MusicItem mapRow(ResultSet rs, int rowNum) throws SQLException {
    	  // extract data from the ResultSet
    	  Long       id  		= rs.getLong("ITEM_ID");
    	  String     num			= rs.getString("NUM");
    	  String     title       = rs.getString("Title");
    	  String     artist      = rs.getString("Artist");
    	  Date       releaseDate = rs.getDate("ReleaseDate");
    	  BigDecimal listPrice   = rs.getBigDecimal("ListPrice");
    	  BigDecimal price       = rs.getBigDecimal("Price");

    	  // initialize the return value
    	  return new MusicItem(id, num, title, artist, releaseDate, listPrice, price);
     }
	}
	
	public MusicItem searchById(Long id) {
		return getJdbcTemplate().queryForObject (
				FIND_BY_ID, new Object[]  {id}, new MIRowMapper());
	} 

	public void create(MusicItem item) {
		Object[] args = { item.getNum(), item.getTitle(), item.getArtist(), 
				item.getReleaseDate(), item.getListPrice(), item.getPrice() };
		getJdbcTemplate().update(INSERT, args);
	}

	   public Collection<MusicItem> searchByKeyword(String keyword) {
		      // create the %keyword% wildcard syntax used in SQL LIKE operator
		      String wildcarded = "%" + keyword + "%";
			  Object[] args = {wildcarded, wildcarded};
			  return getJdbcTemplate().query(FIND_BY_KEYWORD, args, new MIRowMapper());
		   }
	   
		public void blowUp () {
			throw new RuntimeException("Blowup");
		}	   

}
