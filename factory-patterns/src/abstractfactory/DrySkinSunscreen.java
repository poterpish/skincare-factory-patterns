package abstractfactory;

public class DrySkinSunscreen implements Sunscreen {

    @Override
    public void use() {
        System.out.println("Using hydrating sunscreen for dry skin.");
    }
}