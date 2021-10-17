package Number_Decode;

/*This class is the implementation class. 
The possible number of decoding the user input string will be calculated recursively. The detailed explanation will be provided below. */

public class Number_Decode {

    
    //This helper will calculate whether each character can be decoded or not, adding the number of possible ways to decode.
    public int helper(String userInput, int length){
         
        int start = userInput.length() - length;
        
        //Base case : if there is no string by user input, then it will return one because there is only one way to decode it.
        if(length == 0){
            return 1;
        }
        
        //Before starting the calculation, we should consider the base case conditions.
        if(userInput.charAt(start)=='0'){ //If there is zero at the beginning of the string, then it will return zero.
            return 0;
        }

        int result = helper(userInput, length-1);
        
        if(Integer.parseInt(userInput.substring(start,start+2))<=26 && length>=2){
            result = result + helper(userInput, length-2);
        }
        return result;

    }

    //This method is for calculating the possible number of decoding way recursively.
    public int number_decode(String userInput, int length){
        return helper(userInput, length);
    }
}//Number_Decode
