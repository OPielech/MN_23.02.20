public class CarBreaking implements CalculateAcceleration2 {
    @Override
    public double a(double v) {
        return 0.7*9.81-0.86*Math.pow(v,2)/1200;
    }//end of a
}//end of class
