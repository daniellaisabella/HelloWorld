import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {


        // lav et Scanner objekt:

        Scanner input = new Scanner(System.in);

        //System.in fungerer omvendt af System.out som
        // I allerede kender: System.out gør at man
        // kan skrive ud til konsollen, og System.in
        // at man kan læse ind fra den

        // Fra opgaven Class 'Tid':


        String midnat = "Hvor mange timer er det gået siden midnat?";
        String minutmidnat = "Hvor mange minutter er der gået siden midnat?";
        String sekundmidnat ="Hvor mange sekunder er der gået siden midnat?";

        String tidsiden = "Siden midnat er der gået ";
        String timer = " timer"; String minutter = " minutter"; String sekunder = " sekunder";


        // Skriv en sout med Hvor mange timer er der gået?:

        System.out.println(midnat); //spørgsmålet
        int time = input.nextInt(); //input fra bruger
        System.out.println(tidsiden+time+timer); // output fra input fra bruger

        System.out.println(minutmidnat);
        int minut = input.nextInt();
        System.out.println(tidsiden+minut+minutter);

        System.out.println(sekundmidnat);
        int sekund = input.nextInt();
        System.out.println(tidsiden+sekund+sekunder);

        // Hvor lang tid er der gået i sekunder, brug brugerens input

        String timersek = "hvor mange timer er der gået i sekunder? ";
        String minutsek = "Hvor mange minutter er der gået i sekunder? ";
        //for sekunder bruges String sekundmidnat fra tidligere

        int sekunderitime = 3600; // de int kan også skrives som konstanter
        int sekunderiminut  = 60;


        //Hvor mange timer gået i sekunder? med udregning med brugerens input:
        System.out.println(timersek+(time*sekunderitime));

        //Hvor mange minutter gået i sekunder? med udregning med brugerens input:
        System.out.println(minutsek+(minut*sekunderiminut));




    }
}
