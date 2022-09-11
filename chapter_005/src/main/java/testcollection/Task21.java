package testcollection;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите (нечетное число) ширину песочных часов: ");
        int a = sc.nextInt();

        for (int i=1; i<=a; i++) {
            System.out.println();
            for (int j=1; j<=a; j++) {
                if (j>=i && j<=a-i+1 || j<=i && j>=a-i+1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        sc.close();

    }
}

class Watch {
    public void go(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Введите количество символов : ");
        int number = reader.nextInt();

        String cr = "*";
        int a = number;
        int b = 0;
        boolean on = true;
        boolean onN = false;

        for(int i = 0; i < number; i++){

            for (int j = 0; j < a; j++){
                System.out.print(cr);
            }

            System.out.println();

            if(on) {
                a -= 2;
                b++;
            }

            if (a == 0 || a < 0){
                on = false;
                onN = true;
            }

            if(on) {
                for (int h = 0; h < b; h++) {
                    System.out.print(" ");
                }
            }

            if(onN){
                a+=2;
                b--;

                for (int h = 0; h < b; h++) {
                    System.out.print(" ");
                }
            }

            if(b == 0){
                number++;
            }
        }
    }
}

