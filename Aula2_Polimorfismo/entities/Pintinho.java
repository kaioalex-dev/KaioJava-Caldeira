package Aula2_Polimorfismo.entities;

public class Pintinho extends GalinhaMae{
    public Pintinho(int id, String cor, int olhos, int asa, int patas, int orelha){
        super(id, cor, olhos, asa, patas, orelha);
    }

    @Override
    public void emitirSom(){
        System.out.println("PIU");
    }
}
