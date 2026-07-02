package com.catanddog.proyecto.list;

public class Node<T> {
    T data; // dato almacenado
    Node<T> next; // referencia al siguiente nodo

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
