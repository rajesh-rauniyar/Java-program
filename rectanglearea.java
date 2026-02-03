import java.util.Scanner;
public class rectanglearea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        int length=sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("The area of rectangle is "+area);
    }
}
