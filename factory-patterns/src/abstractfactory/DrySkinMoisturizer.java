package abstractfactory;

public class DrySkinMoisturizer implements Moisturizer {

    @Override
    public void use() {
        System.out.println("Using rich moisturizer for dry skin.");
    }
}