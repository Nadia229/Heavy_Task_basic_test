class Problem_2 {

    public static String remove(String str)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(i))) {
             result = result + str.charAt(i);
            }
        }
    return result;
    }
 
    public static void main(String args[])
    {
  
    	String str= "anatlus35346", temp="";
        char ch;
        String str2 = remove(str);//storing data without digit
        
        
      System.out.print("Original word: ");
      System.out.println(str);
      System.out.println("Without Numeric word: "+ str2);
      
      //doing reverse now
      for (int i=0; i<str2.length(); i++)
      {
        ch= str2.charAt(i);
        temp= ch+temp;
      }
      System.out.println("Reversed word: "+ temp);
    
       
      
    }
}