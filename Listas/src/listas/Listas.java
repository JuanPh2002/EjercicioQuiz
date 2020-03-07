/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Stack;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

//        //Convertir a binario, octal y hexadecimal
//        ConvertBase convert = new ConvertBase();
//        System.out.println("------Convertir a Binario, Octal, Hexadecimal------");
//        System.out.println("Ingrese un numero para convertir ");
//        int n = teclado.nextInt();
//        System.out.println("Ingrese 2 para convertir a Binario");
//        System.out.println("Ingrese 8 para convertir a Octal");
//        System.out.println("Ingrese 16 para convertir a Hexadecimal");
//        int b = teclado.nextInt();
//        switch (b) {
//            case 2:
//                System.out.println(convert.aBinario(n));
//                break;
//            case 8:
//                System.out.println(convert.aOctal(n));
//                break;
//            case 16:
//                System.out.println(convert.aHexadecimal(n));
//                break;
//            default:
//                throw new Exception("La base ingresada no es la correcta");
//        }
//        System.out.println("");
//
//        //Verificar si una expresión matemática que utilice llaves, corchetes y paréntesis se encuentra balanceada.
//        System.out.println("------Validar balance de expresion matematica------");
//        Validate validate = new Validate();
//        System.out.println("Ingrese una expresion matematica para validar");
//        String exp = String.valueOf(teclado.next());
//        System.out.println("Validacion : " + validate.validateExpression(exp));
//        System.out.println("");
//
//        //Para una cola con nodos, implementar los métodos: add, offer, remove, poll, element y peek.
//        System.out.println("------Operaciones Cola con Nodos------");
//        QueueWithNodes queue = new QueueWithNodes();
//        queue.add(11);
//        queue.add(22);
//        queue.add(33);
//        queue.add(44);
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        queue.remove();
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        queue.add(55);
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        queue.remove();
////        queue.remove();
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        System.out.println("Offer -> " + queue.offer(55));
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        System.out.println("Pool -> " + queue.poll());
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        System.out.println("Element -> " + queue.element());
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
////        System.out.println("Peek -> " + queue.peek());
////        System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
//
//        int repeat = 0;
//        do {
//            System.out.println("- Ingrese la opcion -");
//            System.out.println(" add -> Ingrese 1");
//            System.out.println(" offer -> Ingrese 2");
//            System.out.println(" remove -> Ingrese 3");
//            System.out.println(" pool -> Ingrese 4");
//            System.out.println(" element -> Ingrese 5");
//            System.out.println(" peek -> Ingrese 6");
//            int opc = teclado.nextInt();
//            switch (opc) {
//                case 1:
//                    System.out.println("Ingrese dato para añadir con (ADD) a la cola");
//                    int d = teclado.nextInt();
//                    queue.add(d);
//                    break;
//                case 2:
//                    System.out.println("Ingrese dato para añadir con (OFFER) a la cola");
//                    int d1 = teclado.nextInt();
//                    System.out.println("Offer -> " + queue.offer(d1));
//                    queue.offer(opc);
//                    break;
//                case 3:
//                    queue.remove();
//                    System.out.println("Dato Eliminado con (REMOVE)");
//                    break;
//                case 4:
//                    queue.poll();
//                    System.out.println("Dato Eliminado con (POLL)");
//                    break;
//                case 5:
//                    System.out.println("Dato obtenido con (ELEMENT): " + queue.element());
//                    break;
//                case 6:
//                    System.out.println("Dato obtenido con (PEEK): " + queue.peek());
//                    break;
//                default:
//                    throw new Exception("La opcion ingresada no es correcta");
//            }
//            System.out.println("Los datos actuales de la cola son : [" + queue.showData() + "]");
//            System.out.println("");
//            System.out.println("Ingrese 1 si desea realizar otra operacion");
//            System.out.println("Ingrese 2 para terminar");
//            repeat = teclado.nextInt();
//        } while (repeat == 1);
//        System.out.println("");
//
//        //Comportamiento dos pilas en array
//        System.out.println("------Comportamiento dos pilas en array------");
//        PilasEnArreglo stacksArray = new PilasEnArreglo(6);
//
//        System.out.println("Dato 1 en pila 2: " + stacksArray.pushStack2(11));
//        System.out.println("Dato 2 en pila 2: " + stacksArray.pushStack2(22));
//        System.out.println("Dato 3 en pila 2: " + stacksArray.pushStack1(33));
//        System.out.println("Dato 4 en pila 1: " + stacksArray.pushStack2(44));
//        System.out.println("Dato 5 en pila 2: " + stacksArray.pushStack2(55));
//        System.out.println("Dato 6 en pila 2: " + stacksArray.pushStack1(66));
//        System.out.println("Pop en pila 2: " + stacksArray.popStack2());
//        System.out.println("Pop en pila 1: " + stacksArray.popStack1());
//        System.out.println("Peek en pila 1: " + stacksArray.peekStack1());
//        System.out.println("Peek en pila 2: " + stacksArray.peekStack2());
//        System.out.println("");
//
//        //Comportamiento dos pilas en lista enlazada
//        System.out.println("------Comportamiento dos pilas en lista enlazada------");
//
//        PilasEnLista stacksList = new PilasEnLista();
//
//        System.out.println("Dato a ingresar en pila 1: " + stacksList.pushPila1(11));
//        System.out.println("Dato a ingresar en pila 1: " + stacksList.pushPila1(22));
//        System.out.println("Dato a ingresar en pila 1: " + stacksList.pushPila1(33));
//        System.out.println("Dato a ingresar en pila 1: " + stacksList.pushPila1(44));
//        System.out.println("Dato a ingresar en pila 2: " + stacksList.pushPila2(55));
//        System.out.println("Peek en pila 1: " + stacksList.peekPila1());
//        System.out.println("Peek en pila 2: " + stacksList.peekPila2());
//        System.out.println("Dato a ingresar en pila 1: " + stacksList.pushPila1(66));
//        System.out.println("Dato a ingresar en pila 2: " + stacksList.pushPila2(77));
//        System.out.println("Dato a ingresar en pila 2: " + stacksList.pushPila2(88));
//        System.out.println("Pop en pila 1: " + stacksList.popPila1());
//        System.out.println("Pop en pila 1: " + stacksList.popPila2());
//        System.out.println("Pop en pila 1: " + stacksList.popPila1());
//        System.out.println("Pop en pila 1: " + stacksList.popPila2());
//        System.out.println("Pop en pila 1: " + stacksList.popPila1());
//        System.out.println("Pop en pila 1: " + stacksList.popPila2());
        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
        myCSLL.add(99);
        myCSLL.add(88);
        myCSLL.add(77);
        myCSLL.add(66);
        myCSLL.add(55);
        myCSLL.add(44);
        System.out.println("mycsll:" + myCSLL.showData());//44 55 66 77 88 99
        myCSLL.deleteAbove(77);
        System.out.println(myCSLL.showData());//44 55 66 77

    }
}
