<%--
  Created by IntelliJ IDEA.
  User: solverpeng
  Date: 2017/2/26
  Time: 11:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>UserList</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.5.1.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/table.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/list.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/css.css">
    <script type="text/javascript">
        $(function() {
            $("#submit-btn").click(function() {
                $("#condition-form").submit();
                return false;
            });
        })
    </script>
</head>
<body>
<div class="w1200">
    <div class="list-screen">
        <div class="screen-top" style="position:relative;">
            <form id="condition-form" action="userServlet?pageNoStr=${page.pageNo}" method="post">
                <span>ID<input type="text" class="ju-adress" name="id" value="${param.id}"/></span>
                <span>用户姓名<input type="text" class="ju-name" name="userName"  value="${param.userName}"/></span>
                <button id="submit-btn">搜索</button>
            </form>
        </div>
    </div>
    <table id="table" class="bordered">
        <tr>
            <th>ID</th>
            <th>姓名</th>
        </tr>
        <c:if test="${!empty page.list}">
            <c:forEach items="${page.list}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
    <div style="margin: 10px auto;">
        <c:if test="${page.hasPrev}">
            <a href="userServlet?pageNoStr=1">首页</a>
            <a href="userServlet?pageNoStr=${page.prev}">上一页</a>
        </c:if>
        共${page.totalPageNo }页&nbsp;当前是第${page.pageNo }页&nbsp;共${page.totalRecord}条记录
        <c:if test="${page.hasNext}">
            <a href="userServlet?pageNoStr=${page.next}">下一页</a>
            <a href="userServlet?pageNoStr=${page.totalPageNo}">末页</a>
        </c:if>
    </div>
    <%--<div class="yahoo">
        <span <c:if test="${!page.hasPrev}">class="disabled"</c:if>> <a href="userServlet?pageNoStr=${page.prev}"><</a> </span>
        <span class="current"><a href="userServlet?pageNoStr=${page.pageNo }">${page.pageNo }</a></span>
        <c:if test="${!page.hasNext}">
            <a href="userServlet?pageNoStr=${page.pageNo + 1}">${page.pageNo + 1}</a>
        </c:if>
        <c:if test="${!page.hasPrev}">
            <a href="userServlet?pageNoStr=${page.pageNo - 1}">${page.pageNo - 1}</a>
        </c:if>
        <span <c:if test="${!page.hasNext}">class="disabled"</c:if>><a href="userServlet?pageNoStr=${page.next}"> > </a></span>
    </div>--%>
</div>
</body>
</html>
