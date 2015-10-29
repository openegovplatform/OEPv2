<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<ul class="nav nav-pills nav-stacked">
	<li role="presentation" class="active">
		<a><%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.waiting") %></a>
	</li>	
	<li role="presentation">
		<a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.waiting.received") %></a>
	</li>	
	<li role="presentation">
		<a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.waiting.canceled") %></a>
	</li>	
	<li role="presentation">
		<a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.newprocessing") %></a>
	</li>	
	<li role="presentation">
		<a><%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.processed") %></a>
	</li>	
	<li role="presentation">
		<a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.processed.received") %></a>
	</li>	
	<li role="presentation">
		<a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "org.oep.core.processmgt.portlet.processdossiermenu.menu.processed.done") %></a>
	</li>	
</ul>