public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean includeInPlan = true;
        double filmNote = 8.1;
        String typePlan = "plus";


        if(releaseYear >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(includeInPlan || typePlan.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
