class Exception{
    static void fun(){
        try{
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside fun()");
            throw e;
        }
    }
}

public class trycatch2 {
    public static void main(String[] args){
        try{
            Exception.fun();
        }
        catch(NullPointerException e){
            System.out.println("caught inside main");
        }
    }
}
