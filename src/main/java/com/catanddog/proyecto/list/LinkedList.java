package com.catanddog.proyecto.list;

public class LinkedList<T> {
    private Node<T> head; // nodo principal de la lista

    public LinkedList() {
        this.head = null;
    }

    // Método para agregar un elemento al final
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para imprimir la lista
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void update(T oldData, T newData) {
        if (head == null) return ; // Si la lista está vacía

        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(oldData)) { // Si encontramos el nodo a actualizar
                current.data = newData; // Actualizamos el valor
                return ;
            }
            current = current.next; // Seguir buscando en la lista
        }
        return ; // Si no se encontró el nodo para actualizar
    }

    public void remove(T data) {
        if (head == null) return ; // Si la lista está vacía

        // Si el nodo a eliminar es la cabeza
        if (head.data.equals(data)) {
            head = head.next; // Desplazar la cabeza al siguiente nodo
            return ;
        }

        Node<T> current = head.next;
        Node<T> previous = head;

        while (current != null && !current.data.equals(data)) {
            previous =  current;
            current = current.next; // Navegar a través de la lista
        }

        if (current == null) return ; // Si no se encontró el nodo

        previous.next = current.next; // Eliminar el nodo deseado

    }
}
