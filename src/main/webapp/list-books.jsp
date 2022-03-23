<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Books</title>
<!--  
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>-->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Library Management System</h2>
   <header>
  		<div>
  		    <table width = "100%">
					<tr>
						<td>
							<h2>Welcome <c:out value = "${uId}"/> ! You can see your Books here.</h2>
						</td>
						<td align = "right">
							<form action="SignOut">
							<input type = "submit" value = "SignOut"/>
							</form>
						</td>
					</tr>
				</table>
			</div>
		</header>
   <hr />
   <h3>Books Listing
   <input type="button" value="Add a Book"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" /></h3>
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Books List</div>
    </div>
    <div class="panel-body">
    <form action="list">
     <table class="table table-striped table-bordered">
      <tr>
       <th>Book Code</th>
       <th>Book Name</th>
       <th>Author</th>
       <th>Date Added</th>
       <th>Actions</th>
      </tr>

      <!-- loop over and print our books -->
      <c:forEach var="tempBook" items="${books}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="updateForm">
        <c:param name="bookId" value="${tempBook.bookcode}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="delete">
        <c:param name="bookId" value="${tempBook.bookcode}" />
       </c:url>

       <tr>
        <td>${tempBook.bookcode}</td>
        <td>${tempBook.bookname}</td>
        <td>${tempBook.author}</td>
        <td>${tempBook.dateadded}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Edit</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this Book?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>
     </form>
    </div>
   </div>
  </div>

 </div>
</body>
</html>