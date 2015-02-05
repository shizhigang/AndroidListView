package com.sw.androidlistview.entity;

public class Attachments {
	 private String url;
	 private String mime;
	 private int width;
	 private int height;
	 private String thumb;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMime() {
		return mime;
	}
	public void setMime(String mime) {
		this.mime = mime;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	@Override
	public String toString() {
		return "Attachments [url=" + url + ", mime=" + mime + ", width="
				+ width + ", height=" + height + ", thumb=" + thumb + "]";
	}
	 
}
