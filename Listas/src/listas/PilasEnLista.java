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
public class PilasEnLista {

    private DoubleNode head;
    private DoubleNode tail;

    private DoubleNode startStack1;
    private DoubleNode startStack2;

    public PilasEnLista() {
        head = tail = null;
    }

    public Object pushPila1(Object d) {
        if (tail == null) {
            tail = startStack1 = new DoubleNode<>(d);
            if (startStack2 != null) {
                startStack1.setPreviousNode(startStack2);
                startStack2.setNextNode(startStack1);
            }
        } else {
            tail = new DoubleNode<>(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
        }
        return d;
    }

    public Object popPila1() {
        if (tail == null) {
            return null;
        } else if (tail.getPreviousNode() == null) {
            Object temp = tail.getData();
            tail = startStack1 = null;
            return temp;
        } else if (tail.getPreviousNode() == head) {
            Object temp = tail.getData();
            tail = startStack1 = null;
            head.setNextNode(null);
            return temp;
        } else {
            Object temp = tail.getData();
            tail = tail.getPreviousNode();
            tail.setNextNode(null);
            return temp;
        }
    }

    public Object peekPila1() {
        if (tail == null) {
            return null;
        } else {
            return tail.getData();
        }
    }

    public Object pushPila2(Object d) {
        if (head == null) {
            head = startStack2 = new DoubleNode<>(d);
            if (startStack1 != null) {
                startStack1.setPreviousNode(startStack2);
                startStack2.setNextNode(startStack1);
            }
        } else {
            head = new DoubleNode<>(d, null, head);
            head.getNextNode().setPreviousNode(head);
        }
        return d;
    }

    public Object popPila2() {
        if (head == null) {
            return null;
        } else if (head.getNextNode() == null) {
            Object temp = head.getData();
            head = startStack2 = null;
            return temp;
        } else if (head.getNextNode() == tail) {
            Object temp = head.getData();
            head = startStack2 = null;
            tail.setNextNode(null);
            return temp;
        } else {
            Object temp = head.getData();
            head = head.getNextNode();
            head.setPreviousNode(null);
            return temp;
        }
    }

    public Object peekPila2() {
        if (head == null) {
            return null;
        } else {
            return head.getData();
        }
    }
}
