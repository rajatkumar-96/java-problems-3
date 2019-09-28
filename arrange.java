import java.util.*;
public class arrange{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 7 numbers with comma in between them");
        String  numberline= input.next();
        String[] numberarr=numberline.split(",");
        int [] numberlineint= new int[7];
        for(int i=0;i<7;i++){
            numberlineint[i]=Integer.parseInt(numberarr[i]);
        }
        Arrays.sort(numberlineint);
        int found=0;
        for(int j=0;j<6;){
                if(numberlineint[j]+1==numberlineint[j+1]){
                        j++;
                }else{
                    found=1;break;
                }
        }
        if(found==0){
            System.out.println("Given numbers are consecutive");
        }else{
            System.out.println("Given numbers are not consecutive");
        }
    }
}