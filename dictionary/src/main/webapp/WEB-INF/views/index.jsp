<%--
  Created by IntelliJ IDEA.
  User: Duy Le Vu
  Date: 12/13/2021
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form action="/change">
    <input type="text" name="eng" placeholder="English">
    <input type="submit" value="Translate">
  </form>
  <h2>Result: ${result}</h2>
  </body>
</html>
