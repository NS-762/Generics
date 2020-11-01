import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        String[] arr2 = new String[] {"1HHH", "2PPP", "3LLL"};

        arr1 = swapElementsInArray(arr1, 1, 3);
        System.out.println(Arrays.toString(arr1));

        arr2 = swapElementsInArray(arr2, 0, 1);
        System.out.println(Arrays.toString(arr2));

        ////////////////////////////////////////////////////////

        ArrayList <Integer> arrList = new ArrayList<>();
        arrList = convertArrayToArrayList(arr1);
        System.out.println(arrList);

        //////////////////////////////////////////////////////////

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        for (int i = 0; i < 9; i++) { //заполнить яблоками коробку
            appleBox1.addFruitInBox(new Apple());
            appleBox2.addFruitInBox(new Apple());
        }
        System.out.println("Вес коробки: " + appleBox1.getWeight());


        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 10; i++) { //заполнить яблоками коробку
            orangeBox1.addFruitInBox(new Orange());
        }
        System.out.println("Вес коробки: " + orangeBox1.getWeight());

        System.out.println("Сравнение веса: " + appleBox1.compare(orangeBox1));

        appleBox1.pourFruit(appleBox2); //из коробки appleBox1 пересыпать в appleBox2
        System.out.println("Вес коробки: " + appleBox2.getWeight());

        appleBox2.pourFruit(appleBox2); //из коробки appleBox2 пересыпать в саму себя
        System.out.println("Вес коробки: " + appleBox2.getWeight());

    }

    public static <T> T[] swapElementsInArray(T array[], int index1, int index2) { //задание 1
        T value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
        return array;
    }

    public static <T> ArrayList<T> convertArrayToArrayList (T arrayToConvert[]) { //задание 2
        ArrayList <T> arrList = new ArrayList<>();
        for (int i = 0; i < arrayToConvert.length; i++) {
            arrList.add(arrayToConvert[i]);
        }
        return arrList;
    }




}
