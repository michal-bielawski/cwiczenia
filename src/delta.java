import java.util.Scanner;

public class delta {
    public static void main(String[] args) {
        float a,b,c,x1,x2, delta;
        int iloscPierwiastkow;

        Scanner in = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Podaj a: ");
        a = in.nextFloat();

        while (a == 0){
            System.out.println("Liczba 'a' nie można być równa 0. \n Podaj a: ");
            a = in.nextFloat();
        }

        System.out.println("Podaj b");
        b = in.nextFloat();
        System.out.println("Podaj c");
        c = in.nextFloat();

        delta = (float)Math.pow(b, 2) - 4.00f * a * c;

        if(delta < 0) iloscPierwiastkow = 0;
        else if( delta == 0) iloscPierwiastkow = 1;
        else iloscPierwiastkow = 2;

        switch (iloscPierwiastkow){
            case 0:
                System.out.println("Funkcja nie ma miejsc zerowych");
                break;
            case 1:
                x1 = -b/(2 * a);
                System.out.println("Jedno miejsce zerowe: " + x1);
                break;
            case 2:
                x1 = (-b + (float)Math.sqrt(delta))/(2 * a);
                x2 = (-b - (float)Math.sqrt(delta))/(2 * a);
                System.out.println("Dwa miejsca zerowe: "+ x1 + " i " + x2);
                break;
        }


    }
}
