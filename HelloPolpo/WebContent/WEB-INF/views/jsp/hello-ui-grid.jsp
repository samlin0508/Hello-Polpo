<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html ng-app="HelloPolpo">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="resources/webjars/ui-grid/3.2.5/ui-grid.min.css" rel="stylesheet" type="text/css" />
<style>
	h1 {
		margin:0px;
		margin-top:20px;
		padding:0px;
	}
	.hello-ui-grid {
		margin-top:5px;
	}
</style>
<title>Hello-UI-GRID</title>
</head>
<body>
<div ng-controller="MainCtrl">
	<h1>Using AngularJS - Model Binding</h1>
	<input type="text" ng-model="message" /><label> hello, {{message}}</label>
	<h1>Using AngularJS with JQuery</h1>
    <button id="helloAjax" type="button" ng-click="helloAjax()">helloAjax(open console to see result)</button>
    <h1>Using Powerful AngularJS based UI-GRID</h1>
    <button id="getData" type="button" ng-click="getData()">getData</button>
    <div ui-grid="gridOptions" ui-grid-edit ui-grid-cellNav ui-grid-pinning ui-grid-resize-columns ui-grid-exporter ui-grid-selection ui-grid-pagination ui-grid-move-columns ui-grid-save-state class="hello-ui-grid"></div>
</div>
<script type="text/javascript" src="resources/webjars/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="resources/webjars/angularjs/1.5.8/angular.min.js"></script>
<script type="text/javascript" src="resources/webjars/ui-grid/3.2.5/ui-grid.min.js"></script>
<script type="text/javascript" src="resources/js/hello-ui-grid.js"></script>
</body>
</html>