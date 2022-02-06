package core;

import java.util.ArrayList;

public class SetOfPairs 
{
   
   private ArrayList<Pair> arr = new ArrayList<Pair>();
   
   public SetOfPairs(int size)
   {
      for (int i = 0; i < size; i++)
      {
         PairGenerator g = new PairGenerator();
         this.arr.add(g.getPair());
      }
   }
   
   public ArrayList<Pair> getArr() 
   {
      return this.arr;
   }

   @Override
   public String toString() 
   {
      return "SetOfPairs [arr=" + this.arr + "]";
   }
   
}
