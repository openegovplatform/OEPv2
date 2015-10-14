<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="init.jsp" %>

<portlet:defineObjects />
<portlet:resourceURL var="resourceURL"/>
<portlet:renderURL var="backURL" />

<liferay-ui:header
    backURL="<%= backURL %>"
    title='<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.designer\") %>'
/>

<div id="diagram-builder-bb">
  <div id="diagram-builder-sn"></div>
</div>

<div id="myDiagramContainer">
    <div id="myDiagramBuilder"></div>
</div>

<br/>
<button id="myButton" class="btn primary">Save</button>

<aui:script>
YUI().use(
		  'aui-diagram-builder',
		  function(Y) {

		    var availableFields = [
		      {
		        iconClass: 'diagram-node-start-icon',
		        label: 'Start',
		        type: 'start'
		      },
		      {
		        iconClass: 'diagram-node-task-icon',
		        label: 'Task',
		        type: 'task'
		      },
		      {
		        iconClass: 'diagram-node-state-icon',
		        label: 'State',
		        type: 'state'
		      },
		      {
		        iconClass: 'diagram-node-join-icon',
		        label: 'Join',
		        type: 'join'
		      },
		      {
		        iconClass: 'diagram-node-fork-icon',
		        label: 'Fork',
		        type: 'fork'
		      },
		      {
		        iconClass: 'diagram-node-condition-icon',
		        label: 'Condition',
		        type: 'condition'
		      },
		      {
		        iconClass: 'diagram-node-end-icon',
		        label: 'End',
		        type: 'end'
		      }
		    ];

		    var diagramBuilder = new Y.DiagramBuilder (
		      {
		        availableFields: availableFields,
		        boundingBox: '#diagram-builder-bb',
		        fields: [
		          {
		            name: 'StartNode',
		            type: 'start',
		            xy: [10, 10]
		          },
		          {
		            name: 'Condition',
		            type: 'condition',
		            xy: [260, 16]
		          },
		          {
		            name: 'Fork',
		            type: 'fork',
		            xy: [183, 99]
		          },
		          {
		            name: 'Task1',
		            type: 'task',
		            xy: [38, 158]
		          },
		          {
		            name: 'Task2',
		            type: 'task',
		            xy: [262, 221]
		          },
		          {
		            name: 'Join',
		            type: 'join',
		            xy: [99, 300]
		          },
		          {
		            name: 'State',
		            type: 'state',
		            xy: [287, 377]
		          },
		          {
		            name: 'Task3',
		            type: 'task',
		            xy: [100, 444]
		          },
		          {
		            name: 'EndNode',
		            type: 'end',
		            xy: [326, 500]
		          }
		        ],
		        render: true,
		        srcNode: '#diagram-builder-sn'
		      }
		    );

		    diagramBuilder.connectAll(
		      [
		        {
		          connector: {
		            name: 'TaskConnector1'
		          },
		          source: 'StartNode',
		          target: 'Condition'
		        },
		        {
		          connector: {
		            name: 'TaskConnector2'
		          },
		          source: 'Condition',
		          target: 'Fork'
		        },
		        {
		          connector: {
		            name: 'TaskConnector3'
		          },
		          source: 'Fork',
		          target: 'Task1'
		        },
		        {
		          connector: {
		            name: 'TaskConnector4'
		          },
		          source: 'Fork',
		          target: 'Task2'
		        },
		        {
		          connector: {
		            name: 'TaskConnector5'
		          },
		          source: 'Task1',
		          target: 'Join'
		        },
		        {
		          connector: {
		            name: 'TaskConnector6'
		          },
		          source: 'Task2',
		          target: 'Join'
		        },
		        {
		          connector: {
		            name: 'TaskConnector7'
		          },
		          source: 'Join',
		          target: 'State'
		        },
		        {
		          connector: {
		            name: 'TaskConnector8'
		          },
		          source: 'State',
		          target: 'Task3'
		        },
		        {
		          connector: {
		            name: 'TaskConnector9'
		          },
		          source: 'Task3',
		          target: 'EndNode'
		        }
		      ]
		    );
		  }
		);
</aui:script>
<aui:script>
var Y = YUI({filter: 'raw', lang : 'vi-VN' }).use(
	    'aui-diagram-builder',

	function (Y) {
	    	  var states = ['AL', 'AK', 'AZ', 'AR', 'CA', 'CO', 'CT', 'DE', 'DC', 'FL', 'GA', 'HI', 'ID', 'IL', 'IN', 'IA', 'KS', 'KY', 'LA', 'ME', 'MD', 'MA', 'MI', 'MN', 'MS', 'MO', 'MT', 'NE', 'NV', 'NH', 'NJ', 'NM', 'NY', 'NC', 'ND', 'OH', 'OK', 'OR', 'PA', 'RI', 'SC', 'SD', 'TN', 'TX', 'UT', 'VT', 'VA', 'WA', 'WV', 'WI', 'WY'];
	        var fruitEditor = new Y.DropDownCellEditor(
	        	      {
	        	        editable: true,
	        	        multiple: true,
	        	        options: {
	        	          apple: 'Apple',
	        	          banana: 'Banana',
	        	          cherry: 'Cherry',
	        	          kiwi: 'Kiwi'
	        	        },
	        	        validator: {
	        	          rules: {
	        	            value: {
	        	              required: true
	        	            }
	        	          }
	        	        }
	        	      }
	        	    );
	    Y.DiagramNodeCustom = Y.Component.create({
	        NAME: 'diagram-node',

	        ATTRS: [{
	            type: {
	                value: 'custom'
	            },
	            customAttr: {
	                validator: Y.Lang.isString,
	                value: 'A Custom default'
	            },
	        }, {
	            type: {
	                value: 'custom'
	            },
	            titleAttr: {
	                validator: Y.Lang.isString,
	                value: 'Title'
	            }	        	
	        }, {
	            type: {
	                value: 'custom'
	            },
	            sequenceNoAttr: {
	                validator: Y.Lang.isString,
	                value: 'Sequence Number'
	            }	        	
	        }, {
	            type: {
	                value: 'custom'
	            },
	            daysDurationAttr: {
	                validator: Y.Lang.isString,
	                value: 'Days Duration'
	            }	        	
	        }, {
	            type: {
	                value: 'custom'
	            },
	            doFormAttr: {
	                validator: Y.Lang.isString,
	                value: 'Do Form'
	            }	        	
	        }, {
	            type: {
	                value: 'custom'
	            },
	            formLabelAttr: {
	                validator: Y.Lang.isString,
	                value: 'Form Label'
	            }	        	
	        }, {
	            type: {
	                value: 'custom'
	            },
	            rollbackAttr: {
	                validator: Y.Lang.isString,
	                value: 'Rollback'
	            }	        	
	        }],

	        EXTENDS: Y.DiagramNodeTask,

	        prototype: {
	            initializer: function() {
	                var instance = this;
	                
	                this.SERIALIZABLE_ATTRS.push('customAttr');
	                this.SERIALIZABLE_ATTRS.push('titleAttr');
	                this.SERIALIZABLE_ATTRS.push('sequenceNoAttr');
	                this.SERIALIZABLE_ATTRS.push('daysDurationAttr');
	                this.SERIALIZABLE_ATTRS.push('doFormAttr');
	                this.SERIALIZABLE_ATTRS.push('formLabelAttr');
	                this.SERIALIZABLE_ATTRS.push('rollbackAttr');
	            },
	            
	            getPropertyModel: function () {
	                var instance = this;

	                var model = Y.DiagramNodeTask.superclass.getPropertyModel.apply(instance, arguments);

	                model.push({
	                    attributeName: 'customAttr',
	                    name: 'Custom Attribute',
	                    editor: fruitEditor,
	                    key: 'fruit'
	                });

	                model.push({
	                    attributeName: 'titleAttr',
	                    name: '<%= LanguageUtil.get(pageContext, "org.oep.core.utilities.processmgt.portlet.dossierprocess.designer.dossierstep.title")  %>'
	                });
	                
	                model.push({
	                    attributeName: 'sequenceNoAttr',
	                    name: 'Sequence Number Attribute'
	                });
	                
	                model.push({
	                    attributeName: 'daysDurationAttr',
	                    name: 'Days Duration Attribute'
	                });

	                model.push({
	                    attributeName: 'doFormAttr',
	                    name: 'Do Form Attribute'
	                });
	                
	                model.push({
	                    attributeName: 'formLabelAttr',
	                    name: 'Form Label Attribute'
	                });

	                model.push({
	                    attributeName: 'rollbackAttr',
	                    name: 'Rollback Attribute'
	                });

	                return model;
	            }
	        }
	    });

	    Y.DiagramBuilder.types['custom'] = Y.DiagramNodeCustom;

	    var availableFields = [{
	        iconClass: 'diagram-node-start-icon',
	        label: 'Start',
	        type: 'start'
	    }, {
	        iconClass: 'diagram-node-task-icon',
	        label: 'Task',
	        type: 'task'
	    }, {
	        iconClass: 'diagram-node-custom-icon',
	        label: 'Custom',
	        type: 'custom'
	    }, {
	        iconClass: 'diagram-node-end-icon',
	        label: 'End',
	        type: 'end'
	    }];

	    diagram = new Y.DiagramBuilder({
	        availableFields: availableFields,
	        boundingBox: '#myDiagramContainer',
	        srcNode: '#myDiagramBuilder',
	        locale: '<%= themeDisplay.getLocale().toString() %>'
	    }).render();
	    
	    var CustomConnector = function() {
	    };
	    
	    CustomConnector.ATTRS = {
	        testAttr: {
	            valueFn: function() {
	                return 'test attr instance value';
	            }
	        }
	    };
	    
	    CustomConnector.prototype.initializer = function() {
	        var instance = this;

	        instance.SERIALIZABLE_ATTRS.push('testAttr');
	    };
	    
	    CustomConnector.prototype.getPropertyModel = function() {
	        var instance = this;
	        
	        return [
	            {
	                attributeName: 'testAttr',
	                editor: new Y.TextCellEditor(),
	                name: 'Test Attr'
	            }
	        ];
	    };
	    
	    Y.Base.mix(Y.Connector, [CustomConnector]);
	    
	    Y.one('#myButton').on(
	        'click', 
	        function(event) {
	        	var diagrams = diagram.toJSON();
	        	
	            console.log(diagram.toJSON());
	            AUI().use('aui-io-request', function(A){
	                A.io.request('<%=resourceURL.toString()%>', {
	                	method: 'POST',
	                	data: {
	                		<portlet:namespace />diagram: JSON.stringify(diagrams)
	                	},
	                	on: {
	                		success: function() {
	                			alert(this.get('responseData'));
	                		}
	                	}
	                });
	            });	            
	        }
	    );
	});
</aui:script>