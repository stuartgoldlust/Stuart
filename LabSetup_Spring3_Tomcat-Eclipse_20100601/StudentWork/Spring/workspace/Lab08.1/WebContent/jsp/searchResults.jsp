<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix="c" %>

<HTML>
   <HEAD>
      <TITLE>Search Results</TITLE>
   </HEAD>
   <BODY>
      <%@ include file="/jsp/header.jspf" %>
      Search results for keyword <B><c:out value='${param.keyword}'/></B>:
      <BR/>
	<table border="1">
	  <thead>
	    <tr>
	      <th>ID</th>
	      <th>Name</th>
	      <th>Artist</th>
	      <th>Release Date</th>
	      <th>List Price</th>
	      <th><font color='green'>Your Price</font></th>
	    </tr>
	  </thead>
	  <tbody>

       <c:forEach items="${results}" var="item">
	    <tr>
	      <!-- We use both getProperty and c:out here to illustrate -->
	      <!-- their use                                            -->
	      <td><c:out value="${item.id}"/></td>
	      <td><c:out value="${item.title}"/></td>
		  <td><c:out value="${item.artist}"/></td>
	      <td><c:out value="${item.releaseDate}"/></td>
	      <td>$<c:out value="${item.listPrice}"/></td>
	      <td><b><font color='green'>$<c:out value="${item.price}"/></font></b></td>
	    </tr>
       </c:forEach>
      </tbody>
	</table>

   </BODY>
</HTML>
