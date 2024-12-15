package menu.parcialpoo1;

//Abstract: Corrección Parcial 1 POO
//Author: Jhon Alexander Diaz Serna

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {
    private static final Scanner scanner = new Scanner(System.in);

// Cantidad inicial de cada producto
    private static int papasFrancesasCount = 0;
    private static int papasCascosCount = 0;
    private static int frutaCount = 0;
    private static int arosCebollaCount = 0;

    private static int bandejaPaisaCount = 0;
    private static int hamburguesaCount = 0;
    private static int ensaladaCesarCount = 0;
    private static int arrozTeriyakiCount = 0;

    private static int gaseosasCount = 0;
    private static int jugosNaturalesCount = 0;
    private static int aguaCount = 0;
    private static int sodasCount = 0;

//Precios que se usaran al calcular la factura
    public static final int PAPAS_FRANCESAS_PRECIO = 5000;
    public static final int PAPAS_CASCOS_PRECIO = 5000;
    public static final int FRUTA_PRECIO = 7000;
    public static final int AROS_CEBOLLA_PRECIO = 6000;

    public static final int BANDEJA_PAISA_PRECIO = 33900;
    public static final int HAMBURGUESA_PRECIO = 20500;
    public static final int ENSALADA_CESAR_PRECIO = 25200;
    public static final int ARROZ_TERIYAKI_PRECIO = 24900;

    public static final int GASEOSAS_PRECIO = 5650;
    public static final int JUGOS_NATURALES_PRECIO = 7000;
    public static final int AGUA_PRECIO = 2700;
    public static final int SODAS_PRECIO = 3200;

    public static int total = 0;

//Primer Menu o menu de entradas
    public static void mostrarMenuEntradas() {
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\n=== Menu de Entradas ===");
                System.out.println("1. Papas Francesas - $5000");
                System.out.println("2. Papas en casco - $5000");
                System.out.println("3. Fruta - $7000");
                System.out.println("4. Aros de Cebolla - $6000");
                System.out.println("5. Volver al menu anterior");
                System.out.print("Ingrese el numero de la opcion: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        papasFrancesasCount++;
                        total += PAPAS_FRANCESAS_PRECIO;
                        System.out.println("Usted selecciono Papas Francesas.");
                    }
                    case 2 -> {
                        papasCascosCount++;
                        total += PAPAS_CASCOS_PRECIO;
                        System.out.println("Usted selecciono Papas en casco.");
                    }
                    case 3 -> {
                        frutaCount++;
                        total += FRUTA_PRECIO;
                        System.out.println("Usted selecciono Fruta.");
                    }
                    case 4 -> {
                        arosCebollaCount++;
                        total += AROS_CEBOLLA_PRECIO;
                        System.out.println("Usted selecciono Aros de Cebolla.");
                    }
                    case 5 -> exit = true;
                    default -> System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese solo numeros.");
                scanner.next();
            }
        }
    }

//Segundo Menu o menu de platillos principales
    public static void mostrarMenuPlatosPrincipales() {
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\n=== Menu de Platos Principales ===");
                System.out.println("1. Bandeja Paisa - $33900");
                System.out.println("2. Hamburguesa - $20500");
                System.out.println("3. Ensalada Cesar - $25200");
                System.out.println("4. Arroz Teriyaki - $24900");
                System.out.println("5. Volver al menu anterior");
                System.out.print("Ingrese el numero de la opcion: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        bandejaPaisaCount++;
                        total += BANDEJA_PAISA_PRECIO;
                        System.out.println("Usted selecciono Bandeja Paisa.");
                    }
                    case 2 -> {
                        hamburguesaCount++;
                        total += HAMBURGUESA_PRECIO;
                        System.out.println("Usted selecciono Hamburguesa.");
                    }
                    case 3 -> {
                        ensaladaCesarCount++;
                        total += ENSALADA_CESAR_PRECIO;
                        System.out.println("Usted selecciono Ensalada Cesar.");
                    }
                    case 4 -> {
                        arrozTeriyakiCount++;
                        total += ARROZ_TERIYAKI_PRECIO;
                        System.out.println("Usted selecciono Arroz Teriyaki.");
                    }
                    case 5 -> exit = true;
                    default -> System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese solo numeros.");
                scanner.next();
            }
        }
    }
    
//Tercer Menu o menu de bebidas
    public static void mostrarMenuBebidas() {
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\n=== Menu de Bebidas ===");
                System.out.println("1. Gaseosas - $5650");
                System.out.println("2. Jugos Naturales - $7000");
                System.out.println("3. Agua - $2700");
                System.out.println("4. Sodas - $3200");
                System.out.println("5. Volver al menu anterior");
                System.out.print("Ingrese el numero de la opcion: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        gaseosasCount++;
                        total += GASEOSAS_PRECIO;
                        System.out.println("Usted selecciono Gaseosas.");
                    }
                    case 2 -> {
                        jugosNaturalesCount++;
                        total += JUGOS_NATURALES_PRECIO;
                        System.out.println("Usted selecciono Jugos Naturales.");
                    }
                    case 3 -> {
                        aguaCount++;
                        total += AGUA_PRECIO;
                        System.out.println("Usted selecciono Agua.");
                    }
                    case 4 -> {
                        sodasCount++;
                        total += SODAS_PRECIO;
                        System.out.println("Usted selecciono Sodas.");
                    }
                    case 5 -> exit = true;
                    default -> System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese solo numeros.");
                scanner.next();
            }
        }
    }

//Metodos para sacar el total de cada cosa seleccionada en los menus
    public static int getPapasFrancesasCount() { return papasFrancesasCount; }
    public static int getPapasCascosCount() { return papasCascosCount; }
    public static int getFrutaCount() { return frutaCount; }
    public static int getArosCebollaCount() { return arosCebollaCount; }
    public static int getBandejaPaisaCount() { return bandejaPaisaCount; }
    public static int getHamburguesaCount() { return hamburguesaCount; }
    public static int getEnsaladaCesarCount() { return ensaladaCesarCount; }
    public static int getArrozTeriyakiCount() { return arrozTeriyakiCount; }
    public static int getGaseosasCount() { return gaseosasCount; }
    public static int getJugosNaturalesCount() { return jugosNaturalesCount; }
    public static int getAguaCount() { return aguaCount; }
    public static int getSodasCount() { return sodasCount; }
    public static int getTotal() { return total; }
}
