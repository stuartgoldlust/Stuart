package com.javatunes.tx;

import java.math.BigDecimal;
import java.sql.Date;

import com.javatunes.jdbc.MusicItemDAO;
import com.javatunes.util.MusicItem;

public class TestTxImpl implements TestTx {
	
	MusicItemDAO dao;

	public MusicItemDAO getDao() {
		return dao;
	}

	public void setDao(MusicItemDAO dao) {
		this.dao = dao;
	}

	public void runTest() {
        MusicItem createItem = new MusicItem(null, "CD599", "Transaction Blues", 
    		    "We are Committed", Date.valueOf("1984-09-16"), 
    			new BigDecimal("9.99"), new BigDecimal("7.77"));
        dao.create(createItem);        
        dao.blowUp();
	}
}
