import entities.Picareta;

public class oldSteve {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS MANUAL              ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        Picareta picareta_1 = new Picareta("madeira", 50, 5);
        Picareta picareta_2 = new Picareta("pedra", 70, 8);
        Picareta picareta_3 = new Picareta("ferro", 100, 12);
        Picareta picareta_4 = new Picareta("ouro", 30, 15);

        System.out.println("\nPicaretas fabricadas:");
        System.out.println("• " + picareta_1);
        System.out.println("• " + picareta_2);
        System.out.println("• " + picareta_3);

        picareta_3.minerar(30);
        picareta_3.minerar(20);

        picareta_3.repararPicareta(265);
        picareta_4.repararPicareta(100);

         System.out.println("\nEstado final das picaretas:");
        System.out.println("• " + picareta_1);
        System.out.println("• " + picareta_2);
        System.out.println("• " + picareta_3);
        System.out.println("• " + picareta_4);

        System.out.println();
    }
}
