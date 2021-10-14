package core;

import java.util.ArrayList;
import java.util.Random;

public class Controller 
{

   public static void main(String[] args) 
   {
      Controller controller = new Controller();
      controller.run();
   }
   
   public void run()
   {
      ArrayList<Integer> setOfIntegers = new ArrayList<Integer>();
      int n = setOfIntegers.size();
      
      for (int i = 0; i < 11; i++)
      {
         setOfIntegers.add(generateRandomNum(1, 7));
      }
      
      printArrayList(setOfIntegers);
      ArrayList<String> setofAlphaValues = convertToAlphaValues(setOfIntegers);
      printArrayList(setofAlphaValues);
      // mergeSort(setOfIntegers, n);
      
   }
   
   public int generateRandomNum(int min, int max) 
   {
      Random random = new Random();
      return random.nextInt(max - min) + min;
   }
   
   public ArrayList<String> convertToAlphaValues(ArrayList<Integer> setOfIntegers)
   {
      ArrayList<String> setOfAlphaValues = new ArrayList<String>();
      
      for (int i = 0; i < setOfIntegers.size(); i++)
      {
         switch (setOfIntegers.get(i)) 
         { 
            case 1: setOfAlphaValues.add("h");
                    break;
            case 2: setOfAlphaValues.add("e");
                    break;
            case 3: setOfAlphaValues.add("l");
                    break;
            case 4: setOfAlphaValues.add("o");
                    break;
            case 5: setOfAlphaValues.add("w");
                    break;
            case 6: setOfAlphaValues.add("r");
                    break;
            case 7: setOfAlphaValues.add("d");
                    break;
            default: break;  
         }
      }
      
      return setOfAlphaValues;
   }
   
   /*
    * Sorts array via recursive merge sort algorithm. 
    * 
    * @pparam a the array to be sorted
    * @param n the length of array
    * 
    * @return the sorted array
    */
   public void mergeSort(int[] a, int n) 
   {
      if (n < 2) 
      {
          return;
      }
      int mid = n / 2;
      int[] l = new int[mid];
      int[] r = new int[n - mid];

      for (int i = 0; i < mid; i++) 
      {
          l[i] = a[i];
      }
      for (int i = mid; i < n; i++) 
      {
          r[i - mid] = a[i];
      }
      mergeSort(l, mid);
      mergeSort(r, n - mid);

      merge(a, l, r, mid, n - mid);
  }
   
   /*
    * Utilized by mergesort() as utility function  
    */
   public static void merge(
         int[] a, int[] l, int[] r, int left, int right) 
   {
        
           int i = 0, j = 0, k = 0;
           while (i < left && j < right) 
           {
               if (l[i] <= r[j]) 
               {
                   a[k++] = l[i++];
               }
               else {
                   a[k++] = r[j++];
               }
           }
           while (i < left) 
           {
               a[k++] = l[i++];
           }
           while (j < right) {
               a[k++] = r[j++];
           }
       }
   
   public void printArrayList(ArrayList<?> setOfInts)
   {
      for (int i = 0; i < setOfInts.size(); i++) 
      {   
         System.out.print("[" + setOfInts.get(i) + "]");
      } 
      System.out.println();
   }

} 
