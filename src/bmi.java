import java.util.Scanner;
import java.math.*;

public class bmi {
    public static void main(String[] args) {
        float wagaBielawski, wzrostBielawski, bmiBielawski;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wagę: ");
        wagaBielawski = in.nextFloat();
        System.out.println("Podaj wzrost(cm): ");
        wzrostBielawski = in.nextFloat();
        wzrostBielawski /= 100.00f;

        bmiBielawski = (float)(wagaBielawski / (float)Math.pow(wzrostBielawski, 2));

        System.out.println("Twoje BMI: " + bmiBielawski);

        if(bmiBielawski < 16.00f) System.out.println("Wygłodzenie");
        else if (bmiBielawski < 17.00f) System.out.println("Wychudzenie");
        else if (bmiBielawski < 18.50f) System.out.println("Niedowaga");
        else if (bmiBielawski < 23.00f) System.out.println("Norma niski przedział");
        else if (bmiBielawski < 25.00f) System.out.println("Norma wysoki przedział");
        else if (bmiBielawski < 27.50f) System.out.println("Nadwaga niski przedział");
        else if (bmiBielawski < 30.00f) System.out.println("Nadwaga wysoki przedział");
        else if (bmiBielawski < 35.00f) System.out.println("Otyłość I stopnia");
        else if (bmiBielawski < 40.00f) System.out.println("Otyłość II stopnia");
        else System.out.println("Nadwaga");
    }
}
