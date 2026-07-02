package com.catanddog.proyecto.queue;

public class Main {
    public static void main() {
        Queue<Integer> numbers = new Queue<>();

        numbers.enqueue(10);
        numbers.enqueue(20);
        numbers.enqueue(30);

        numbers.print();

        System.out.println("Ver el primero de la lista " + numbers.peek() );
        System.out.println("Eliminar el primero de la lista " + numbers.dequeue() );

        numbers.print();
    }
}
