package day24_CustomMethods_Return.PracticeTasks;

public class isPalindrome {
    public static void main(String[] args) {
   /*4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
Ex:str = "Level"       isPalindrome(str) ===> true     */

        String str1 = "Level";
        boolean isPalindrome = isPalindrome(str1);
        System.out.println("isPalindrome = " + isPalindrome);


    }

    public static boolean isPalindrome(String str1) {

        String reverse = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);


        }
        return reverse.equalsIgnoreCase(str1);
    }
}
