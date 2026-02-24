public class trycatch {
    public static void main(String[] args){
        try{

        
        System.out.println("outer try block started");
        try{
            System.out.println("Inner block is started");
            int result=10/0;
        }catch(ArithmeticException e){
            System.out.println("Caught Arithmetic Exception in inner try block"+e.getMessage());
        }
        String str=null;
        System.out.println(str.length());
    }catch(NullPointerException e){
        System.out.println("Caught Nullpointerexception in outer block "+e.getMessage());
    }finally{
        System.out.println("finally block of outer try executed");
    }
    }
}
