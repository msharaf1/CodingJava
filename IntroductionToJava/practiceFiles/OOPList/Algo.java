package helloWorld;

import java.util.ArrayList;
import java.util.Date;

public class Algo {
	private String fullName;
	private Date startWork;
	private String DoB;
	private Double cashInHand;
	private String[] publishedBooks;
	private ArrayList<Integer> serials;
	
	public Algo() {
		
	}
	
	public void setStartWork(Date startWork) {
		this.startWork = startWork;
	}
	public Date getStartWork() {
		return this.startWork;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		DoB = doB;
	}
	public Double getCashInHand() {
		return cashInHand;
	}
	public void setCashInHand(Double cashInHand) {
		this.cashInHand = cashInHand;
	}
	public String getPublishedBooks() {
		String bookList = "";
		for(int i = 0; i < publishedBooks.length; i++) {
//			System.out.println(publishedBooks[i]);
			bookList += " " + publishedBooks[i] +", ";
		}
		return bookList;
	}
	public void setPublishedBooks(String[] publishedBooks) {
		this.publishedBooks = publishedBooks;
	}
	public ArrayList<Integer> getSerials() {
		return serials;
	}
	public void setSerials(ArrayList<Integer> serials) {
		this.serials = serials;
	}
	
	
	
}
