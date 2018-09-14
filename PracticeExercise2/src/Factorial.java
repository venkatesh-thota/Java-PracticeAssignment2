class Factorial {

    public  long  Factorialchecker(long  input){


        long  user_input = input;
        long c=1;
        for(long i=1;i<=user_input;i++){
            c=c*i;
        }
        System.out.println(c);
        return c;
    }
}