package day28_ArrayList.Practice_Tasks;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "cOmu852!";

        int countUppercase = 0;
        int countLowercase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUppercase++ ;

            }else if (Character.isLowerCase(each)){
                countLowercase++;
            } else if (Character.isDigit(each)) {
                countDigits++ ;
            } else {
                countSpecialChar++ ;

            }


        }
        System.out.println("countUppercase = " + countUppercase);
        System.out.println("countLowercase = " + countLowercase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);


        boolean hasUpperCase = countUppercase > 0 ;
        boolean hasLowercase = countLowercase > 0 ;
        boolean hasDigit = countDigits > 0 ;
        boolean hasSpecialChar = countSpecialChar > 0 ;

       // boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasUpperCase
       // && hasLowercase && hasDigit ;

        // uzun boolean yazmak yerine nested loop kullanabiliriz

        boolean strongPassword =false ;
        if (password.length() >= 8 ) {
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowercase){
                        if (hasDigit){
                            if (hasSpecialChar){

                            }
                        }
                    }
                }
            }
        }

        System.out.println("strongPassword = " + strongPassword);
    }









}
