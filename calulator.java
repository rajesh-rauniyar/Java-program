import java.util.Scanner;

public class calulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1.Addition 2.subtraction 3.multipication 4.division");
        int choice=sc.nextInt();
        System.out.println("ENter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        if(choice==1){
            int add=num1+num2;
             System.out.println("Addition of two number:"+add);
        }
        else if(choice==2){
            int sub=num1-num2;
             System.out.println("subtraction of two number:"+sub);
        }
        else if(choice==3){
            int mult=num1*num2;
             System.out.println("Multipication of two number:"+mult);
        }
        else if(choice==4){
            int div=num1/num2;
             System.out.println("division of two number:"+div);
        }
        else{
             System.out.println("Invalid choice");
        }
    }
}

 