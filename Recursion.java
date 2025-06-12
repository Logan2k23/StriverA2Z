import java.util.Scanner;

public class Recursion {
   static int count=0;
    public  static void print(int sum,int n){
     
        if(count<n){
            sum=sum+count;
            System.out.println(sum);
            count++;
        }
            print(sum,n);
            //System.out.println(count);
        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        print(0,n);
    }
}
