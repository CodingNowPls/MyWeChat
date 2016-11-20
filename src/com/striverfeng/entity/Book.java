package com.striverfeng.entity;

public class Book {
		private String name;  //图书名称
	    private double price;  //价格
	    private int bookCount; //数量
	    private String author; //作者
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getBookCount() {
			return bookCount;
		}
		public void setBookCount(int bookCount) {
			this.bookCount = bookCount;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
	    

}
