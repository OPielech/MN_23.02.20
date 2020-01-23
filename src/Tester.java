import java.io.FileNotFoundException;

public class Tester {

    public static void main(String[] args) {
        VerletIntegrator verletIntegrator = new VerletIntegrator(0.01);
        Analyzer analyzer = new Analyzer();
        TennisToss tennisToss = new TennisToss();

        verletIntegrator.integrate(tennisToss, analyzer, 0, 20, 1.5, 5.2);
        // to tStop tak od buta wzięte

        try {
            analyzer.saveToFile("test.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //max(x) to odpowiedź do zadania w matlabie robiliśmy
    }//end of main
}//end of class
