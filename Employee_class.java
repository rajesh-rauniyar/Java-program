class employee{
    void display(){
        System.out.println("this is the information of employee");
    }
}
class manager extends employee{
    void display(){
        super.display();
        System.out.println("and manager of this company");
    }
}
public class Employee_class {
    public static void main (String[] args){
        manager m=new manager();
        m.display();
    }
}
