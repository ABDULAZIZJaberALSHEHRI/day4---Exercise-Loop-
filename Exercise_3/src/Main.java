import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("Question 1: ");
        for (int i = 0; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else  if (i % 5== 0){
                System.out.println("Buzz");
            }else if (i % 3 ==0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }


        //Question 2

        System.out.println("\nQuestion 2: ");

        Scanner input = new Scanner(System.in);
        System.out.println("Please write a sentence or word so the program print reversed type of it: ");
        String sentence = input.nextLine();
        StringBuilder str = new StringBuilder(sentence);
        StringBuilder str_rev = str.reverse();
        System.out.println(str_rev);




        //Question 3
        System.out.println("\n Question 3: ");



        System.out.println("Enter the number to print it's factorial value of it: ");
        int num = input.nextInt();
        int factorial =1;
        for (int i = 1; i <= num; i++) {
            factorial=i*factorial;
        }
        System.out.println("-The factorial value of your number is: "+ factorial);





        //Question 4
        System.out.println("\n Question 4: ");
        System.out.println("value of number raised to the power of another number.");
        System.out.println("Enter the number: ");
        int num_1 = input.nextInt();
        System.out.println("Enter value of the power number: ");
        int num_power = input.nextInt();
        int total = 1;

        for (int i = 1; i <= num_power; i++) {
            total = num_1 * total;
        }
        System.out.println("- The value of "+"'"+num_1+"'"+ " to the power "+"'"+num_power +"'"+ " = " + total);





        //Question 5
        System.out.println("\nQuestion 5: ");

        System.out.println("The program will print the sum of even and odd integers.");
        int odd = 0;
        int even = 0;
        System.out.println("Please enter integer numbers and the program will check the odd and even numbers from '0' " +
                "to the number you will enter: ");
        int number_1 = input.nextInt();
        for (int num_intgers = 0; num_intgers <= number_1; num_intgers++) {
            System.out.print(num_intgers+",");
            if (num_intgers %2==0){
                even = num_intgers +even;
            }else {
                odd = num_intgers +odd;
            }
        }
        System.out.println("\nThe sum of even number :" + even + "\nThe sum of odd number: "+ odd);


        //Question 6
        System.out.println("\n Question 6: ");

        System.out.println("Check if the entered number is prime number or not.\n");
        System.out.println("Enter integer number: ");
        int num_$ = input.nextInt();
        if(num_$>0 && num_$%2 != 0){

            System.out.println("The entered number is prime number.");
        }else {
            System.out.println("The entered number is not prime number.");
        }




        //Question 7
        System.out.println("\n Question 7: ");

        for (int weeks = 1; weeks <= 4; weeks++) {

            System.out.println("\nWeek " + '"'+weeks+'"');
            for (int days = 1; days <= 7 ; days++) {
                System.out.println("Day " + "'"+days+"'");
            }
        }


        //Question 8
        System.out.println("\n Question 8: ");
        System.out.println("program will check if the word is a palindrome or not. \n");
        System.out.println("Please write palindrome word: ");
        String word = input.next();

        StringBuilder str_1 = new StringBuilder(word);
        StringBuilder str_revm = str_1.reverse();
        System.out.println("The reverse of your word is: "+ "'"+str_revm+"'");

        if (word.equalsIgnoreCase(String.valueOf(str_revm))){
            System.out.println("'True' the entered word is palindrome.");
        }else {
            System.out.println("'False' the entered word are not palindrome.");
        }


    }


}