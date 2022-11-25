package core;

public class Controller 
{

   public static void main(String[] args) 
   {
      System.out.println("[INFO] Starting program...");
      Controller controller = new Controller();
      String helloWorld = controller.run(28);
      System.out.println(helloWorld);
   }
   
   public String run(int size)
   {
      int iteration = 0;
      boolean isMatch = false;
      String attemptWord = null;
      
      String targetWord = "Hello World.";
      System.out.println("[INFO] Target word set as [" + targetWord + "]...");
      
      while (isMatch == false)
      {  
         // System.out.println("[INFO] Generating randomized set of integer/letter pairs...");
         SetOfPairs pairs = new SetOfPairs(size);
         
         // System.out.println("[INFO] Building word from set of pairs...");
         WordBuilder builder = new WordBuilder(targetWord, pairs);
         attemptWord = builder.getBuiltWord(); 
         
         Hasher hasher = new Hasher();
         long targetHash  = hasher.performPolynomialRollingHash(targetWord);
         long attemptHash = hasher.performPolynomialRollingHash(attemptWord);
         
         isMatch = hasher.compareHash(targetHash, attemptHash);
         
         if (isMatch == true) 
         {
            iteration++;
            System.out.println("[INFO] [Attempt: "+ attemptWord + "]" + 
                  "[Match?: " + isMatch + "]" +
                  "[Iteration #: " + iteration + "]");
         }
         else
         {
            iteration++;
            System.out.println("[INFO] [Attempt: " + attemptWord + "]" + 
                  "[Match?: " + isMatch + "]" + 
                  "[Iteration: " + iteration + "]");
         }
      }
      
      return attemptWord;
   }
   
} 
