public class Vegetable extends Item{

    public GreensStrategy getStrategy() {
        return new GreensStrategy();
    }

}
