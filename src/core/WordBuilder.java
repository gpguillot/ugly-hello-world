package core;

import java.util.ArrayList;

public class WordBuilder 
{
   
   private String builtWord;
   
   public WordBuilder(String targetWord, SetOfPairs pairs)
   {
      ArrayList<Pair> pairsList = pairs.getArr();
      ArrayList<String> builtList = new ArrayList<String>();
      String temp = null;
      
      for (int i = 0; i < targetWord.length(); i++)
      {
         for (int j = 0; j < pairsList.size(); j++)
         {
            temp = Character.toString(targetWord.charAt(i));
            
            if (temp.equalsIgnoreCase(pairsList.get(j).getLetter()))
            {
               builtList.add(temp);
            }
         }    
      }
      
      this.builtWord = convertArrayListToString(builtList);
   }
   
   public String convertArrayListToString(ArrayList<String> arrayList)
   {
      String str = String.join("", arrayList);
      return str;
   }

   public String getBuiltWord() 
   {
      return this.builtWord;
   } 
  
}
