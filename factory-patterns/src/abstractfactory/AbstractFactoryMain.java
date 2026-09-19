package abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        String skinType = "dry";

        SkincareFactory factory;

        if (skinType.equalsIgnoreCase("dry")) {
            factory = new DrySkinFactory();
        } else {
            factory = new OilySkinFactory();
        }

        SkincareApplication application = new SkincareApplication(factory);
        application.useRoutine();
    }
}