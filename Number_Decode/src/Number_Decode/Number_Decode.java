package Number_Decode;

public class Number_Decode {
    public int helper(String userInput, int length){
        if(length ==0){
            return 1;
        }
        int start = userInput.length() - length;
        if(userInput.charAt(start)=='0'){
            return 0;
        }

        int result = helper(userInput, length-1);
        if(length>=2 && Integer.parseInt(userInput.substring(start,start+2))<=26){
            result = result + helper(userInput, length-2);
        }
        return result;

    }

    public int number_decode(String userInput, int length){
        return helper(userInput, length);
    }
}
