import java.io.FileNotFoundException;

public class TesterEulerCromer {

    public static void main(String[] args) {
        EulerCromerIntegrator eulerCromerIntegrator = new EulerCromerIntegrator(0.01);
        Analyzer analyzer = new Analyzer();
        CarBreaking carBreaking = new CarBreaking();

        eulerCromerIntegrator.integrate(carBreaking, analyzer, 0, 20, 0, 83.3);
        // to tStop tak od buta wzięte

        try {
            analyzer.saveToFile("test2.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
