////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// October 25th, 2021

// Homework 7, Programming Exercise 7.34 on page 285, Sort a String

////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
// imports Java Utility Arrays for use in this program
import java.util.Scanner;
// imports Java Utility Scanner for use in this program
public class Main {

    private static String s;

    public static String sort(String s) {

        Scanner input  = new Scanner (System.in);
        // Creates Scanner
        String first = input.nextLine();
        // Creates String from what the User Input
        char[] mashedUp = first.toCharArray();
        // Establishes Character Array
        Arrays.sort(mashedUp);
        // Sorts the Array of characters
        String sorted = new String(mashedUp);
        // Creates a new sorted string out of the array of characters.
        System.out.println(sorted);
        // Outputs the sorted String
        return sorted; }
    // Returns variable sorted
    public static void main(String[] args) {

        sort(s);
        // Calls the function sort with the parameter of s
    }
}