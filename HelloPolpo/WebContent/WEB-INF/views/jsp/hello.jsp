<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html ng-app="HelloPolpo">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="resources/webjars/ui-grid/3.2.5/ui-grid.min.css" rel="stylesheet" type="text/css" />
<title>Hello</title>
</head>
<body>
${ hello }
<div ng-controller="MainCtrl">
    <button id="helloAjax" type="button" ng-click="helloAjax()">helloAjax</button>
    <div ui-grid="gridOptions" ui-grid-edit ui-grid-cellNav ui-grid-pinning ui-grid-resize-columns ui-grid-exporter ui-grid-selection ui-grid-pagination ui-grid-move-columns ui-grid-save-state></div>
</div>
<script type="text/javascript" src="resources/webjars/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="resources/webjars/angularjs/1.5.8/angular.min.js"></script>
<script type="text/javascript" src="resources/webjars/ui-grid/3.2.5/ui-grid.min.js"></script>
<script type="text/javascript" src="resources/js/hello.js"></script>
</body>
</html>