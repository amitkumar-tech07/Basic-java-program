// Warp up before practice Question
/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello practice Session..");
        System.out.println("Thank you!");
    }
}*/


// Basic Practice  like : Token related
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // DataTpe : It Specify the type of data a variable can hold and it also determine size and range of data.
        // Datatypes : 2 types : Primitive & non-primitive
        // 8 non-primitive dataType : byte, short, int ,long, long, float , char , boolean
        // Non-primitive Datatype: It store reference of variable.  type : class , object, string, array etc

        int age = 20;
        System.out.println("My age is : " +age);

        String name = "Amit Kumar";
        System.out.println("My name is : " +name);

        // Constant : It store a constant value that do not change once it assign the value in the variable..
        final float PI = 3.14f;
        System.out.println("the value of Pi is : " +PI);

        // Operator : It is a symbol to perform operation on variable or value.
        int a = 5 , b = 10;
        int sum = a + b ;
        System.out.println("The sum of two " +a+ " + " +b+ " is : " + sum);

        // Comment : It give info about code and compiler doesn't compile the comment


        // Keyword : Reserved/Special words that pre-define meaning in programming language.
        // It cannot use as a variable name and it is case-Sensitive always written in lowercase

        System.out.printf("Thank you \"Rahul Kumar\" for revising java basic Conceprs");

    }
}*/


// Input & Output
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create an Object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("\n========= Your Detail : =========");
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Thank you for using this program!");

    }
}*/


// Conditional Statement
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        if (age > 0 && age <=10){
            System.out.println("Your are Child..");
        }else if (age >= 11 && age <18){
            System.out.println("you are Teenager..");
        }else if (age >=18){
            System.out.println("Now, you are Adult...");
            System.out.println("You can vote...");
        }
        System.out.println("Thank you for using  this program!!");
    }
}*/


// Loop Statement
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        for (int i=1; i<=10; i++){
            //System.out.println(num+ " x " +i+ " = " +(num * i));
            System.out.printf("%d x %d = %d \n",num,i,num*i);
        }
        System.out.println("Thank you for using this program!");
    }
}*/

// Find factorial
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to get factorial : ");
        int num = scanner.nextInt();

        int fact = 1;

        for (int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial of " +num+ " is : " +fact);
    }
}*/


// Method
/*
public class Main {

    public static void name(){
        System.out.println("My name is Rahul Kumar");
    }

    public static void main(String[] args) {
        name();

    }
}*/


// String
/*
public class Main {
    public static void main(String[] args) {

        String string = "Rahul Kumar";   // String literal

        String string1 = new String("Rahul Kumar");

        System.out.println(string);
        System.out.println(string1);

        System.out.println(string == string1);  // it check the reference address
        System.out.println(string.equals(string1));  // It check the content

        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.length());
    }
}*/


// Array

public class Main {
    public static void main(String[] args) {

        int[] arr = {100,200,300};
        System.out.println(arr[0]);

    }
}


