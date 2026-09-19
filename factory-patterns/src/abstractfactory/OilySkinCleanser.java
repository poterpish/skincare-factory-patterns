package abstractfactory;

public class OilySkinCleanser implements Cleanser {

    @Override
    public void use() {
        System.out.println("Using gel cleanser for oily skin.");
    }
}