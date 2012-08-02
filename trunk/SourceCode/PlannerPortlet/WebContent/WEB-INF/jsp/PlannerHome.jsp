<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet"%>
<%@ taglib prefix="portlet2" uri="http://java.sun.com/portlet_2_0"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="javax.portlet.PortletSession"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<jsp:include page="header.jsp"></jsp:include>
<portlet2:defineObjects />
<portlet:defineObjects />
<script type="text/javascript">
	$(function() {
		$("#radio").buttonset();
		$("#format").buttonset();
		$("input:submit, a, button", ".demo").button();
		$("a", ".demo").click(function() {
			return false;
		});

		// run the currently selected effect
		function runEffect() {
			// get effect type from 
			var selectedEffect = $("#effectTypes").val();

			// most effect types need no options passed by default
			var options = {};
			// some effects have required parameters
			if (selectedEffect === "scale") {
				options = {
					percent : 100
				};
			} else if (selectedEffect === "size") {
				options = {
					to : {
						width : 280,
						height : 185
					}
				};
			}

			// run the effect
			$("#effect").show(selectedEffect, options, 500, callback);
		}
		;

		//callback function to bring a hidden box back
		function callback() {
			setTimeout(function() {
				$("#effect:visible").removeAttr("style").fadeOut();
			}, 1000);
		}
		;

		// set effect from select menu value
		$("#button").click(function() {
			runEffect();
			return false;
		});

		$("#effect").hide();
	});
	// sort
	function fnFeaturesInit() {
		/* Not particularly modular this - but does nicely :-) */
		$('ul.limit_length>li').each(function(i) {
			if (i > 10) {
				this.style.display = 'none';
			}
		});

		$('ul.limit_length').append('<li class="css_link">Show more<\/li>');
		$('ul.limit_length li.css_link').click(function() {
			$('ul.limit_length li').each(function(i) {
				if (i > 5) {
					this.style.display = 'list-item';
				}
			});
			$('ul.limit_length li.css_link').css('display', 'none');
		});
	}
</script>
<script type="text/javascript">
	$(document).ready(function() {
		fnFeaturesInit();
		$('#projectTable').dataTable({
			"bFilter" : true,
			"bSort" : true,
			"bJQueryUI" : true,
			"sPaginationType" : "full_numbers"
		});
	});
</SCRIPT>
</head>
<body id="portal" class="up fl-theme-mist">
  <div class="container" id="portalPageBodyInner">
    <div class="content">
      <table border="0">
        <tr>
          <td><strong>User: </strong></td>
          <td><strong><font color="#1490E3"><%=portletSession.getAttribute("USER", PortletSession.APPLICATION_SCOPE)%></font></strong></td>
          <td><strong>Joined Project: </strong></td>
          <td><strong><font color="#1490E3">${projectList.size()}</font></strong></td>
        </tr>
      </table>
      <p></p>
      <c:if test="${not empty projectList}">
        <table id="projectTable" class="display dataTable" ellpadding="0" cellspacing="0" border="0" align="center">
          <thead>
            <tr>
              <th width="5%">No.</th>
              <th width="15%">Project Code</th>
              <th width="80%">Project Name</th>
            </tr>
          </thead>
          <tbody>
            <c:set var="count" value="0" />
            <c:forEach var="project" items="${projectList}">
              <c:set var="count" value="${count + 1}" />
              <portlet:renderURL var="renderAction">
                <portlet:param name="action" value="taskmanager" />
                <portlet:param name="projectId" value="${project.projectId}" />
              </portlet:renderURL>
              <tr>
                <td>${count}</td>
                <td scope="row"><a href="${renderAction}">${project.code}</a></td>
                <td scope="row"><a href="${renderAction}">${project.name}</a></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </c:if>
      <c:if test="${empty projectList}">
        You haven't jointed any projects.
    </c:if>

    </div>
  </div>

</body>
</html>