package ToyShop.view;

import java.util.*;

import ToyShop.classes.Toy;

public class ToysView {
    List<Toy> toys;
    
    public ToysView(List<Toy> toys) {
        this.toys = toys;
    }

    public void ShowTable() {
        //Вывести в консоль таблицу игрушек
        System.out.println("\nТаблица Игрушки\n---------------");
        for (Toy item : toys) {
            System.out.println(item.toString());
        }
    }

}
