package core;

import java.util.Random;

public class PairGenerator
{
   
   private Pair pair;
   private static final int MIN = 0;    // min for random num generation
   private static final int MAX = 28;   // max for random num generation
   
   public PairGenerator()
   { 
      int number = generateRandomNumber(MIN, MAX);
      String letter = assignLetter(number);
      
      this.pair = new Pair(number, letter);
   }

   public int generateRandomNumber(int min, int max) 
   {
      Random random = new Random();
      return random.nextInt(max - min) + min;
   }
   
   public String assignLetter(int num)
   {
      String output;
      
      switch (num) 
      { 
         case 0:  output = " ";
                  break;
         case 1:  output = "a";
                  break;
         case 2:  output = "b";
                  break;
         case 3:  output = "c";
                  break;
         case 4:  output = "d";
                  break;
         case 5:  output = "e";
                  break;
         case 6:  output = "f";
                  break;
         case 7:  output = "g";
                  break;
         case 8:  output = "h";
                  break;
         case 9:  output = "i";
                  break;
         case 10: output = "j";
                  break;
         case 11: output = "k";
                  break;
         case 12: output = "l";
                  break;
         case 13: output = "m";
                  break;
         case 14: output = "n";
                  break;
         case 15: output = "o";
                  break;
         case 16: output = "p";
                  break;
         case 17: output = "q";
                  break;
         case 18: output = "r";
                  break;
         case 19: output = "s";
                  break;
         case 20: output = "t";
                  break;
         case 21: output = "u";
                  break;
         case 22: output = "v";
                  break;
         case 23: output = "w";
                  break;
         case 24: output = "x";
                  break;
         case 25: output = "y";
                  break;
         case 26: output = "z";
                  break;   
         case 27: output = ".";
                  break;
         default: output = "[ERROR] Invalid Assignment.";
                  break;  
      }
      
      return output;
   }

   public Pair getPair() 
   {
      return this.pair;
   }

}
