<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试同异步</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"asyncServlet",
                    data:{"flag":"first"},
                    type:"post",
                    async:false,
                    dataType:"text",
                    success:function (obj) {
                        var html = "<div style='background-color: red'>"+obj+"</div>";
                        $("body").append(html);
                    }
                });
                $.ajax({
                    url:"asyncServlet",
                    data:{"flag":"second"},
                    type:"post",
                    async:true,
                    dataType:"text",
                    success:function (obj) {
                        var html = "<div style='background-color: green'>"+obj+"</div>";
                        $("body").append(html);
                    }
                });
            });
        })
    </script>
</head>
<body>
<input type="button" value="测试同异步" id="btn">
</body>
</html>
