package Lab4;
// Factorial.java
// Recursive factorial method


public class Factorial {

   public static void main(String[] args) {


      int[] myArray = {10, 20, 30, 40};

     int result = sum(myArray);
      System.out.println(result);

     // factorial(5);
   }
   // Recursive definition of method factorial


   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result = n * factorial(n-1); 
         return result;
      }
   }


   public static int sum(int [] a){
      if (a.length == 0)
         return 0;
      else{
         return sumSub(a, 0);
      }


   }
   private static int sumSub(int [] a, int i){
      if(a.length - 1 == i){
         return a[i];
      }else{
         return  a[i] + sumSub(a, i + 1);
      }
   }

}


