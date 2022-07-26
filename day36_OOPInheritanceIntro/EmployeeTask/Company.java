package day36_OOPInheritanceIntro.EmployeeTask;

public class Company extends Employee {
    public static void main(String[] args) {
        Tester tester = new Tester();

        tester.setInfo("Metin", 'M', 37, "SDET", "ID74", 42000, "CapGemini");

        tester.work();
        tester.test();
        System.out.println(tester);

        Developer developer = new Developer();

        developer.setInfo("Volkan", 'M', 40, "Developer", "ID14", 60000, "CapGemini");

        developer.work();
        developer.code();
        System.out.println(developer);

        ProductManager productManager = new ProductManager();

        productManager.setInfo("Akile", 'F', 35, "Product Manager", "ID01", 90000, "CapGemini");

        productManager.work();
        productManager.follow();
        System.out.println(productManager);


    }
}















