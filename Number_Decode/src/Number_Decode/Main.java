package Number_Decode;

/* This class is the main class. 
The users can change their input string values in the hardcoded line. (The length will be automatically calculated.) 
The output will be calculated recursively in the implementation class.

Name: Hyejin Kim
Date: 10/16/2021
*/

public class Main {
    public static void main (String[] args){
        Number_Decode ND = new Number_Decode();
        String userInput = "3241"; //Users can change their input string value here.
        int length = userInput.length(); //The length of a user's input string.
        int result;
        result = ND.number_decode(userInput,length);
        System.out.println(result);
    }
}//Main
