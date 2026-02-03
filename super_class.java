class parent{
    void display(){
    System.out.println("Parent class method");
    }
}
class child extends parent{
    void display(){
        // call the parentclass
        super.display(); 
        System.out.println("child class method");
    }
}

public class super_class {
    public static void main(String[] args){
        child c=new child();
        c.display();
    }
}
