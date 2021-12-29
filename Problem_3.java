import java.util.*;
import java.util.Scanner;
public class Problem_3
{
public static void main(String args[])
{
	ArrayList<String> namesList = new ArrayList<String>
	     (Arrays.asList( "xmas", "gift", "tree","light","people") );//storing data in arraylist
    
    for(int i=0;i<2;i++){
    	
    Scanner sc = new Scanner (System.in);//User Input 
    String str = sc.nextLine();
    namesList.remove(0);//removing first item
    namesList.add(4,str);//adding new item
    System.out.println(namesList);
    }
     

}
   

}
