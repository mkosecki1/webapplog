<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Maciek
  Date: 2018-12-29
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App Log</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>Body text</p>

    <%
      Date date = new Date();
      out.println("<h2>" + date.toString() + "</h2>");
    %>

  </body>
</html>