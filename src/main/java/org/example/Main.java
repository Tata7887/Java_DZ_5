//Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения.
//        Добавить ко всем значениям символ "!".
//        Создать второе множество с таким же обобщением.
//        Ключи второго множества частично совпадают с ключеми первого. Объеденить значания во втором множестве и первом если ключи совподают.
//        Вывести результат в консоль.



package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Первый", "один");
        hm.put("Второй", "два");
        hm.put("Третий", "три");
        hm.put("Четвертый", "четыре");
        hm.put("Пятый", "пять");
        hm.put("Шестой", "шесть");

        hm.forEach((k, v) -> System.out.println(v));
        System.out.println();

        for (String key: hm.keySet()) {
            hm.compute(key, (k, v) -> v + "!");
        }
        hm.forEach((k, v) -> System.out.println(v));
        System.out.println();

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Первый", "one");
        hm2.put("Второй%", "two");
        hm2.put("Третий", "three");
        hm2.put("Четвертый", "fore");
        hm2.put("Пятый%%", "five");
        hm2.put("Шестой", "six");

        for(String k: hm2.keySet()) {
            hm2.merge(k, hm.getOrDefault(k, ""), String::concat);
        }
        for (String k: hm2.keySet()) {
            System.out.println(k + " " + hm.get(k));

            }
    }
}