package abstractfactory;

public class DrySkinFactory implements SkincareFactory {

    @Override
    public Cleanser createCleanser() {
        return new DrySkinCleanser();
    }

    @Override
    public Moisturizer createMoisturizer() {
        return new DrySkinMoisturizer();
    }

    @Override
    public Sunscreen createSunscreen() {
        return new DrySkinSunscreen();
    }
}