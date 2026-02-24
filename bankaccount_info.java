class Bankaccount{
    double getinterestrate(){
        return 0.0;
    }
}
class Savingaccount extends Bankaccount{
    double getinterestrate(){
        return 3.0;
    }
}
class Currentaccount extends Bankaccount{
    double getinterestrate(){
        return 4.5;
    }
}
public class bankaccount_info {
    public static void main(String[] args){
        Bankaccount sa=new Savingaccount();
        Bankaccount ca=new Currentaccount();
        System.out.println("The interest of Saving account is "+sa.getinterestrate());
        System.out.println("The interest of current account is "+ca.getinterestrate());
    }
}

