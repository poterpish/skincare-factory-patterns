package abstractfactory;

public interface SkincareFactory {

    Cleanser createCleanser();

    Moisturizer createMoisturizer();

    Sunscreen createSunscreen();
}