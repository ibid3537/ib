import java.util.*;
public class Remove_char{
    public static Scanner keyin = new Scanner(System.in);
    public static void main(String[] args){
        Remove_char RC = new Remove_char();
        System.out.print("Plese input string : ");
        String input = keyin.nextLine();
        System.out.print("Enter remove char : ");
        String RM = keyin.nextLine();
        System.out.println(RC.remove(input, RM));

    }
    public String remove(String S, String R){
        if(S.length() == 0) return "";
        else
            if(S.substring(0,1).equals(R)) return remove(S.substring(1), R);
            else return S.substring(0,1) + remove(S.substring(1), R);
    }
}