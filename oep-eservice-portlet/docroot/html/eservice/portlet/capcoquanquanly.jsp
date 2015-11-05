<%@ include file="/html/eservice/init.jsp"%>

<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.model.DictData"%>

<%
	ServiceContext serviceContext = ServiceContextThreadLocal
			.getServiceContext();

	List<DictData> lstDomainData = DictDataLocalServiceUtil
			.getByCollectionNameDataLevel("OEP_DOSSIER_ADMINISTRATION",
					1, serviceContext);
	//long myDomainNoEvent
%>

<ul>
	<%
			//DictDataLocalServiceUtil.getByCollectionName("OEP_DOSSIER_DOMAIN", serviceContext);
					for (DictData data : lstDomainData) {
						
		%>
	<portlet:actionURL var="dangKyUrl" name="myAdministrationNoEvent">
		<portlet:param name="administrationNo"
			value="<%=data.getDataCode() %>" />
		<portlet:param name="tabs1" value="two" />
	</portlet:actionURL>
	<li><a href = "#" onclick="return theFunction(<%=data.getDataCode()%>);">
			<%= data.getTitle() %>
		</a></li>
	<%
			}
		%>

</ul>
<portlet:resourceURL var="getUserData">
</portlet:resourceURL>
<aui:script>
function theFunction (value) {
	//alert(value);
	$.ajax({
		  url:'<%=getUserData%>',
		  dataType: "json",
		  data:{administrationNo: value },
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
}
 
</aui:script>

