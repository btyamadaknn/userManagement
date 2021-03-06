<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width" />
<script type="text/javascript">
    
</script>
<c:set var="titleKey">
  <tiles:insertAttribute name="title" ignore="true" />
</c:set>
<title><spring:message code="${titleKey}" text="userManagement" /></title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
  <div id="menu">
    <tiles:insertAttribute name="menu" />
  </div>
  <div id="countainer">
    <tiles:insertAttribute name="body" />
  </div>
</body>
</html>