package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This program will display a mutated DNA string and its complement.
 */ 

public class ManipulateDna {

  /**
   * This program will create a mutation in a given DNA string using the Random class
   * and display the mutated string and its complement.
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Carolann Verrioli " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);

    // Step Two: Compute the complement of the DNA String
    String m1 = dna.replace('a' , 'T');
    String m2 = m1.replace('t' , 'A');
    String m3 = m2.replace('c' , 'G');
    String m4 = m3.replace('g' , 'C');
    String dnacomp = m4;
    dna = dna.toUpperCase();

    System.out.println("Complement of " + dna + " is " + dnacomp);
    
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random r1 = new Random();
    String letters = "ATCG";
    int pos = r1.nextInt(dna.length());
    char r1L = letters.charAt(r1.nextInt(letters.length()));
    String sb1 = dna.substring(0, pos);
    String sb2 = dna.substring(pos);
    System.out.println("Inserting " + r1L + " at position " + pos + " gives " + (sb1 + r1L + sb2));

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    Random r2 = new Random();
    int p2 = r2.nextInt(dna.length());
    String s1 = dna.substring(0, p2);
    String s2 = dna.substring(p2 + 1);
    System.out.println("Deleting from position " + p2 + " gives " + (s1 + s2));



    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    Random r3 = new Random();
    int p3 = r3.nextInt(dna.length());
    String st1 = dna.substring(0, p3);
    String st2 = dna.substring(p3 + 1);
    String letterss = "ATCG";
    char r3L = letterss.charAt(r3.nextInt(letterss.length()));
    System.out.println("Changing position " + p3 + " gives " + (st1 + r3L + st2));
    

    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the ManipulateDna program.");
    System.out.println("Have a fantastic day!");

  }

}
