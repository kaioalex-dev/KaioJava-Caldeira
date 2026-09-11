package entities;

public class Bezerro extends VacaMae {
    public Bezerro(int id, String nome, String raca, int idade, String status) {
        super(id, nome, raca, idade, status);
    }

    @Override
    public void emitirSom() {
        System.out.println("BÉ");
    }

    @Override
    public void consultaAnimal() {
        System.out.printf("[ID: %d] %s (Bezerro)%n", Bezerro.super.getId(), Bezerro.super.getNome());
        System.out.printf("- Raça: %s", Bezerro.super.getRaca());
        System.err.printf("\n- Idade: %d ano(s) | Status: %s", Bezerro.super.getIdade(), Bezerro.super.getStatus());
        System.out.printf("\n- Som: ");
        emitirSom();
        System.err.println("\n");
    }
}
