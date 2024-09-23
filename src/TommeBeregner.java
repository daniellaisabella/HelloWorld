import java.sql.SQLOutput;
import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {

        //Laver et Scanner objekt:

        Scanner input = new Scanner(System.in);


        //Præsentation:
        String tommeCm = "Dette program regner tommer om til centimeter";

        final double OMREGN = 2.54;

        String indtast = "Indtast tommer nedenfor:";
        String er = " tommer svarer til ";
        String cm = " centimeter";

        System.out.println(tommeCm);
        System.out.println(indtast); //spørgsmålet
        double tommer = input.nextDouble(); //input fra bruger
        System.out.println(tommer+er+(tommer*OMREGN)+cm); // output fra input fra bruger



    }
}
