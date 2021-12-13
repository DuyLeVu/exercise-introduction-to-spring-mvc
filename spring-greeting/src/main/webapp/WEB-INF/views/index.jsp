<%--
  Created by IntelliJ IDEA.
  User: Duy Le Vu
  Date: 12/13/2021
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Greeting</title>
  </head>
  <body>
  <h1> Hello Spring MVC</h1>

  <h1>Tính tổng</h1>
  <form action="/tong" method="get">
    <input type="text" name="a" placeholder="Nhap so thu 1">
    <input type="text" name="b" placeholder="Nhap so thu 2">
    <input type="submit" value="Tinh tong">
  </form>
  </body>
</html>
