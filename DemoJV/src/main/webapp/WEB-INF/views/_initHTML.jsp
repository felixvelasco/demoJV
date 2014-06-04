<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<script type="text/javascript" src="resources/javascript/HTMLRenderer.js"></script>
<link href="resources/css/HTMLRenderer.css" rel="stylesheet"/>

<form action="${flowExecutionUrl}" method="post">
ANI: <input type="text" name="ani"><br>
DNIS: <input type="text" name="dnis">
<input type="hidden" name="_eventId" value="success">
<input type="submit" value="Submit">
</form>