package com.biz.exam.domain;

public class BBsVO {
	
	private int seq;
	private int date;
	private String auth;
	private String subject;
	private String text;
	private int count;
	
	public BBsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BBsVO(int seq, int date, String auth, String subject, String text, int count) {
		super();
		this.seq = seq;
		this.date = date;
		this.auth = auth;
		this.subject = subject;
		this.text = text;
		this.count = count;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "BBsVO [seq=" + seq + ", date=" + date + ", auth=" + auth + ", subject=" + subject + ", text=" + text
				+ ", count=" + count + "]";
	}
	
	

}
