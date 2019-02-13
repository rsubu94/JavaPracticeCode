package com.practice.linkedlist;

public class Song {
	private String title;
	private double duration;

	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public double getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Title=" + title + " :: Duration=" + duration + "";
	}

}
