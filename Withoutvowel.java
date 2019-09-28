import java.util.*;
public class Withoutvowel{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> countries= new ArrayList<String>();
        System.out.println("Start adding countries. To stop adding type exit");
        int count=0;
        while(input.hasNext()){
            String temp= input.next();
            if(temp.equals("exit")){ break;}else{
            countries.add(temp);
            count++;
            }
        }
        for(int i=0;i<count;i++){
            String country=countries.get(i);
            country=country.replaceAll("[aeiou]","");
            System.out.println(country);
            country="";

        }
    }
}