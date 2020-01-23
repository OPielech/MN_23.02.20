public class VerletIntegrator {

    private double dt;

    public VerletIntegrator(double dt) {
        this.dt = dt;
    }

    public void integrate(CalculateAcceleration calculateAcceleration, ODEUpdate odeUpdate,
                          double tStart, double tStop, double x0, double v0){

        int nSteps = (int) ((tStop - tStart)/dt);
        double x = x0;
        double v = v0;
        double t = tStart;

        odeUpdate.update(t,x,v);

        double a = calculateAcceleration.a(x);

        for(int i = 0;i<nSteps;i++){
            //połówkowe wartości ze wzoru z zad 1

            double vHalf = v+dt*a/2;
            double xNew = x+dt*vHalf;
            double aNew = calculateAcceleration.a(xNew);
            //imo tu powinno być vHalf a nie v
            double vNew = v+dt*(a+aNew)/2;//średnia

            a= aNew;
            t+=dt;
            x = xNew;
            v = vNew;
            odeUpdate.update(t,x,v);
        }//end of for

    }//end of integrate
}//end of class
