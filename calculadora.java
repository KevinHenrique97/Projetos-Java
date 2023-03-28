package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;
        
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();
        
        System.out.println("Digite o operador (+, -, *, /): ");
        operador = input.next().charAt(0);
        
        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();
        
        switch(operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;
                
            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
                break;
                
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
                break;
                
            case '/':
                if(num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
                
            default:
                System.out.println("Operador inválido.");
                break;
        }
        
        input.close();
    }
}