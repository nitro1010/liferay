<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/common/init.jsp" %>

<html dir="<liferay-ui:message key="lang.dir" />">

<head>
	<meta content="<%= ContentTypes.TEXT_HTML_UTF8 %>" http-equiv="content-type" />
	<meta content="no-cache" http-equiv="Cache-Control" />
	<meta content="no-cache" http-equiv="Pragma" />
	<meta content="0" http-equiv="Expires" />
	<script src="<%= themeDisplay.getPathJavaScript() %>/misc/xp_progress.js" type="text/javascript"></script>
</head>

<body onLoad="location.href = '<%= themeDisplay.getPathMain() %>/portal/protected';">

<center>

<table border="0" cellpadding="0" cellspacing="0" height="100%" width="600">
<tr>
	<td align="center" valign="middle">
		<strong><liferay-ui:message key="processing-login" /></strong>

		<br /><br />

		<script type="text/javascript">
			var progressBar = createBar(300, 15, "#FFFFFF", 1, "#000000", "", 85, 7, 3, "");
		</script>
	</td>
</tr>
</table>

</center>

</body>

</html>