package abstractfactory;

public class OilySkinMoisturizer implements Moisturizer {

    @Override
    public void use() {
        System.out.println("Using light moisturizer for oily skin.");
    }
}