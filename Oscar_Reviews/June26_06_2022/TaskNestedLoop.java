package Oscar_Reviews.June26_06_2022;

public class TaskNestedLoop {
    public static void main(String[] args) {
/*
        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15 */

        int rowCount = 5 ;
        for (int row = 1; row <=rowCount ; row++) {
            int value = row;
            for (int col = 1; col <= row ; col++) {
                System.out.print(value +" ");
                value+=rowCount - col ;
            }

            System.out.println();

        }
        System.out.println("----------------------------------------");
        
        /*
        1
        10        we have 6 rows , 6 colums 
        101
        1010
        10101
        101010
        
        */
        
        int r = 6 ;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 1; j++) {

                if (j%2==1){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
