import java.util.Scanner;

public class Staires {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            for (int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
