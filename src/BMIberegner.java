import java.util.Scanner;

public class BMIberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Præsentation:
        String pres = "Dette program beregner dit BMI";
        String angivv = "Angiv din vægt i kilogram:";
        String angivh = "Angiv din højde i meter:";
        String res = "Dit BMI = ";
        System.out.println(pres);

        System.out.println(angivv);
        double bmivaegt = input.nextDouble();
        System.out.println(angivh);
        double bmihojde =input.nextDouble();
        System.out.println(res+bmivaegt/(bmihojde*bmihojde));

        String under = "Dit BMI ligger i intervallet Undervægtig";
        String normal = "Dit BMI ligger i intervallet Normalvægtig";
        String over = "Dit BMI ligger i intervallet Overvægtig";
        String fedmeI = "Dit BMI ligger i intervallet Fedmeklasse I";
        String fedmeII = "Dit BMI ligger i intervallet Fedmeklasse II";
        String fedmeIII = "Dit BMI ligger i intervallet Fedmeklasse III";

        if (bmivaegt/(bmihojde*bmihojde)<18.5) {
            System.out.println(under);
        } else if (bmivaegt/(bmihojde*bmihojde)<24.9){
            System.out.println(normal);
        } else if (bmivaegt/(bmihojde*bmihojde)>=25){
            System.out.println(over);
        } else if (bmivaegt/(bmihojde*bmihojde)>=30){
            System.out.println(fedmeI);
        } else if (bmivaegt/(bmihojde*bmihojde)>=35){
            System.out.println(fedmeII);
        } else if (bmivaegt/(bmihojde*bmihojde)>=40){
            System.out.println(fedmeIII);
        }

    }
}