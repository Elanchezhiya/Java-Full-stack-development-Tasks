<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Employees</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">All Employees</h1>

        <div class="table-responsive">
            <table class="table table-bordered table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Location</th>
                    </tr>
                </thead>
                <tbody>
                    <%-- Check if employees list is empty --%>
                    <c:if test="${empty employees}">
                        <tr>
                            <td colspan="4" class="text-center">No employees found</td>
                        </tr>
                    </c:if>
                    <%-- Loop through employee data passed from the controller --%>
                    <c:forEach var="employee" items="${employees}">
                        <tr>
                            <td><a href="/Spring-mvc-mongodb/display/${employee.id}">${employee.id}</a></td>
                            <td>${employee.name}</td>
                            <td>${employee.email}</td>
                            <td>${employee.location}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <a href="/Spring-mvc-mongodb">Add Employee</a>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.4.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
