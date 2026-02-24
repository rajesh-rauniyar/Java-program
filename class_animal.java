
class Animal{
    void sound(){
        System.out.println("The animal makes sound");
    }
}
class cat extends Animal{
    // @Override
 void sound(){
    System.out.println("The cat sound is Meow");
 }
}
class dog extends Animal{
    // @Override
    void sound(){
        System.out.println("The dog sound is Bark");
    }
}
public class class_animal {
    public static void main(String[] args){
        Animal a;
        a=new cat();
        a.sound();
        a=new dog();
        a.sound();
    }
}
