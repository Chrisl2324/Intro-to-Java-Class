import java.util.Arrays;
public class NoTriples {

    public static void main(String[] args){
        int[] result = new int[]{1, 1, 1, 2, 2, 2, 3, 4};
        boolean array = noTriples(result);
        System.out.println(array);
    }
    public static boolean noTriples(int[] num){
        for(int i = 0; i < num.length; i++){
            if (num[i] == num[i+1] && num[i+1] == num[i+2]){
                return false;
            }
        }return true;
    }
}
