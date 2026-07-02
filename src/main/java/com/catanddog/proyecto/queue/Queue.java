package com.catanddog.proyecto.queue;

import java.util.NoSuchElementException;
import java.util.LinkedList;

public class Queue<T> {
    private final LinkedList<T> elements =  new LinkedList<>();

    public void enqueue( T element){
        elements.addLast(element);
        System.out.println("Elemento agregado " + element);
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchFieldException("La cola esta vacia");
        }
        return elements.getFirst();
    }

    public void dequeue() {
        if(isEmpty()){
            throw new NoSuchFieldException("La cola esta vacia");
        }
        return elements.removeFirst();
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }
}
