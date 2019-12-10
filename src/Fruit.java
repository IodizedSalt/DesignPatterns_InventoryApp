public class Fruit extends Item {

    private String itemName;

    public GreensStrategy getStrategy() {
        return new GreensStrategy();
    }

}
