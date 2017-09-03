/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Palindrome.java
* Execution:   java -cp bin com.bridgelabz.util/Palindrome
*
* Purpose: Find String Functions like Anagram and palindrome.
*
* @author Diksha
* @version 1.0
* @since 14-8-2017
*
********************************************************************/

/* Package Naming Style*/
 package com.bridgelabz.util;
 
  import java.util.Scanner;
class StringFunctions{

    static String msgAnagram = "String are Anagram";

    static String msgNotAnagram = "String are not Anagram";

    static String msgPalindrome = "String is Palindrome";

    static  String msgNotPalindrome = "String is Not Palindrome";

    static char[] stringArray(String str){
        int length = str.length() - 1;
        char[] newString = new char[length];
        for(int i =0; i < length; i++){
            newString[i] = str.charAt(i);
        }
        return newString;
    }

    static boolean isAnagram(String str1, String str2){

        boolean mAnagram = false;

        int length1 = str1.length();
        int length2 = str2.length();

        if(length1 == length1) {

            for (int i = 0; i < length1; i++) {

                for (int j = 0; j < length2; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {

                        mAnagram = true;
                        break;
                    }
                }
            }
        }
        return mAnagram;
    }

    static boolean isPalindrome(String str1){
        boolean mmPalindrome = false;

        int length1 = str1.length();

        for(int i = 0;i < length1-1;i++) {
            for(int j = length1 - 1;j >=0;j--)

            if(str1.charAt(i) == str1.charAt(j)){

                mmPalindrome = true;
                break;
            }
        }
        return mmPalindrome;
    }

    static void isEqual(String str1, String str2){
        char lengthString1[] = stringArray(str1);
        char lengthString2[] = stringArray(str2);

        if(lengthString1.length == lengthString2.length)
            System.out.println("Two String array are equal");
        else
            System.out.println("Two String array are not equal");
    }

    public static void main(String args[]){

        String mString1 = args[0];
        String mString2 = args[1];

        boolean msgAnagram = isAnagram(mString1,mString2);

        if(msgAnagram == true)
            System.out.println(msgAnagram);
        else
            System.out.println(msgNotAnagram);

        boolean mPalindrome = isPalindrome(mString1);

        if (mPalindrome == true)
            System.out.println(msgPalindrome);
        else
            System.out.println(msgNotPalindrome);
        isEqual(mString1,mString2);
    }
}



