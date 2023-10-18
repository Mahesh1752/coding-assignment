 import java.util.*;   
import java.io.*; 
class Panagram {
public static void containAllLetters(String string)  
{  
string = string.toLowerCase();  
boolean allLetterPresent = true;  
for (char ch = 'a'; ch <= 'z'; ch++)   
{  
if (!string.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  
}  
}  
if (allLetterPresent)  
System.out.println("Pangram String");  
else  
System.out.println("Not a Pangram String");  
} 
public static void main(String args[])  
{  
// String string = "Abcdefghijklmnopqrstuvwxyz12";  
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the string");
 String string = sc.next();
containAllLetters(string);  
}  

}