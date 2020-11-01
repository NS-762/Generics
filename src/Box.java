import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitsArrayList;

    public Box() {
        fruitsArrayList = new ArrayList<>();
    }

    public void addFruitInBox(T fruit) {
        fruitsArrayList.add(fruit);
    }

    public float getWeight() {
        float weightBox = 0;
        for (T fruit : fruitsArrayList) {
            weightBox += fruit.getWeight();
        }
        return weightBox;
    }

    public boolean compare(Box<?> anotherBox) { //сравнение веса
        return this.getWeight() == anotherBox.getWeight();
    }

    public void pourFruit(Box<T> anotherBox) { //пересыпка фруктов

        int size = fruitsArrayList.size();

        for (int i = 0; i < size; i++) {
            anotherBox.addFruitInBox(fruitsArrayList.get(0));
            fruitsArrayList.remove(0);
        }
    }

}
