import java.util.Arrays;
import java.util.Scanner;
public class isVowel {

    public static void main(String[] args) {
    result();
    }
    public static void result(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i))){
                count++;}
        }
        System.out.println("Vowel #: " + count);
    }
    public static boolean isVowel(char x){
        char charArray[] = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        for(char i: charArray) {
            if (x == i) {
                return true;
            }
        }
        return false;}

}



