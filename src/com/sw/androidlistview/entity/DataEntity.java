package com.sw.androidlistview.entity;

import java.util.List;

public class DataEntity {
	   private int total;
	  private int per_page;
	  private String current_page;
	  private int last_page;
	  private List<Data> data;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public String getCurrent_page() {
		return current_page;
	}
	public void setCurrent_page(String current_page) {
		this.current_page = current_page;
	}
	public int getLast_page() {
		return last_page;
	}
	public void setLast_page(int last_page) {
		this.last_page = last_page;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "DataEntity [total=" + total + ", per_page=" + per_page
				+ ", current_page=" + current_page + ", last_page=" + last_page
				+ ", data=" + data + "]";
	}
	  
	  
}
