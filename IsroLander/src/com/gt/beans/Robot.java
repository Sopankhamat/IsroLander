package com.gt.beans;

public class Robot {
	private String id;
	private String name;
	private String chip;
	public Robot(String id, String name, String chip) {
		super();
		this.id = id;
		this.name = name;
		this.chip = chip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", chip=" + chip + "]";
	}
	
}
