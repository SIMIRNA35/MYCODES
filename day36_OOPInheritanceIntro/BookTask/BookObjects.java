package day36_OOPInheritanceIntro.BookTask;

public class BookObjects {
    public static void main(String[] args) {

            Ebook ebook1 = new Ebook();
            ebook1.setInfo("Miserable","drama","Victor Hugo",100);
            ebook1.setInfo("large",359);
            ebook1.reading();
             System.out.println(ebook1);

             AudioBook audioBook1 = new AudioBook();

             audioBook1.narrator = "Chris" ;
             audioBook1.setInfo("Chess","audio","Zweig",10);
             audioBook1.setInfo(20,"Barış Özcan");
              System.out.println(audioBook1);

              audioBook1.listening();


    }

}

