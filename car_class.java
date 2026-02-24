class car{
    void running(){
        System.out.println("The car is started");
    }
}
class engine extends car{
    void running(){
        System.out.println("The engine has started");
    }
}

class Manual extends car{
    void running(){
        System.out.println("The manual has started");
    }
}

public class car_class {
    public static void main(String[] args){
        car en=new engine();
        car mn=new Manual();
        car cr=new car();
        
        cr.running();
        en.running();
        mn.running();
    }
}
