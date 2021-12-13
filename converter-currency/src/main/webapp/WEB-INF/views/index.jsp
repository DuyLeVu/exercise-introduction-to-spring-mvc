<%--
  Created by IntelliJ IDEA.
  User: Duy Le Vu
  Date: 12/13/2021
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Converter Currency</title>
  </head>
  <body>
  <form action="/change">
    <input type="text" name="usd" placeholder="USD">
    <input type="submit" value="Convert">
  </form>
  <h2>Result: ${result}</h2>
  </body>
</html>
