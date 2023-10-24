import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int literPerBuster;
        int busterPerWeek;

        Scanner in = new Scanner(System.in);
        try{
            busterPerWeek = in.nextInt();
            literPerBuster = in.nextInt();
            if (busterPerWeek > 0 && literPerBuster > 0){
                int kolLiters = 0;

                for (int i = 0; i < 16; i++){
                    kolLiters = kolLiters + (busterPerWeek * literPerBuster);
                    System.out.println("К " + (i+1) + " неделе будет выпито " + kolLiters + " литров жидкости");
                }

                if (kolLiters >= 120){
                    System.out.println("Студент принят в IT-клуб");
                }
                else {
                    System.out.println("К сожалению, студент не принят в клуб");
                }
            }
            else {
                System.out.println("Введены некорректные данные");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Введены некорректные данные");
        }
    }
}