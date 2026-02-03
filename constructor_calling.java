class demo {
    demo(){
        this("default constructor");
    }
    demo(String message){
        System.out.println(message);
    }
}
public class constructor_calling{
public static void main (String[] args){
    new demo();
    new demo("hi rajesh");
}
}