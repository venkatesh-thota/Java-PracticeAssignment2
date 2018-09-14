import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Poweroffour {

    public  boolean PoweroffourChecker(int input){


        int user_input = input;
        double  l= (Math.log(user_input))/(Math.log(4));
        int k=(int) l;


        if (Math.pow(4,k)==user_input){
            //System.out.println("it is a power of four");
            return true;
        }
        else{
            //System.out.println("it is not a power of four");
            return false;
        }

    }
}