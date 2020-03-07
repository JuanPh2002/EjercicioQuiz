/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author niwdeyen
 */
public class ConvertBase {
    
    public String aBinario(int n) {
        int orig = n;
        LinkedStack LSBinario = new LinkedStack();
        String binario = "";
        while (n > 0) {
            LSBinario.push(n % 2);
            n /= 2;
        }
        while (!LSBinario.empty()) {
            try {
                binario += LSBinario.pop();
            } catch (Exception e) {
                binario = "Error en el proceso ";
            }
        }
        return "El numero " + orig + " en binario es: " + binario;
    }

    public String aOctal(int n) {
        int orig = n;
        LinkedStack LSOctal = new LinkedStack();
        String octal = "";
        while (n > 0) {
            LSOctal.push(n % 8);
            n /= 8;
        }
        while (!LSOctal.empty()) {
            try {
                octal += LSOctal.pop();
            } catch (Exception e) {
                octal = "Error en el proceso ";
            }
        }
        return  "El numero " + orig + " en octal es: " + octal;
    }

    public String aHexadecimal(int n) {
        int orig = n;
        LinkedStack LSHexadecimal = new LinkedStack();
        String hexadecimal = "";
        while (n > 0) {
            int num = n % 16;
            switch (num) {
                case 10:
                    LSHexadecimal.push("A");
                    break;
                case 11:
                    LSHexadecimal.push("B");
                    break;
                case 12:
                    LSHexadecimal.push("C");
                    break;
                case 13:
                    LSHexadecimal.push("D");
                    break;
                case 14:
                    LSHexadecimal.push("E");
                    break;
                case 15:
                    LSHexadecimal.push("F");
                    break;
                default:
                    LSHexadecimal.push(n % 16);
                    break;
            }
            n /= 16;
        }
        while (!LSHexadecimal.empty()) {
            try {
                hexadecimal += LSHexadecimal.pop();
            } catch (Exception e) {
                hexadecimal = "Error en el proceso ";
            }
        }
        return  "El numero " + orig + " en hexadecimal es: " + hexadecimal;
    }
}
