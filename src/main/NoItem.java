package main;

import strategy.Strategy;

public class NoItem extends Item  {

    public Strategy getStrategy() {
        return null;
    }
}
