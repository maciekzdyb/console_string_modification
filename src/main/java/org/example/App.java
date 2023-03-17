package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String input = "mmamm";
        Palindrome palindrome = new Palindrome(input);
        System.out.println(input + " is palindrome? " + palindrome.isPalindrome());
    }
}
