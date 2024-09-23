public class Tid {
    public static void main(String[] args) {
        int sek1 = 25;
        int minut = 58;
        int time = 9;

        String sek2 = "Sekunder:";
        String midnat = "Siden midnat er der gået ";
        String sek3 = " sekunder";
        String tilbage = " sekunder tilbage i døgnet";

        int minsek = 60;
        int timesek= 3600;
        int sekdogn = 86400;
        int sekunderSidenMidnat = sek1+(minut*minsek)+(time*timesek);


        System.out.println(sek2+sek1);
        System.out.println(midnat+sekunderSidenMidnat+sek3);
        System.out.println(sekdogn-sekunderSidenMidnat+tilbage);

        //Hjemmeopgave
        //opgave 1
        String procentTime = "Procentdel af time, der er gået: ";
        System.out.println(procentTime+minut*100/60);

        //opgave 2
        double minut2 = 58.0;

        String brokdelTime ="Brøkdel af en time, der er gået:";
        System.out.println(brokdelTime+minut2/60);

        //opgave 3: int til midlertidig double
        System.out.println(brokdelTime+(double)minut/60);

        //opgave 4: Konstanter og literals
        final int MINUTTER_PER_TIME=60;
        System.out.println(brokdelTime+minut2/MINUTTER_PER_TIME);

    }
}
