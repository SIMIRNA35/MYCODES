package Day31_CustomClass_Constructors.Scrum;

public class MyScrumTeam {

    public static void main(String[] args) {
        // 3 testers objects

        Tester tester1 = new Tester("Metin",222,"QA", 38000) ;
        Tester tester2 = new Tester("Akile",258,"Senior SDET", 60000) ;
        Tester tester3 = new Tester("Sevil",123,"Junior SDET", 35000) ;
        Tester tester4 = new Tester("Jack",356,"Senior SDET", 70000) ;

        Tester [] testers = {tester2,tester3,tester4} ;


        // 4 developers objects

        Developer Developer1 = new Developer("Olga",22,"Junior SDET", 142000) ;
        Developer Developer2 = new Developer("Aygun",58,"Java Master", 185000) ;
        Developer Developer3 = new Developer("Francois",23,"Software Developer", 125000) ;
        Developer Developer4 = new Developer("Cecile",23,"Senior Developer", 200000) ;

        Developer [] developers = {Developer2,Developer3,Developer4} ;

        // 1 ScrumTeam objects

        ScrumTeam scrum = new ScrumTeam("Jean", "Huseyin", "Mine" , 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(Developer1);   // added 1 tester and 1 developer
        System.out.println(scrum);

        System.out.println("--------------------------------------");

        scrum.addDevelopers(developers);
        scrum.addTesters(testers);

        System.out.println(scrum);

        System.out.println("------------------------------------------");

        for (Tester eachTester : scrum.testersList) {

            System.out.println(eachTester.name + " : " + eachTester.Salary );

        }
        System.out.println("-------------------------------------------");

        for (Developer eachDeveloper: scrum.devopsList) {
            System.out.println(eachDeveloper.name + " :" + eachDeveloper.Salary);
        }
        System.out.println("-----------------------------------");

        scrum.removeTester(222);   // testerdan birini kaldirmak istedigimde
         scrum.removeDeveloper(23);
        System.out.println(scrum);

    }







}



/*
	create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */