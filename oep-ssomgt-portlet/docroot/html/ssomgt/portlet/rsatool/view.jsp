<%--
/**
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 --%>
<%@ include file="/html/ssomgt/portlet/rsatool/init.jsp" %>
<%
	String tab = ParamUtil.getString(request, "TAB", "tab-autogenerate");
%>
<portlet:renderURL var="changeTabAutogenerateUrl">
	<portlet:param name="TAB" value="tab-autogenerate" />
</portlet:renderURL>
<portlet:renderURL var="changeTabPHPKeyUrl">
	<portlet:param name="TAB" value="tab-phpkey" />
</portlet:renderURL>
<portlet:renderURL var="changeTabDotNetKeyUrl">
	<portlet:param name="TAB" value="tab-dotnetkey" />
</portlet:renderURL>

<portlet:resourceURL var="resourceURL"/>
<c:set var="tab" scope="page" value="<%= tab %>"/>
<aui:form name="publicKeyForm" enctype="multipart/form-data">
	<ul class="nav nav-tabs">
		<%
			if ("tab-autogenerate".equals(tab)) {
		%>
		<li role="presentation" class="active" id="tab-autogenerate">
			<a href="#" onclick="location.href='<%= changeTabAutogenerateUrl %>';return false;"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.tab.autogenerate"></liferay-ui:message> </a>
		</li>
		<%
			}
			else {
		%>
		<li role="presentation" id="tab-autogenerate">
			<a href="#" onclick="location.href='<%= changeTabAutogenerateUrl %>';return false;"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.tab.autogenerate"></liferay-ui:message> </a>
		</li>
		<%
			}
		%>
		<%
			if ("tab-phpkey".equals(tab)) {
		%>
		<li role="presentation" class="active" id="tab-phpkey">
			<a href="#" onclick="location.href='<%= changeTabPHPKeyUrl %>';return false;"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.tab.phpkey"></liferay-ui:message> </a>
		</li>
		<%
			}
			else {
		%>
		<li role="presentation" id="tab-phpkey">
			<a href="#" onclick="location.href='<%= changeTabPHPKeyUrl %>';return false;"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.tab.phpkey"></liferay-ui:message> </a>
		</li>
		<%
			}
		%>
		<c:choose>
			<c:when test="${ tab eq 'tab-dotnetkey' }">
				<li role="presentation" class="active" id="tab-dotnetkey">
					<a href="#" onclick="location.href='<%= changeTabDotNetKeyUrl %>';return false;"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.tab.dotnetkey"></liferay-ui:message> </a>
				</li>
			</c:when>
			<c:otherwise>
				<li role="presentation" id="tab-dotnetkey">
					<a href="#" onclick="location.href='<%= changeTabDotNetKeyUrl %>';return false;"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.tab.dotnetkey"></liferay-ui:message> </a>
				</li>
			</c:otherwise>
		</c:choose>
	</ul>
	<c:if test="${ tab eq 'tab-autogenerate' }">
		<div class="form-group">
			<aui:row>
				<aui:column columnWidth="100">
					<aui:input style="width: 100%" name="PUBLICKEY" id="PUBLICKEY" type="text" label="org.oep.ssomgt.portlet.rsatool.label.publickey">
					</aui:input>
				</aui:column>
			</aui:row>
			<aui:row>
				<aui:column columnWidth="100">
					<aui:input style="width: 100%" name="PRIVATEKEY" id="PRIVATEKEY" type="text" label="org.oep.ssomgt.portlet.rsatool.label.privatekey">
					</aui:input>
				</aui:column>
			</aui:row>	
			<aui:row>
				<aui:column columnWidth="50">
					<a onclick="callGenerate()" href="#" id="btngenerate" class="btn btn-primary" title="<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.rsatool.label.generate") %>"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.generate" /></a>
				</aui:column>
				<aui:column columnWidth="50"></aui:column>
			</aui:row>	
		</div>
	</c:if>
	<c:if test="${ tab eq 'tab-phpkey' }">
		<div class="form-group">
			<aui:row>
				<aui:column columnWidth="100">
					<aui:input style="width: 100%;" label="org.oep.ssomgt.portlet.rsatool.label.phppublickey" name="PHPPUBLICKEY" id="PHPPUBLICKEY" type="text"></aui:input>
				</aui:column>
			</aui:row>
			<aui:row>
				<aui:column columnWidth="50">
					<aui:input style="width: 100%;" type="file" name="PHPFILE" label="org.oep.ssomgt.portlet.rsatool.label.phpfile"></aui:input>					
				</aui:column>
			</aui:row>
			<aui:row>
				<aui:column columnWidth="50">
					<a href="#" id="btnphpkey" class="btn btn-primary" title="<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.rsatool.label.phpkey") %>"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.phpkey" /></a>
				</aui:column>
				<aui:column columnWidth="50"></aui:column>
			</aui:row>	
		</div>	
	</c:if>
	<c:if test="${ tab eq 'tab-dotnetkey' }">
		<div class="form-group">
			<aui:row>
				<aui:column columnWidth="100">
					<aui:input style="width: 100%;" label="org.oep.ssomgt.portlet.rsatool.label.dotnetpublickey" name="DOTNETPUBLICKEY" id="DOTNETPUBLICKEY" type="text"></aui:input>
				</aui:column>
			</aui:row>
			<aui:row>
				<aui:column columnWidth="50">
					<aui:input style="width: 100%;" type="file" name="DOTNETFILE" label="org.oep.ssomgt.portlet.rsatool.label.dotnetfile"></aui:input>					
				</aui:column>
			</aui:row>
			<aui:row>
				<aui:column columnWidth="50">
					<a href="#" id="btndotnetkey" class="btn btn-primary" title="<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.rsatool.label.dotnetkey") %>"><liferay-ui:message key="org.oep.ssomgt.portlet.rsatool.label.dotnetkey" /></a>
				</aui:column>
				<aui:column columnWidth="50"></aui:column>
			</aui:row>			
		</div>
	</c:if>
</aui:form>
<portlet:resourceURL id="UPLOADPHP_FILE" var="uploadPHPFileUrl"></portlet:resourceURL>
<portlet:resourceURL id="PHPPUBLICKEY" var="phpPublicKeyUrl"></portlet:resourceURL>
<portlet:resourceURL id="UPLOADDOTNET_FILE" var="uploadDotNetFileUrl"></portlet:resourceURL>
<portlet:resourceURL id="DOTNETPUBLICKEY" var="dotNetPublicKeyUrl"></portlet:resourceURL>

<aui:script>
function callGenerate() {
    AUI().use('aui-io-request', function(A) {
        A.io.request('<%=resourceURL.toString()%>', {
        	method: 'post',
        	dataType: 'json',
        	on: {
        		success: function() {
        			A.one("#<portlet:namespace/>PUBLICKEY").set('value', this.get('responseData').publicKey);
        			A.one("#<portlet:namespace/>PRIVATEKEY").set('value', this.get('responseData').privateKey);
        		}
        	}
        });
    });
}
AUI().use(
	'aui-io-request',
	function(A) {
		var btnPHPKey = A.one("#btnphpkey");
		function uploadPHPFile(event) {
		    event.preventDefault();
	        var publicKeyForm = A.one("#<portlet:namespace/>publicKeyForm");
	        var ajaxURL = "<%= uploadPHPFileUrl.toString() %>";
	            
	        A.io.request(ajaxURL, {
	        	method: 'post',
	        	dataType: 'json',
	            form: {
	            	id: publicKeyForm,
	                upload: true
	            },
	            sync: true,
	            on: {
	            	complete: function(id, o, args) {
						displayPHPPublicKey();
	            	}
	            }	        	
	        });
		}	
		
		function displayPHPPublicKey() {       
            var ajaxURL = "<%= phpPublicKeyUrl.toString() %>";
            var phpPublicKey = A.one("#<portlet:namespace/>PHPPUBLICKEY");
            
            A.io.request(ajaxURL, {
	        	dataType: 'json',
                on: {
                    success: function(){
                        var response = this.get("responseData");
                        phpPublicKey.set("value", response.publicKey);
                    }
                }            	
            });
        }
		
		if (btnPHPKey != null) {
			btnPHPKey.on("click", uploadPHPFile);
		}
	}
);

AUI().use(
		'aui-io-request',
		function(A) {
			var btnDotNetKey = A.one("#btndotnetkey");
			function uploadDotNetFile(event) {
			    event.preventDefault();
		        var publicKeyForm = A.one("#<portlet:namespace/>publicKeyForm");
		        var ajaxURL = "<%= uploadDotNetFileUrl.toString() %>";
		            
		        A.io.request(ajaxURL, {
		        	method: 'post',
		        	dataType: 'json',
		            form: {
		            	id: publicKeyForm,
		                upload: true
		            },
		            sync: true,
		            on: {
		            	complete: function(id, o, args) {
							displayDotNetPublicKey();
		            	}
		            }	        	
		        });
			}	
			
			function displayDotNetPublicKey() {       
	            var ajaxURL = "<%= dotNetPublicKeyUrl.toString() %>";
	            var dotNetPublicKey = A.one("#<portlet:namespace/>DOTNETPUBLICKEY");
	            
	            A.io.request(ajaxURL, {
		        	dataType: 'json',
	                on: {
	                    success: function(){
	                        var response = this.get("responseData");
	                        dotNetPublicKey.set("value", response.publicKey);
	                    }
	                }            	
	            });
	        }
			
			if (btnDotNetKey != null) {
				btnDotNetKey.on("click", uploadDotNetFile);
			}
		}
	);
</aui:script>