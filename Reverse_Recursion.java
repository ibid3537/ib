import java.util.*;
public class Reverse_Recursion{
    public static Scanner keyin = new Scanner(System.in);
    public static void main(String[] args) {
        Reverse_Recursion R = new Reverse_Recursion();
        System.out.print("Plese enter string : ");
        String input = keyin.nextLine();
        System.out.println(R.recursion(input));
    }
    public String recursion(String S){
        if(S.length() == 0) return "";
        else return recursion(S.substring(1)) + S.substring(0,1);
    }
}