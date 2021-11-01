package edu.parinya.softarchdesign.structural;

public class HealthcareWorkerDecorator extends HealthcareWorker{

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        //TODO Auto-generated constructor stub
    }

    public void service() {

    }

    public double getPrice() {

        return 0;
    }

}
