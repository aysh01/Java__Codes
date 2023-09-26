//Create Class Animal
//Declare variable legs_color
//Create method show_animal(legs,color)
class Animal {
    String legs, color;

    void Animal(String x, String y){
        this.legs=x;
        this.color=y;
    }

    void show_animal() {
        System.out.println("Animal has " + this.legs + " legs.");
        System.out.println("The, Color of the Animal is: " + this.color);
    }
}

class Elephant extends Animal {
    void walk() {
        System.out.println("Elephant walks slowly");
    }

    @Override
    void show_animal() {
        System.out.println("Now, animal has " + this.legs + " legs."); // Override
        System.out.println("Now, the color of the Animal is: " + this.color); // Override
    }
}

class BabyElephant{
    //@Override
    void walk() {
        System.out.println("Baby, elephant walks slowly too...");
    }

    //@Override
    String legs,color;
    void show_animal(String x, String y) {
        this.legs=x;
        this.color=y;
        System.out.println("Legs == "+this.legs);
        System.out.println("Color == "+this.color);
    }
    
    public static void main(String [] args){
        BabyElephant bb = new BabyElephant();
        bb.walk();
        bb.show_animal("4", "black");
    }
}
