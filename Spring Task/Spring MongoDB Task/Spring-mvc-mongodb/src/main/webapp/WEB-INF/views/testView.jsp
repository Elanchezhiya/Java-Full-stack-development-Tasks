<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<c:if test="${empty employees}">
    <tr>
        <td colspan="4">No employees found</td>
    </tr>
</c:if>

<c:forEach var="employee" items="${employees}">
    ${employee.id}
        ${employee.name}
        ${employee.email}
        ${employee.location}
    </tr>
</c:forEach>
