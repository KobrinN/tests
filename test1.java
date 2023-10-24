import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String str;
        int N;
        boolean flg = false;
        Scanner in = new Scanner(System.in);

        str = in.next();
        try{
            N = in.nextInt();
            if(N > 0){
                for(int i = 0; i < N; i++){
                    System.out.println(str);
                }
            }
            else{
                System.out.println(str);
            }
        }
        catch(InputMismatchException exception) {
            System.out.println(str);
        }
    }
}