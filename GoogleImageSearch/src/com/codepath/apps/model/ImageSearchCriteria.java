package com.codepath.apps.model;

import java.io.Serializable;

public class ImageSearchCriteria implements Serializable{
	
	private static final long serialVersionUID = 1516213431295436647L;
	private String size;
	private String color;
	private String type;
	private String site;
	
	public ImageSearchCriteria(String size, String color, String type,
			String site) {
		super();
		this.size = size;
		this.color = color;
		this.type = type;
		this.site = site;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
}