class InvalidAgeException extends Exception{
    public InvalidAgeException (String a){
        super(a);
    }
}

public class exception_handling {
    public static void validate(int age)
    throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be above 18");
        }
        System.out.println("Valid Age"+age);
    }
}

public static void main(String[] args){
    try{
        divide(10,0);
    }
    catch(DividebyzeroException e){
            System.out.println("Caught Exception"+e.getMessage());
        }
    }
}