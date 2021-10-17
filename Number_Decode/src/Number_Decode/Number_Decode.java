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

        //The first case: 27345 => "27" cannot be decoded, so we don't care about it. We only calculate "2","7345" in this case. 
        int result = helper(userInput, length-1); //"7345" is the length - 1.
        
        //The second case: 21345 => "21" can be decoded, so we should consider it in two ways. "2", "1345" (-> the first case already cover it) and "21", "345" in this case.
        if(Integer.parseInt(userInput.substring(start,start+2))<=26 && length>=2){ //Check two conditions: 1) whether the length is bigger and equal to 2, 
            //2) two digits are less and equal to 26 (since the number of decoding alphabet is upto 26) 
            result = result + helper(userInput, length-2); //"345" is the length - 2.
        }
        return result;

    }

    //This method is for calculating the possible number of decoding way recursively.
    public int number_decode(String userInput, int length){
        return helper(userInput, length);
    }
}//Number_Decode
