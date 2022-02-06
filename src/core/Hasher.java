package core;

public class Hasher 
{
   
   // stateless class
   
   public Hasher()
   {
      // empty
   }
   
   public long performPolynomialRollingHash(String str)
   {
       int p = 31;
       int m = (int) (1e9 + 9);
       long powerOfP = 1;
       long hashVal = 0;

       for (int i = 0; i < str.length(); i++)
       {
           hashVal = (hashVal + (str.charAt(i) - 'a' + 1) * powerOfP) % m;
           powerOfP = (powerOfP * p) % m;
       }
       
       return hashVal;
   }
    
   public boolean compareHash(long hashOne, long hashTwo)
   {
      boolean output;
      
      if (hashOne == hashTwo)
      {
         output = true;
      }
      else 
      {
         output = false;
      }
      
      return output;
   }

}
