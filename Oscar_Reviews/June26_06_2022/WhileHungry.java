package Oscar_Reviews.June26_06_2022;

public class WhileHungry {
    public static void main(String[] args) {
        int bananasEaten = 0 ; // initialization
        int countToFull = 3;

        while (true){ // condition
            if (bananasEaten == countToFull){
                break;

            }
            bananasEaten++ ; // iteration

            System.out.println("Eating a banana: \uD83C\uDF4C " + bananasEaten); // ud.. Unicode


        }






    }
}
