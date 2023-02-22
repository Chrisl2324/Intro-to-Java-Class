public class Last2 {

    public static void main(String[] args){
        int result = last2("axxxaaxx");
        System.out.println(result);
    }

    public static int last2(String str){
        int count = 0;
        String end = str.substring(str.length() -2);
        for(int i = 0; i < str.length() -2; i++){
        String sub = str.substring(i, i+2);
            if(sub.equals(end)){
                count++;
            }

        }return count;
} }
