public class votingdemo{
    public static void main(String[] args) {
        voting v = new voting();
        try {
            v.checkage(16);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

class voting{
    void checkage(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Underage");
        }else{
            System.out.println("eligible");
        }
    }
}