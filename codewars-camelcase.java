/**
 * Author: @wanghley (Wanghley Soares Martins)
 * Date: 2023-03-01
 * Description: Convert string to camel case
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
 */
class Solution{

  static String toCamelCase(String s){
    String n = ""; 
    String[] words = s.split(""); //get all characters of string
    for (int i = 0; i < words.length; i++) {
        if(words[i].equals("-") || words[i].equals("_")){ // verify where happens the necessity for camel case
            words[i+1] = words[i+1].toUpperCase(); // makes next work uppercase
            continue; // go to next value and do not add - to the return string
        }
        n += words[i];
    }
    return n;
  }
  public static void main(String[] args) {
    System.out.println(toCamelCase("the-stealth-warrior"));
  }
}