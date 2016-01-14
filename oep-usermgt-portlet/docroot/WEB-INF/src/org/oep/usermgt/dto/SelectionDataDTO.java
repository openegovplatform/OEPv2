package org.oep.usermgt.dto;

public class SelectionDataDTO {
	
	private long id;
	private String name;
	private int level;
	private long parent;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public long getParent() {
		return parent;
	}
	public void setParent(long parent) {
		this.parent = parent;
	}
	
	public String getNameForLevel(){
		String[] tg = {"","&nbsp; &nbsp;",
				"&nbsp; &nbsp; &nbsp; &nbsp;",
				"&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;",
				"&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ",
				"&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; "};
		return tg[level] + name;
	}
	
	
}
