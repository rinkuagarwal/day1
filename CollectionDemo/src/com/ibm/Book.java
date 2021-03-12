package com.ibm;

public class Book {
	
		private String title;
		private float price;
private int PublishYear;
		public int getPublishYear() {
	return PublishYear;
}

public void setPublishYear(int publishYear) {
	PublishYear = publishYear;
}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public Book(String title) {
			
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) { 
			this.title = title;
		}
		@Override
		public String toString() {
			
			return "{price"+ this.price+", title="+this.title+", year="+this.PublishYear+"}";//since we want both price n title together we use the override toString()
		}
}
