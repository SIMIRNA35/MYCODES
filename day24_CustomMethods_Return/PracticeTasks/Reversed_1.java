package day24_CustomMethods_Return.PracticeTasks;

public class Reversed_1 {
    public static void main(String[] args) {
    /*3. create a method named reverse that passes one string parameter, the method can return the reversed string
Ex: str = "Java";   reverse(str) ==> avaJ
     */
        String str1 = "Java" ;
        String reversed = reversed(str1) ; // String reversed icine str1 i atadim
        System.out.println(" reverse value of " + str1 + " is " + reversed);

    }
    public static String reversed(String str1){

        String result = "";

        for (int i = str1.length()-1 ;  i >= 0 ; i--) {
            result += str1.charAt(i);

        }
        return result;
    }
}
