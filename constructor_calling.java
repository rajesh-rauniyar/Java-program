class demo {
    demo(){
        this("default constructor");
    }
    demo(String message){
        System.out.println(message);
    }
    demo(String info, int num) {
    System.out.println("my batch is " + info + " and my prn is " + num);
}

}
public class constructor_calling{
public static void main (String[] args){
   demo d1= new demo();
    demo d2=new demo("hi rajesh");
   demo d3= new demo("c4",277);
}
}