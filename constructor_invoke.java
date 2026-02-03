class parents{
    void display(){
        System.out.println("This is a parent class");
    }
}
class child extends parents{
    void display(){
        super.display();
        System.out.println("this is a child class");
    }
}
public class constructor_invoke {
    public static void main (String[] args){
        child c=new child();
        c.display();
    }
}
