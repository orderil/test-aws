<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Test Aws</title>
    <base href="${pageContext.request.contextPath}/"/>
</head>
<body>

<h2 id="testAws">
    Testing AWS
</h2>

<p>
    This is a test aws microservice application.

<%--<p><a href="/version.jsp" target="_blank">Version Info</a>--%>
<p><a href="/version.jsp">Version Info</a>
<p><a href="/swagger-ui.html">/swagger-ui.html</a>
<p><a href="/getTestData?param1=12345">/getTestData?param1=12345</a>
<p><a href="/getPersonData?firstName=John&lastName=Doe&age=28">/getPersonData?firstName=John&lastName=Doe&age=28</a>

</body>
</html>
