// what is a hashMap?
//Think of a HashMap like a dictionary. In a dictionary, you have words and their meanings
//Similarly, in a HashMap, you have keys (like words) and values (like meanings).
//When you want to find the meaning of a word, you look it up in the dictionary using the word itself
//Similarly, when you want to find a value in a HashMap, you look it up using its corresponding key.
 // ****also hover the mouse over -----> HashMap      (VS code explaination****)

 // also while nameing the keys and value use the primitive form like Integers for int ...etc
//(usally caplocks and rest will be shown by vscode )

 // this is a example of using HashMap
 // in a HashMap of employee IDs, the employee names are the keys and the IDs are the values. 
 //So, if you want to find the ID of an employee named "Roy",
 // you would look it up in the HashMap using "Roy" as the key,
 //and it would give you the corresponding ID.
 // HashMaps are really efficient for looking up values quickly,
 // just like finding meanings in a dictionary.

 // also HashMaps can beof any vakues and keys like eg
 //HashMap<Integer, Integer> AiIds = new HashMap<>();... where both key and values are integers 

 // This is a Java program demonstrating the usage of HashMaps.

package new_concepts;

import java.util.HashMap;

public class hash_maps {
         public static void main (String []args){
          // Creating a new HashMap named 'empids' with String keys and Integer values.
         HashMap<String,Integer> empids= new HashMap<>();
         // Adding entries to the 'empids' HashMap.
         // Here, each entry consists of a name (String) mapped to an employee ID (Integer)
         empids.put("Roy", 314);
         empids.put("rol", 3014);
         empids.put("ric", 319);
         // Printing the HashMap 'empids'.
         System.out.println(empids);
         //to get a specific value for a key "Roy" from the HashMap empids**.
         System.out.println(empids.get("Roy"));
         //to check if there is an existing key "rol" (input = true** if exist/ false** if not exists)
         System.out.println(empids.containsKey("rol"));
         // to check if there is an exixting value 314** in the HAshMap empids
         System.out.println(empids.containsValue(314));
         //override the key "ric"
         empids.put("ric", 914);
         System.out.println(empids);
         
         // add if the key and value does not exist in the HashMap empids.
         empids.putIfAbsent("cel",121);
         // remove the key and value of ric*
         empids.remove("ric");
         System.out.println(empids);
 
     }
 }

 //This program creates a HashMap named empids** to store employee IDs associated with their names.
 //It adds three entries to this HashMap using the put method,
 // where each entry consists of a name (a String) 
 //and an employee ID (an Integer). 
 //Finally, it prints out the contents of the HashMap.
 
 
 
 
 
 