/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author THEMAKINE
 */
public class QueueWithNodes<E extends Comparable> {

    private Node<E> head;
    private final Node<E> tail;

    public QueueWithNodes() {
        head = tail = null;
    }

    public boolean empty() {
        return head == null && tail == null;
    }

    public String showData() {
         String data = "";
        Node<E> current = this.head;
        while (current != null) {
            data += " " + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }

    public void add(E e) {
        if (empty()) {
            Node<E> newNode = new Node<>(e);
            newNode.setNextNode(head);
            head = newNode;
        } else {
            Node<E> newNode = new Node<>(e);
            Node<E> current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public boolean offer(E e) {
        if (empty()) {
            Node<E> newNode = new Node<>(e);
            newNode.setNextNode(head);
            head = newNode;
        } else {
            Node<E> newNode = new Node<>(e);
            Node<E> current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
            return true;
        }
        return false;
    }

    public void remove() throws Exception {
        if (empty()) {
            throw new Exception("La cola está vacia");
        } else {
            head = head.getNextNode();
        }
    }

    public E poll() {
        E a;
        if (empty()) {
            return null;
        } else {
            a = head.getData();
            head = head.getNextNode();
        }
        return a;
    }

    public Object element() throws Exception {
        if (empty()) {
            throw new Exception("La lista esta vacia");
        } else {
            return head.getData();
        }
    }

    public Object peek() {
        if (empty()) {
            return null;
        } else {
            return head.getData();
        }
    }
}
