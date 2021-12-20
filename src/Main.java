import java.util.Scanner;
public class Main {

    static int calc(int a){
        int temp = a;


        while(a > 0){

            a -= 5;
            System.out.println(a);

        }
        if( a <= 0){
            for(int j = a ; j < temp; j+=5 ){

                System.out.println(j);

            }

        }
        return temp ;
    }




    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        int n = inp.nextInt();

        System.out.println(calc(n));


    }
}
