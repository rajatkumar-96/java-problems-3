import java.util.*;
    public class ErrorHandling1{
        ErrorHandling1(String msg){
            msg="This must be executed";
            System.out.println(msg);
        }

        public static void main(String[] args) {
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println("Error has been found");
            }
            finally{
                System.out.println("this will get printed");
            }
            
        }
    }