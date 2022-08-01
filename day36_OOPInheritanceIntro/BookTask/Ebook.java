package day36_OOPInheritanceIntro.BookTask;

   public class Ebook extends Book {

      String size;
      int pages;

      public void setInfo(String size, int pages) {
         this.size = size;
         this.pages = pages;
      }

      public void reading() {
         System.out.println("Metin  is reading " + title + " now.");
         System.out.println("title " + title);
         System.out.println("size" + size);
      }

   }









/*
Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */