<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>websocket demo</title>
    <jsp:include page="common.jsp"/>
    <link href="../css/websocket.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript" src="../js/websocket.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <button id="start" type="button" class="btn btn-primary">开始</button>
        </div>
        <div class="col-md-4"></div>
    </div>
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <input  id="message" type="text" class="form-control" placeholder="你好，亲爱的！" aria-describedby="basic-addon1">
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
</body>
</html>
