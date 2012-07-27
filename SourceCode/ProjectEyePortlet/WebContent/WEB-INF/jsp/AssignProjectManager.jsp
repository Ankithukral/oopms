<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<portlet:defineObjects />
<link rel="icon" href="https://c15027075.ssl.cf2.rackcdn.com/favicon.ico" type="image/x-icon"/>
<link type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/screen.css" rel="Stylesheet" />
<link type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/ui-lightness/jquery-ui-1.8.21.custom.css" rel="Stylesheet" />	
<link type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/common.css" rel="Stylesheet" />	
<link type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/uportal.css" rel="Stylesheet" />
<link rel="stylesheet" type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/print.css" media="print"/>
<link rel="stylesheet" type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/manage.css" media="all"/>				
<link rel="stylesheet" type="text/css" href="/<spring:message code="app.context"/>/resource_files/css/datepicker.css" media="all"/>
<link rel="fluid-icon" href="https://c15027075.ssl.cf2.rackcdn.com/images/apple-touch-icon-114x114.png"/>
<script type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/js/jquery-ui-1.8.21.custom.min.js"></script>
<script type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/js/form-elements.js"></script>
<script type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/css/ga.js"></script>
<script language="javascript" type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/css/jquery.js"></script>
<script language="javascript" type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/css/jquery.cookie.js"></script>
<script language="javascript" type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/css/default.js"></script>
<script language="javascript" type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/css/manage.js"></script>
<script language="javascript" type="text/javascript" src="/<spring:message code="app.context"/>/resource_files/common.js"></script>
<meta name="robots" content="noindex, nofollow"/>

<title>Assign Project Manager</title>	
</head>

<body id="portal" class="up fl-theme-mist">

<div id="portalPageBodyInner" class="container">

  <div class="content">
  
  <!-- begin .navigator -->
	<jsp:include page="Nagivator.jsp" />
	<!-- end .navigator -->
  
   <div class="fl-widget-titlebar titlebar portlet-titlebar" role="sectionhead">
    	<h2 class="title" >Assign Project Manager</h2>
    </div>
	
	<portlet:actionURL var="searchAction">
  <portlet:param name="action" value="SearchUserToAddProjectManager" />
  <portlet:param name="projectId" value="${projectId}" />
</portlet:actionURL>
<portlet:renderURL var="renderAction">
            	<portlet:param name="action" value="GoProjectDetail" />
            	<portlet:param name="projectId" value="${projectId}" />
            </portlet:renderURL>
<form:form name="${portletNamespace}AssignProjectManager" commandName="AssignProjectManagerForm" method="post" action="${formAction}">
	<table class="portlet-table">
	<c:if test="${not empty projectTeamList}">
   <tbody><tr >
        <th width="5%" scope="row">No</th>    
        <th width="30%" scope="row">Name</th>
        <th width="20%" scope="row">Account</th>
        <th width="20%" scope="row">Member Role</th>
        <th width="25%" scope="row">Action</th>
    </tr>  
        <c:forEach var="user" items="${projectTeamList}" varStatus="count">
            <tr>
            <portlet:renderURL var="renderAction2">
            	<portlet:param name="action" value="ChangeProjectManager" />
            	<portlet:param name="projectId" value="${projectId}" />
            	<portlet:param name="userId" value="${user.userId}" />
            </portlet:renderURL>
               <td scope="row">${count.count}</td>
               <td scope="row">${user.userName}</td>
               <td scope="row">${user.userAccount}</td>
               <td scope="row">${user.userRoleString}</td>
               <td scope="row">
				<button type="button" class="button blue small" onclick='submitAction("${portletNamespace}AssignProjectManager", "${renderAction2}")'>Set this User to Project Manager</button>
               <c:if test="${(user.userRole) == 1 || (user.userRole == 0)} ">
               		This user is already Project Manager
               	</c:if>
               <c:if test="${(user.userRole != 1) && (user.userRole != 0)} ">
               		<button type="button" class="button blue small" onclick='submitAction("${portletNamespace}AssignProjectManager", "${renderAction2}")'>Set this User to Project Manager</button>
               	</c:if>
               </td>                            
            </tr>
        </c:forEach>
   </tbody>
	</c:if>
	</table>
	<br/><button type="button" class="button blue small" onclick='submitAction("${portletNamespace}AssignProjectManager", "${renderAction}")'>Back</button>
</form:form>
  <!-- end .content --></div>
  <!-- end .container --></div>
</body>
</html>