package Lesson_04;



public class MergFruits {
    public static void main(String[] args) {
        doMargFruits();


    }
    private static void doMargFruits() {
        FruitBox<Apple> appleBox = new FruitBox<Apple>(1);
        FruitBox<Orange> orangeBox = new FruitBox<Orange>(1.6);
        FruitBox<Apple> appleBox2 = new FruitBox<Apple>(1);
        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());

        }
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("Вес коробки с яблоками:" + appleBox.getBoxWeight());
        System.out.println("Вес коробки с апельсинами:" + orangeBox.getBoxWeight());
        System.out.println("Равенство-" + appleBox.compare(orangeBox));

        appleBox.addFruits(appleBox2);
    }
}