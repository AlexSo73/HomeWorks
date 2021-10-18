package Lesson_04;

import java.util.ArrayList;

public class FruitBox<F> {
    ArrayList<F> fruits = new ArrayList();
    private double FruitWeight =0.0;

    public <F> FruitBox(double FruitBox) {
        this. FruitWeight = FruitWeight;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight() {
        return fruits.size() * FruitWeight;
    }
    public boolean compare(FruitBox<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight() )  < 0.00001;

    }
    public void addFruits(FruitBox<F> fruitBox) {
        System.out.println("До добавления Коробка 1:" +fruits.size());
        System.out.println("До добавления Коробка 2:" +fruitBox.fruits.size());
        fruits.addAll(fruitBox.fruits);
        fruitBox.fruits.clear();

        System.out.println("После добавления Коробка 1:"+fruits.size());
        System.out.println("После добавления Коробка 2:" +fruitBox.fruits.size());
    }

}
