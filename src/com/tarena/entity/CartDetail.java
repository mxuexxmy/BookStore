package com.tarena.entity;

import java.util.Date;

public class CartDetail {
	 private String isbn; // 'ͼ����',
	 private String title;//'���⣨������',
	 private String author;// '����',
	 private double price;// '�۸�',
	 private String press;//'������',
	 private int edition;//'���',
	 private int count;//����
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "CartDetail [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", press="
				+ press + ", edition=" + edition + ", count=" + count + "]";
	}
}
