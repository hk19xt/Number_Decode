package Number_Decode;

public class Main {
    public static void main (String[] args){
        Number_Decode ND = new Number_Decode();
        String userInput = "226";
        int length = userInput.length();
        int result;
        result = ND.number_decode(userInput,length);
        System.out.println(result);
    }
}
