package day36_OOPInheritanceIntro.BookTask;

      public  class AudioBook extends Book {

            public double length;
            public String narrator;

            public void  setInfo(double length, String narrator) {
                  this.length = length;
                  this.narrator = narrator;
            }
           public void listening(){
                 System.out.println("listener is listening " + title  );
      }
            public String toString() {
                  return "AudioBook{" +
                          "title='" + title + '\'' +
                          ", type='" + type + '\'' +
                          ", author='" + author + '\'' +
                          ", price=" + price +
                          " ,length=" + length +
                          ", narrator='" + narrator + '\'' +
                          '}';
            }
      }
/*
Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */