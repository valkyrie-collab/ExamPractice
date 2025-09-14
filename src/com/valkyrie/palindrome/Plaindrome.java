package com.valkyrie.palindrome;

// import java.util.Arrays;

public class Plaindrome {

    public static void checkPalindrome(int number) {
        String stringNumber = Integer.toString(number);
        char[] numberArray = stringNumber.toCharArray();
        int length = numberArray.length;
        int mid = 0 + ((length - 0) / 2);

        for (int i = 0; i <= mid; i++) {
            length--;
            if (numberArray[i] != numberArray[length]) {
                numberArray[i] = (char)(numberArray[i] ^ numberArray[length]);
                numberArray[length] = (char)(numberArray[i] ^ numberArray[length]);
                numberArray[i] = (char)(numberArray[i] ^ numberArray[length]);
            }
        }
        // System.out.println(Arrays.toString(numberArray));

        int result = Integer.parseInt(new String(numberArray));
        
        System.out.println(
            "The Number " + number + " is" + (result == number? "Palindrome" : "not palindrome")
        );
    }
}
