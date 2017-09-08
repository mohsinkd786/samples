package com.sample.design.patterns.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Blog blog = new Blog();
		User user1 = new User();
		User user2 = new User();

		Button button = new Button();
		Button button1 = new Button();

		MyListener list = new MyListener();
		MyListener list1 = new MyListener();

		button.addListener(list);
		button1.addListener(list1);
		
		list.addEvent(button);
		list1.addEvent(button);
		
		button.onClick();
		
		list1.onClick();
		
		
		
		
		
		
		
		//blog.registerObserver(user1);

		//blog.registerObserver(user2);

		//user1.setSubject(blog);
		//user2.setSubject(blog);

		//System.out.println(user1.getArticle());
		//blog.postNewArticle();
		//System.out.println(user1.getArticle());
	}
}
