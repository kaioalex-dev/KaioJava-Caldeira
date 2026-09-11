package entities;

public class Pintinho extends GalinhaMae {
    public Pintinho(int id, String nome, String raca, int idade, String status) {
        super(id, nome, raca, idade, status);
    }

    @Override
    public void emitirSom() {
        System.out.print("PIU");
    }

    @Override
    public void consultaAnimal() {
        System.out.printf("[ID: %d] %s (Pintinho)%n", Pintinho.super.getId(), Pintinho.super.getNome());
        System.out.printf("- Raça: %s", Pintinho.super.getRaca());
        System.err.printf("\n- Idade: %d ano(s) | Status: %s", Pintinho.super.getIdade(), Pintinho.super.getStatus());
        System.out.printf("\n- Som: ");
        emitirSom();
        System.err.println("\n");
    }
}
