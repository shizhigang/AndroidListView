package com.sw.androidlistview.entity;

import java.util.List;

public class Data {
	  private String content;
	  private int group_id;
	  private boolean stickied;
	  private String created_at;
	  private int id;
	  private int up;
	  private int total_replies;
	  private int visits;
	  private Author author;
	  private Group group;
	  private List<Replies> replies;
	  private List<Attachments> attachments;
	  private List<Last_up_users> last_up_users;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public boolean isStickied() {
		return stickied;
	}
	public void setStickied(boolean stickied) {
		this.stickied = stickied;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public int getTotal_replies() {
		return total_replies;
	}
	public void setTotal_replies(int total_replies) {
		this.total_replies = total_replies;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public List<Replies> getReplies() {
		return replies;
	}
	public void setReplies(List<Replies> replies) {
		this.replies = replies;
	}
	public List<Attachments> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Attachments> attachments) {
		this.attachments = attachments;
	}
	public List<Last_up_users> getLast_up_users() {
		return last_up_users;
	}
	public void setLast_up_users(List<Last_up_users> last_up_users) {
		this.last_up_users = last_up_users;
	}
	@Override
	public String toString() {
		return "Data [content=" + content + ", group_id=" + group_id
				+ ", stickied=" + stickied + ", created_at=" + created_at
				+ ", id=" + id + ", up=" + up + ", total_replies="
				+ total_replies + ", visits=" + visits + ", author=" + author
				+ ", group=" + group + ", replies=" + replies
				+ ", attachments=" + attachments + ", last_up_users="
				+ last_up_users + "]";
	}
	  
}
