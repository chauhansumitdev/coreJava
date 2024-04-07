public class ExceptionHandeling {
    public static void main(String[] args) {
        try{
            String arr[] = new String[1];
            arr[100] = "Explode hahahahahah";
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I was not involved and will never be!!");
        }
    }
}
