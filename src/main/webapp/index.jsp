<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/3/2022
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount Product</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    <lable>Product Description:</lable>
    <input type="text" name="description"><br>
    <lable>List Price:</lable>
    <input type="text" name="price"><br>
    <lable>Discount Percent</lable>
    <input type="text" name="percent"><br>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
