public class execptionn {
    public static void main(String args[]){

        int[] marks={97,45,78,88};
        try{
            System.out.println("mark is "+marks[5]);
        }catch (Exception exception){
            System.out.println("index not found");
        }
        System.out.println("result are fetched");
    }
    
}
