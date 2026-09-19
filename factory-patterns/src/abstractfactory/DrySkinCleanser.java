package abstractfactory;

public class DrySkinCleanser implements Cleanser {

    @Override
    public void use() {
        System.out.println("Using gentle cleanser for dry skin.");
    }
}