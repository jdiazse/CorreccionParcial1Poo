package menu.parcialpoo1;

//Abstract: Corrección Parcial 1 POO
//Author: Jhon Alexander Diaz Serna

public class Factura {
    public static void generarFactura() {
        System.out.println("\n=== Factura ===");

        if (Menus.getPapasFrancesasCount() > 0)
            System.out.println("Papas Francesas: " + Menus.getPapasFrancesasCount() + " x $5000 =" +Menus.getPapasFrancesasCount()*Menus.PAPAS_FRANCESAS_PRECIO);
        if (Menus.getPapasCascosCount() > 0)
            System.out.println("Papas en casco: " + Menus.getPapasCascosCount() + " x $5000 ="+ Menus.getPapasCascosCount()*Menus.PAPAS_CASCOS_PRECIO);
        if (Menus.getFrutaCount() > 0)
            System.out.println("Fruta: " + Menus.getFrutaCount() + " x $7000 ="+ Menus.getFrutaCount()*Menus.FRUTA_PRECIO);
        if (Menus.getArosCebollaCount() > 0)
            System.out.println("Aros de Cebolla: " + Menus.getArosCebollaCount() + " x $6000 ="+ Menus.getArosCebollaCount()*Menus.AROS_CEBOLLA_PRECIO);

        if (Menus.getBandejaPaisaCount() > 0)
            System.out.println("Bandeja Paisa: " + Menus.getBandejaPaisaCount() + " x $33900 ="+ Menus.getBandejaPaisaCount()*Menus.BANDEJA_PAISA_PRECIO);
        if (Menus.getHamburguesaCount() > 0)
            System.out.println("Hamburguesa: " + Menus.getHamburguesaCount() + " x $20500 ="+ Menus.getHamburguesaCount()*Menus.HAMBURGUESA_PRECIO);
        if (Menus.getEnsaladaCesarCount() > 0)
            System.out.println("Ensalada Cesar: " + Menus.getEnsaladaCesarCount() + " x $25200 ="+ Menus.getEnsaladaCesarCount()*Menus.ENSALADA_CESAR_PRECIO);
        if (Menus.getArrozTeriyakiCount() > 0)
            System.out.println("Arroz Teriyaki: " + Menus.getArrozTeriyakiCount() + " x $24900 ="+ Menus.getArrozTeriyakiCount()*Menus.ARROZ_TERIYAKI_PRECIO);

        if (Menus.getGaseosasCount() > 0)
            System.out.println("Gaseosas: " + Menus.getGaseosasCount() + " x $5650 ="+ Menus.getGaseosasCount()*Menus.GASEOSAS_PRECIO);
        if (Menus.getJugosNaturalesCount() > 0)
            System.out.println("Jugos Naturales: " + Menus.getJugosNaturalesCount() + " x $7000 ="+ Menus.getJugosNaturalesCount()*Menus.JUGOS_NATURALES_PRECIO);
        if (Menus.getAguaCount() > 0)
            System.out.println("Agua: " + Menus.getAguaCount() + " x $2700 ="+ Menus.getAguaCount()*Menus.AGUA_PRECIO);
        if (Menus.getSodasCount() > 0)
            System.out.println("Sodas: " + Menus.getSodasCount() + " x $3200 ="+ Menus.getSodasCount()*Menus.SODAS_PRECIO);

        System.out.println("Total a pagar: $" + Menus.getTotal());
    }
}
