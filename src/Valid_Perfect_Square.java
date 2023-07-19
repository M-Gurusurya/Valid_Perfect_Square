import java.util.Scanner;

public class Valid_Perfect_Square {
    static int k=1;
    public static boolean findPerfectSquare(int num)
    {
        if(k*k==num)
            return true;
        else if(k*k>num)
            return false;
        else
        {
            k++;
            return findPerfectSquare(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(findPerfectSquare(num));
    }
}
