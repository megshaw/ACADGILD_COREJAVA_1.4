


public class ASCII {

   public static void main(String args[]){
       
       int num[] = {65, 66, 67, 68, 69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
       String str =null;
        for(int i: num){
            str = Character.toString((char)i);
            System.out.println(str);
        }
   }
}