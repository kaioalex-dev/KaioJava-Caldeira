import java.util.Scanner;
import entities.*;;

public class StardewManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        VacaMae mimosa = new VacaMae(101, "Mimosa", "Holandesa", 7, "Sem filhotes");
        GalinhaMae giselda = new GalinhaMae(102, "Giselda", "Caipira", 1, "Botando ovos");
        Ovelha chiquinha = new Ovelha(103, "Chiquinha", "Merino", 3, "Pronta para tosquia");
        Pintinho chickenLittle = new Pintinho(104, "Chicken little", "Caipira", 5, "Tramando algo...");
        Bezerro mini_cristiano = new Bezerro(105, "Cristiano Ronaldo jr", "Mini robozão", 15, "Não é o melhor ainda");

        do {
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comércio/Retirar produtos");
            System.out.println("3. sair");
            System.out.print("\nEscolha uma opção: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("---------------------------------------------");
                System.out.println("             ANIMAIS NO CURRAL:");
                System.out.println("---------------------------------------------");
                mimosa.consultaAnimal();
                giselda.consultaAnimal();
                chiquinha.consultaAnimal();
                chickenLittle.consultaAnimal();
                mini_cristiano.consultaAnimal();
                System.out.println("---------------------------------------------\n");
            } else if (op == 2) {
                System.out.println("---------------------------------------------");
                System.out.println("             Coletando produtos:");
                System.out.println("---------------------------------------------");
                mimosa.coletarProduto();
                giselda.coletarProduto();
                chiquinha.coletarProduto();
                System.out.println("---------------------------------------------\n");
            }
        } while (op != 3);
        sc.close();
    }
}
