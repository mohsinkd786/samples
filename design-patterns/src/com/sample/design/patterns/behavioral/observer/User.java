package com.sample.design.patterns.behavioral.observer;

public class User implements Listener {

	private String article;
	private Subject blog;

	public void setSubject(Subject blog) {
		this.blog = blog;
		article = "Sample Article";
		
	}

	@Override
	public void update() {
		System.out.println("State change reported by Subject.");
		article = (String) blog.getUpdate();
	}

	public String getArticle() {
		return article;
	}
}