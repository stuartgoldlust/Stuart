/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitablity for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-7 LearningPatterns Inc.
 */

package com.javatunes.web;

import com.javatunes.catalog.*;
import com.javatunes.util.MusicItem;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.WebApplicationContext;

public class SearchServlet
extends HttpServlet {
  
  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException  {
	   
      // Read parameter from HTML form
      String keyword = request.getParameter("keyword");	   

	  // Do the search, store results in request with name "results"
	  WebApplicationContext ctx = 
		WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	  Catalog cat = ctx.getBean("javaTunesCatalog", Catalog.class);
	  Collection<MusicItem> results = cat.findByKeyword(keyword);
	  request.setAttribute("results", results);

	  // Forward to /jsp/searchResults.jsp for display
	  this.getServletContext().getRequestDispatcher("/jsp/searchResults.jsp").
		forward(request, response);
   }
}
