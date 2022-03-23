<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookForm</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
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
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Book Form</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Book</div>
    </div>
    <div class="panel-body">
     <form:form action="savebook" cssClass="form-horizontal"
      method="post" modelAttribute="book">
      <div class="form-group">
       <label>Book Code</label>
       <div class="col-md-9">
        <form:input path="bookcode" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label>Book Name</label>
       <div class="col-md-9">
        <form:input path="bookname" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label>Author</label>
       <div class="col-md-9">
        <form:input path="author" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <label>Date Added</label>
       <div class="col-md-9">
        <form:input path="dateadded" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>