class Animal {
    void display(String anm) {
        System.out.println("The animal is " + anm);
    }
}

class Dog extends Animal {
    void display(String anm) {
        super.display(anm);   
        System.out.println("The dog barks");
    }
}

public class animal_class {
    public static void main(String[] args) {
        Dog c = new Dog();
        c.display("dog");
    }
}
