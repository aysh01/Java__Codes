public class example1{
    public static void main(String [] args){
        String [] a= {"10","20","30"};
        String [] b= {"a","b","c"};

        if(java.util.Arrays.equals(a,b)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
