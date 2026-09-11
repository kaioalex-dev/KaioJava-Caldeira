package entities;

import utilitys.Animal;

public class Ovelha implements Animal {
    private int id;
    private String nome;
    private String raca;
    private int idade;
    private String status;

    public Ovelha(int id, String nome, String raca, int idade, String status) {
        setId(id);
        setNome(nome);
        setRaca(raca);
        setIdade(idade);
        setStatus(status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade tem que ser maior ou igual a 0");
        }
        this.idade = idade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void emitirSom() {
        System.out.print("MÉÉÉÉ");
    }

    @Override
    public void coletarProduto() {
        System.out.printf("%s Tirando lã\n", nome);
    }

    @Override
    public void consultaAnimal() {
        System.out.printf("[ID: %d] %s (Ovelha)%n", id, nome);
        System.out.printf("- Raça: %s", raca);
        System.err.printf("\n- Idade: %d ano(s) | Status: %s", idade, status);
        System.out.printf("\n- Som: ");
        emitirSom();
        System.err.println("\n");
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + ", Status: " + status;
    }
}
