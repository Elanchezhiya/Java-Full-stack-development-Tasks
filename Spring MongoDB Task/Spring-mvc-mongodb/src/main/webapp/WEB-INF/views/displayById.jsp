<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h2 class="text-center">Employee Details</h2>
        </div>
        <div class="card-body">
            <c:choose>
                <c:when test="${not empty employee}">
                    <ul class="list-group">
                        <li class="list-group-item"><strong>ID:</strong> ${employee.id}</li>
                        <li class="list-group-item"><strong>Name:</strong> ${employee.name}</li>
                        <li class="list-group-item"><strong>Email:</strong> ${employee.email}</li>
                        <li class="list-group-item"><strong>Location:</strong> ${employee.location}</li>
                    </ul>
                </c:when>
                <c:otherwise>
                    <div class="alert alert-danger" role="alert">
                        ${message}
                    </div>
                </c:otherwise>
            </c:choose>
        </div>
        <div class="card-footer text-center">
            <a href="/Spring-mvc-mongodb/displayAll" class="btn btn-info">Back to All Employees</a>
        </div>
    </div>
</div>
</body>
</html>
