public class Spice extends Item {

    @Override
    public Strategy getStrategy(){
        return new SpiceStrategy();
    }

}
