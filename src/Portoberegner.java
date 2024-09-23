import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String præs = "Portoberegner. Angiv brevets vægt:";
        System.out.println(præs);

        // Højst 100 g = 25,00 kr.
        // Højst 250 g = 50,00 kr.
        // Højst 2.000 g = 75,00 kr.

        int pris = 0;
        int vægt = input.nextInt();

        String koster = "Det koster ";
        String kr =" kr.";

        if (vægt <=0 || vægt >2000)
            System.out.println("Et brev med denne vægt kan vi ikke sende");

        else if (vægt<=100){
            pris=25;}
        else if (vægt<=250){
            pris=50;}
        else {
            pris=75;
        }

        if (pris < 0 ) {
            System.out.println(koster + pris + kr);
        }




    }
}
