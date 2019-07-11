// comments can be added above the package line
// packages must be the first non commented line
//imports are done in the lines blow the package
//everything in Java has to be a class, one has to have a main function (public static void)
package helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("What is your name: ");
        name = in.nextLine();
        // taking what's typed in as a string and assigning it to String

        System.out.println("Hello, " + name + ". I am your computer.");

    }
}

//Github Push Test