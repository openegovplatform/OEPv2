package org.oep.datamgt.util;

import java.util.List;

import org.oep.datamgt.model.DictData;

public class CustomAUIUtil {

	/* Dau vao danh sach danh muc duoc sap sep theo dang cay 
	 * tra lai ket qua la cay thu muc theo AUI
	 * 
	 * 
	 * */
	public static String getDataTreeView(List<DictData> lstData){
		String[] lui = {"","","","","",""};
	    String kq = "";
	    for (int i = 0; i< lstData.size();i++){ 
	    	DictData data = lstData.get(i);
	    	String child = "";
	    
	    	if (i + 1 < lstData.size() && lstData.get(i+1).getDataLevel() > data.getDataLevel()){
	    		child = "  children: [";
	    		lui[data.getDataLevel()] = "],type : 'normal', leaf: false,},";
	    	}if (i + 1 < lstData.size() && lstData.get(i+1).getDataLevel() == data.getDataLevel()){
	    		child = " leaf: true, },";	
	    	}else if (i + 1 < lstData.size() && lstData.get(i+1).getDataLevel() < data.getDataLevel()){
	    		child = " leaf: true,}";
	    		for (int k = data.getDataLevel() -1; k>= lstData.get(i+1).getDataLevel();k--){
	    			child += lui[k];
	    		}
	    	}
			else if (i  == lstData.size() -1){
	    		child = " leaf: true,}";
	    		for (int k = data.getDataLevel() -1; k > 0;k--){
	    			child += lui[k];
	    		}
	    	}
	     	kq += "{ " + "expanded: false,  label: '" + data.getTitle() + "', id: '" + data.getDataCode() + "',"+ child;	 
		}
	    return kq;
	}
}
