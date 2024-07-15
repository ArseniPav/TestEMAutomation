package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        Cup<Tea> cupOfTea = new Cup<>(new Tea());
//        Cup<Coffe> cupOfCoffee = new Cup<>(new Coffe());
//         Cup<Car> cupCar = new Cup<>(new Car());

        MyFunctional<Integer,Integer> f1 = (a,b)->5*7;
        MyFunctional<Double,Double> f2 = (a,b)->5.83 + 3.43;
        MyFunctional<Byte,Byte> f3 = (a,b)->(byte)(3+1);




        Cup testCup = new Cup();
        testCup.fillOutLiquid(new Water());
        testCup.clearUpLiquid();
        testCup.fillOutLiquid(new Cola());
    }
}

