package menu.parcialpoo1;

//Abstract: Corrección Parcial 1 POO
//Author: Jhon Alexander Diaz Serna

import java.util.Scanner;

public class MenuPrincipal {
    private static final Scanner scanner = new Scanner(System.in);

//Menu Principal o inicial
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\n=== Menu Principal ===");
                System.out.println("1. Menu de Entradas");
                System.out.println("2. Menu de Platos Principales");
                System.out.println("3. Menu de Bebidas");
                System.out.println("4. Generar Factura");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opcion: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> Menus.mostrarMenuEntradas();
                    case 2 -> Menus.mostrarMenuPlatosPrincipales();
                    case 3 -> Menus.mostrarMenuBebidas();
                    case 4 -> Factura.generarFactura();
                    case 5 -> {
                        System.out.println("Gracias por escogernos! Buen resto de dia.");
                        exit = true;
                    }
                    default -> System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese solo numeros.");
                scanner.next();
            }
        }
    }
}
