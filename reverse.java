public class reverse{
    public static void main(String[] args) {
        char[] arr = {'A','B','C','D','E','F','G','H','I','J'};
        for(int i = 0; i<(arr.length/2); i++){
            int L = arr.length-1;
            char pre = arr[i];
            arr[i] = arr[L-i];
            arr[L-i] = pre;
        }
        for(int i = 0;i < arr.length;i++) System.out.print(arr[i] + " ");
    }
}