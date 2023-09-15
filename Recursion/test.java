//Recursion in Java
public class test{
    public static int fact(int x){
        if(x == 0 | x == 1){
            return 1; //When n is 0 or 1, the factorial is 1.
        }

        return x*fact(x-1); //Multiply n by the factorial of (n-1).
    }

    public static void main(String [] args){
        int result=fact(2); //Calculate 2!
        System.out.println("Factorial of 2 is: "+result);
    }
}
