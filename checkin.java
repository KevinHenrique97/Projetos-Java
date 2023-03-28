package checkin;

import java.util.Scanner;

public class checkin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao programa de Check-in");
        System.out.println("Por favor, informe seu nome:");
        String nome = input.nextLine();
        
        System.out.println("Por favor, informe seu número de reserva:");
        String reserva = input.nextLine();
        
        System.out.println("Por favor, informe o número do seu voo:");
        String voo = input.nextLine();
        
        System.out.println("Por favor, confirme seus dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Reserva: " + reserva);
        System.out.println("Voo: " + voo);
        
        System.out.println("Obrigado pelo check-in, tenha um ótimo voo!");
    }
}

