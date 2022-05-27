<%@ page import="model.Alien" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 027 27.05.22
  Time: 6:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        Alien alien1=(Alien)request.getAttribute("alien");
//        out.println(alien1);
        Alien alien1 = (Alien)session.getAttribute("alien");
        out.println(alien1);
    %>
</body>
</html>
