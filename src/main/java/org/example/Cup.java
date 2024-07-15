package org.example;

public class Cup {
    Liquid liquid;

    public<T extends Liquid> T fillOutLiquid(T liquidType){
        liquid = liquidType;
        return liquidType;
    }

    public void clearUpLiquid(){
        this.liquid = liquid;
    }

    Cup(Liquid Liquid){
        this.liquid = Liquid;
    }
    Cup(){

    }
}
