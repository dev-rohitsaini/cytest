import java.util.*;
public class Palindronme {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.next();
        char[] ch=   str.toLowerCase().toCharArray();

        int n=ch.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)ch[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[n-1-i]){
                count=-1;
            }
        }
        if(count==0){
            System.out.print("The string is an palindrome");
        }

    }
}