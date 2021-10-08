package com.perscholas.java_basics;

public class Main {
    //reverse letters first
    public static void reverseLetters(char[] myArray, int start, int end) {
        char swap;
        while (start <= end){
            swap = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = swap;
            start++;
            end--;
        }
    }
    //reverse the words
    public static String reverseWords(char[] myArray){
        String message = "";
        int start = 0;
        //if there is space at the end marker reverse the last word
        for (int end = 0; end < myArray.length; end++){
            if (myArray[end] == ' '){
                reverseLetters(myArray, start, end);
                start = end + 1;
            }
        }
        //reverse last word
        reverseLetters(myArray, start, myArray.length - 1);
        //reverse entire array
        reverseLetters(myArray, 0, myArray.length - 1);

        //convert to string
        for (char c : myArray) {
            message = message.concat(String.valueOf(c));
        }
        return message;
    }
    public static void main(String[] args) {
        char[] charArray = {'c','a','k','e',' ','p','o','u','n','d',' ',' ','s','t','e','a','l'};
        System.out.println(reverseWords(charArray));
    }
}
