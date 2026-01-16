//user defined exception 
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class userdefinedexceptionexample{
     static void checkAge(int age)throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age below 18");
        }else{
            System.out.println("eligible to vote");
        }

    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}