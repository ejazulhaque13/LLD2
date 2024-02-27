package LLD2_9_24.ExceptionHandling.Demo4;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =0;
        do{
            y = sc.nextInt();
            if(y==0){
                System.out.println("Wrong value, y can't be 0");
            }
        }while (y==0);
        int res = x/y;
        System.out.println(res);
    }
}
