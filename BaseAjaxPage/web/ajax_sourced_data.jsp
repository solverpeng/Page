<%--
  Created by IntelliJ IDEA.
  User: solverpeng
  Date: 2017/2/27 0027
  Time: 18:22
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AjaxSourcedData</title>
    <link rel="stylesheet" href="styles/jquery.dataTables.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
    <style type="text/css">
        tfoot input {
            width: 100%;
            padding: 3px;
            box-sizing: border-box;
        }
    </style>
    <script>
        $(document).ready(function () {
            // Setup - add a text input to each footer cell
            $('#example').find('tfoot th').each(function () {
                var title = $(this).text();
                $(this).html('<input type="text" placeholder="Search ' + title + '" />');
            });

            var table = $('#example').DataTable({
                "ajax": {
                    "url": "${pageContext.request.contextPath}/AjaxServlet",
                    "dataSrc": ""
                },
                "columns": [
                    {"data": "name"},
                    {"data": "position"},
                    {"data": "office"},
                    {"data": "extn"},
                    {"data": "startDate"},
                    {"data": "salary"}
                ]
            });

            table.columns().every(function () {
                var that = this;

                $('input', this.footer()).on('keyup change', function () {
                    if (that.search() !== this.value) {
                        that
                            .search(this.value)
                            .draw();
                    }
                });
            });
        });
    </script>
</head>
<body style="width: 900px;">
<table id="example" class="display" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>extn</th>
        <th>Start date</th>
        <th>Salary</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>extn</th>
        <th>Start date</th>
        <th>Salary</th>
    </tr>
    </tfoot>
</table>
</body>
</html>