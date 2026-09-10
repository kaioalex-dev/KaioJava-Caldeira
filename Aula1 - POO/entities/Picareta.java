package entities;

public class Picareta {
    private String material;
    private int durabilidade;
    private int forca;

    public Picareta(String material, int durabilidade, int forca) {
        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + material);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Força: " + forca);
        
        setMaterial(material);
        setDurabilidade(durabilidade);
        setForca(forca);

        System.out.println("Picareta de " + material + " fabricada com sucesso!");

        toString();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        if (durabilidade < 0 || durabilidade > 100) {
            throw new IllegalArgumentException("Durabilidade inválida");
        }
        this.durabilidade = durabilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca <= 0) {
            throw new IllegalArgumentException("Força inválida");
        }
        this.forca = forca;
    }

    @Override
    public String toString() {
        return "Picareta: " + " Material: " + material + ", Durabilidade: " + durabilidade + ", Força: " + forca;
    }

    public void minerar(int blocos) {
        System.out.println("\n=== MINERANDO COM PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Força: " + forca);
        System.out.println("Blocos a minerar: " + blocos);

        if (durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return;
        }

        int blocosMinerados = 0;
        int durabilidadeRestante = durabilidade;

        for (int i = 0; i < blocos; i++) {
            if (durabilidadeRestante <= 0) {
                System.out.println("Picareta quebrou no bloco " + i);
                break;
            }
            durabilidadeRestante--;
            blocosMinerados++;
        }
        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + durabilidadeRestante);
        setDurabilidade(durabilidadeRestante);
    }

    public static int limiteMaximoDurabilidade(String material) {
        switch (material.toLowerCase()) {
            case "madeira":
                return 50;
            case "pedra":
                return 70;
            case "ferro":
                return 100;
            case "ouro":
                return 30;
            default:
                return 60;
        }
    }

    public void repararPicareta(int quantidade) {

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade negativa ou 0 é inválida!");
        }

        System.out.println("\n=== REPARANDO PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int durabilidadeNova = durabilidade + quantidade;
        int limiteMaximo = limiteMaximoDurabilidade(material);

        if (durabilidadeNova > limiteMaximo) {
            durabilidadeNova = durabilidadeNova - (durabilidadeNova - limiteMaximo);
        }

        System.out.println("Durabilidade nova: " + durabilidadeNova);
        setDurabilidade(durabilidadeNova);
    }
}
