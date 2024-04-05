// ЗАДАНИЕ
// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
// (например, в миске 10 еды, а кот пытается покушать 15-20).
// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. 
// Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
// то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
// Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik1", 5);
        Cat cat2 = new Cat("Barsik2", 5);
        Cat cat3 = new Cat("Barsik3", 9);
        Cat cat4 = new Cat("Barsik4", 5);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);


        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat : cats){
        if (cat.eat(plate.getFood())) {
            // убираем из миски что сьели
            plate.setFood(plate.getFood() - cat.getAppetite());
            plate.info();
        }
        }
        //добавляем еду
        plate.addeadFood(25);
        plate.info();

        // System.out.println(cat.isFull());
        
    }
}