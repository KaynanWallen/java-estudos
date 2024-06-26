//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);

        boolean includeInPlan = true;
        double filmNote = 8.1;
        double average =( 9.8 + 6.3 + 8.0 )/ 3;
        String synopsi;
        synopsi = """
                    Filme Top Gun
                    Filme de aventura
                    Muito bom
                    Ano de lançamento: 
                """ + releaseYear;
        System.out.println(synopsi);

        int classification;
        classification = (int) (average / 2);
    }
}