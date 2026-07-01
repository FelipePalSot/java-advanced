package com.catanddog.proyecto;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Felipe");

        System.out.println(stringBox.getValue());

        Box<Integer> intBox = new Box<>(10);
        System.out.println(intBox.getValue());
    }
}
