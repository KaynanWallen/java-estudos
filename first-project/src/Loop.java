import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averangeAvaliation = 0;
        double note = 0;


        for (int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme");
            note = reading.nextDouble();
            averangeAvaliation  += note;
        }

        System.out.println("Média de avaliações: " + averangeAvaliation / 3);

    }
}

