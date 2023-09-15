//Inheritance
import java.io.*;
class abc{
    int age;
    String name;
    void abc(int x, String y){
        this.age=x;
        this.name=y;
        System.out.println(this.age+"\n"+this.name);
    }
}

class sample extends abc{
    public static void main(String [] args){
        abc s=new sample();
        s.abc(20,"Bob");
    }
}
