package core;

public class Pair 
{
   
   private int number;
   private String letter;
   
   public Pair(int number, String letter)
   {
      this.number = number;
      this.letter = letter;
   }

   public int getNumber() 
   {
      return this.number;
   }

   public String getLetter() 
   {
      return this.letter;
   }

   @Override
   public String toString() 
   {
      return "Pair [number=" + this.number + ", letter=" + this.letter + "]";
   }
   
}
