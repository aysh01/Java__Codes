class sample {
    final double pi = 3.14;

    void area(double l, double h) {
        double a = pi * l * h; //Rectangle
        System.out.println("Area of Rectangle: "+a);
    }

    void area(float r){
        double x= pi * r * r;
        System.out.println("Area of Circle: "+x);
    }

    public static void main(String [] args){
        sample s=new sample();
        s.area(22,3.4); //Values for Rectangle
        s.area(4); //Values for Circle
    }
}
