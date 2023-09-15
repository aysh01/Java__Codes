//method Overiding
class test{
    int age;
    String name;
    void show(int x){
        this.age=x;
        System.out.println(this.age);
    }

    public void show(String name){
        this.name = name;
        System.out.println(this.name);
        //return name;
    }
}

class sample2 extends test{
    public static void main(String [] args){
        sample2 tr=new sample2();
        tr.show(45);
        tr.show("ViruS");
    }
}
