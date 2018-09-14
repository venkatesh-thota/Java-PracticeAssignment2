import java.util.*;
class PalindromeChecker{

    public boolean isPalindrome(String inputString){
        int length=inputString.length();
        for(int i=0;i<length/2;i++){
            if(inputString.charAt(i)!=inputString.charAt(length-1-i))
                return false;
        }

        return  true;
    }

    public String reverse(String inputString){
        int length=inputString.length();
        String reverseString="";
        for(int i=length-1;i>=0;i--)
        {
            reverseString+=inputString.charAt(i);
        }
        return reverseString;
    }
}