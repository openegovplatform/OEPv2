<%@ include file="/html/eservice/init.jsp"%>

<%@ page import="org.oep.datamgt.util.CustomAUIUtil"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.model.DictData"%>

<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	    
	List<DictData> lstData = DictDataLocalServiceUtil.getByCollectionNameTree("OEP_DOSSIER_DOMAIN",1, serviceContext);
    String kq = CustomAUIUtil.getDataTreeView(lstData);
	//List<DictData> lstDictData = DictDataLocalServiceUtil.getByCollectionName("OEP_DOSSIER_DOMAIN", serviceContext);
		//for (DictData data : lstDomainData) {
	
	System.out.println(kq);
%>
<portlet:actionURL var="dangKyUrl" name="myDomainNoEvent">
	<portlet:param name="tabs1" value="one" />
</portlet:actionURL>


<portlet:resourceURL var="getUserData">
</portlet:resourceURL>
<script>
	var data1 = [
<%=kq%>
	];
</script>
<i class="none"></i>
<div id="myTreeView"></div>
<aui:script>
	YUI().use(
			'aui-tree-view',
			function(Y) {
				//var portletURL = '<%= dangKyUrl %>'
				var orgTree = new Y.TreeViewDD({
					boundingBox : '#myTreeView',
					type : 'normal',
					children : data1
				}).render();
				orgTree.after("lastSelectedChange", function(event) {
					//alert(event.newVal.get('id'));
					//var portletURL = '<%= dangKyUrl %>';
					var value = event.newVal.get('id');
					//portletURL.setParameter("domainNo", value);
					//portletURL = portletURL + '&_'
					//		+ '<%=themeDisplay.getPortletDisplay().getId() %>'
					//		+ '_domainNo=' + value;
					//ajaxCall(portletURL);
					//
					//createRenderURL(value)
					//back(portletURL);
					//callServeResource(portletURL);
					
					$.ajax({
						  url:'<%=getUserData%>',
						  dataType: "json",
						  data:{domainNo: value },
						  type: "get",
						  success: function(data){
						  Liferay.fire('getUserData', {userData:data});
						  },
						  beforeSend: function(){
						  //before send this method will be called
							//  alert(value)
						  },
						  complete: function(){
						  //after completed request then this method will be called.
						  	// alert('hello 1')
						  },
						  error: function(){
						  $('#userContent').html('<span style="color:red">Connection problems</span>');
						  }
						  });
				});
			});
</aui:script>