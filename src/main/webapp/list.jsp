<%--
  Created by IntelliJ IDEA.
  User: xx
  Date: 2021/12/19
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" width="800" bgcolor="#7fffd4" border="1" style="border-collapse: collapse">
  <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>性别</th>
    <th>年龄</th>
    <th>地址</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${userList}" var="user">
    <tr align="center">
      <td>${user.uid}</td>
      <td>${user.uname}</td>
      <td>${user.sex}</td>
      <td>${user.age}</td>
      <td>${user.addr}</td>
      <td>
        <button><a href="">删除</a></button>
        <button><a href="">添加</a></button>
        <button><a href="">修改</a></button>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
