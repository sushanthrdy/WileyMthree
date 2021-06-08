package com.sushanth.task4;

public class CD implements Comparable<CD>{
	private String title;
	private String singer;
	public CD(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int compareTo(CD cd2) {
		return this.singer.compareTo(cd2.singer);
	}
	@Override
	public String toString() {
		return "CD [title=" + title + ", singer=" + singer + "]";
	}
	
	
}
