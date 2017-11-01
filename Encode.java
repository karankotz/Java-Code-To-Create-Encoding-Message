/*
Problem Description :

Encoding the string,taking each character, and "encrypting" it by changing
it to the next letter. Basically, a is b, b is c, c is d, and etc. It isn't secure but it isn't meant to be for these purposes. 
The scanned string can be anything as an example, "Orange juice is great! I drank 83,214 cups of it yesterday.

The string is encoded as per the below scenarios

The  encryption technique is to replace each letter with the place it as is in the alphabet. 
We will use two digits for every letter. For example, the letter ‘a’ is 01, the letter ‘b’ is 02, the letter ‘c’ is 03, the letter ‘z’ is 26. 
So that we can use capital letters we start ‘A’ with 27, ‘B’ with 28, ‘C’ with 29, and so on.

For numbers, we convert each digit into two letters: the first two letters that they stand for. 
The first letter is capitalized followed by a lower-case letter. For example, 8 written out is eight.
 So, 8 would be encrypted to “Ei”, 1 would be encrypted to “On”, 2 would be encrypted to “Tw”, 3 would be “Th” and so on.

Note that “10” is actually two digits, so it would be encrypted as “1” and “0”: “OnZe”

If you come to a non-letter character (spaces, punctuation, numbers, etc.), just print them as is without encrypting.
*/

//Solution for a sample string

import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Encode
{  
  
         //author sai-Karan
         public static String findstringmap(char c)
    {
        //Create a hashmap and add the key elements and the string definitions
      HashMap <Integer, String> hmap = new HashMap <Integer, String>();
       
       /*Adding elements to HashMap*/
      hmap.put(1, "One");
      hmap.put(2, "Two");
      hmap.put(3, "Three");
      hmap.put(4, "Four");
      hmap.put(5, "Five");
      hmap.put(6, "Six");
      hmap.put(7, "Seven");
      hmap.put(8, "Eight");
      hmap.put(9, "Nine");
      hmap.put(0, "Zero");
      
      /* Get values based on key*/
      int num_value = Character.getNumericValue(c);
      //convert to the numeric value
      String var = hmap.get(num_value);
      //get the substring
      String ret_str = var.substring(0, 2);
      return ret_str;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String l1 = "Orange juice is great! I drank 83,214 cups of it yesterday.";
        //String final contains the result
         String Final = "";
         String next = "";
        for(int i =0 ; i< l1.length(); i++)
        {
           //char c = l1.charAt(i);
            
            if (l1.charAt(i) == ' ')
            {
             next = " ";
            }
            else if (l1.charAt(i) == '!')
            {
             next = "!";
            }
            else if(l1.charAt(i) == ',')
            {
                next = ",";
            }
            else if(l1.charAt(i) == '.')
            {
                next = ".";
            }
            else if(!(Character.isDigit(l1.charAt(i))))
           {
           int val = l1.charAt(i);
           next = String.valueOf( (char) (val + 1));
           
           // System.out.println(next);
           }
           else if(Character.isDigit(l1.charAt(i)))
           {
               next = findstringmap(l1.charAt(i));
               
           }
           Final = Final + next;
           
        }
        System.out.println(Final);
    }
    
       
    }