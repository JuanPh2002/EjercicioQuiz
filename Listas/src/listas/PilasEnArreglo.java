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
public class PilasEnArreglo {

    private Object[] data;
    private int max;
    private int top;
    private int aux;

    public PilasEnArreglo(int n) {
        aux = n;
        max = n;
        top = 0;
        data = new Object[n];
    }

    public Object pushStack1(Object item) {
        if (top == max) {
            return null;
        } else {
            data[top++] = item;
            return item;
        }
    }

    public Object popStack1() {
        if (empty()) {
            return null;
        } else {
            Object dataTemp = data[--top];
            data[top] = null;
            return dataTemp;
        }
    }
    
    public Object peekStack1() {
        return data[top - 1];
    }

    public Object pushStack2(Object item) {
        if (top == max) {
            return null;
        } else {
            data[--max] = item;
            return item;
        }
    }

    public Object popStack2() {
        if (empty()) {
            return null;
        } else {
            Object dataTemp = data[max];
            data[max] = null;
            max++;
            return dataTemp;
        }
    }

    public Object peekStack2() {
        return data[max];
    }

    public boolean empty() {
        return top == 0 && max == aux;
    }

}
