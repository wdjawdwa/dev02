<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <form method="post" action="/user/register">
          <table align="center">
            <tr>
              <td>姓名</td>
              <td><input type="text" name="name"></td>
            </tr>
            <tr>
              <td>年龄</td>
              <td><input type="text" name="age"></td>
            </tr>
            <tr>
              <td colspan="2" align="center">
                <input type="reset" value="重置">
                <input type="submit" value="注册">
              </td>
            </tr>
          </table>
    </form>
</body>
</html>