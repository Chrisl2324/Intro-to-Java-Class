public class DoubleX {

    public static void main(String[] args){
        boolean result = doubleX("axaxax");
        System.out.println(result);
    }
    public static boolean doubleX(String str){
        int firstX = str.indexOf('x');
        return str.charAt(firstX + 1) == 'x';
    }
}
