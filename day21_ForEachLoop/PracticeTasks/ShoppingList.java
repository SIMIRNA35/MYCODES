package day21_ForEachLoop.PracticeTasks;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int counter = 1;
        String list = "";
        double totalPrice = 0;
        while (true) {

            System.out.println("Enter item" + counter + " and its price:");
            String item = scan.next();
            double price = scan.nextDouble();

            System.out.println("Add one more item?");
            String answer = scan.next().toLowerCase(); // with toLowerCase(); it accepts YES or YeS as a valid answer

            while (!(answer.equals("yes") || answer.equals("no"))) {  // ! = not
                System.out.println("Invalid answer. Please re-enter");
                answer = scan.next().toLowerCase();
            }

            list += "item" + counter + ": " + item + " Price: " + price + ", ";
            //Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
            totalPrice += price;
            if (answer.equals("no") || counter == 3) {
                break;
            }
            counter++;
        }                // substring takes from 0 till end -1 it means before last character.
        System.out.println(list.substring(0, list.length()-2)); //Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
        System.out.println("Total price: " + totalPrice);

    }
}
/*
Your program should ask use to enter items followed by its price. After adding item,
ask user if he wants to add one more item. If it is yes, repeat previous steps again.
If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.
Hint: use do while loop.

Example:
output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3
```
 */












