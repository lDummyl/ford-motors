<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="org.example.ford.utills.HibernateSessionFactoryUtil" %>
<%@ page import="org.example.ford.dto.Motor" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%--http://localhost:8080/ford/output.jsp--%>

<html>
<body>
<h2>Hello Another World!</h2>
<%

    Session hSession = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    out.println(hSession.get(Motor.class, 2));

    List<Motor> motors =(List<Motor>) request.getAttribute("motors");
//    for (Motor motor : motors) {
//        out.println(motor);
//    }

%>

<table border="1" cellpadding="5" cellspacing="5">
    <tr>
        <th>Id</th>
        <th>Serial</th>
    </tr>

    <c:forEach var="motor" items="${motors}">
        <tr>
            <td>${motor.id}</td>
            <td>${motor.serial}</td>
        </tr>
    </c:forEach>
</table>





<%--For displaying Previous link except for the 1st page --%>
<c:if test="${currentPage != 1}">
    <td><a href="employee.do?page=${currentPage - 1}">Previous</a></td>
</c:if>

<%--For displaying Page numbers.
The when condition does not display a link for the current page--%>
<table border="1" cellpadding="5" cellspacing="5">
    <tr>
        <c:forEach begin="1" end="${noOfPages}" var="i">
            <c:choose>
                <c:when test="${currentPage eq i}">
                    <td>${i}</td>
                </c:when>
                <c:otherwise>
                    <td><a href="employee.do?page=${i}">${i}</a></td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
</table>

<%--For displaying Next link --%>
<c:if test="${currentPage lt noOfPages}">
    <td><a href="employee.do?page=${currentPage + 1}">Next</a></td>
</c:if>


</body>
</html>

