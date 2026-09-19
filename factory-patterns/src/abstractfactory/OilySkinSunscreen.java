package abstractfactory;

public class OilySkinSunscreen implements Sunscreen {

    @Override
    public void use() {
        System.out.println("Using matte sunscreen for oily skin.");
    }
}