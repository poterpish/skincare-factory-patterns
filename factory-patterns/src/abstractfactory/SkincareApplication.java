package abstractfactory;

public class SkincareApplication {

    private final Cleanser cleanser;
    private final Moisturizer moisturizer;
    private final Sunscreen sunscreen;

    public SkincareApplication(SkincareFactory factory) {
        cleanser = factory.createCleanser();
        moisturizer = factory.createMoisturizer();
        sunscreen = factory.createSunscreen();
    }

    public void useRoutine() {
        cleanser.use();
        moisturizer.use();
        sunscreen.use();
    }
}