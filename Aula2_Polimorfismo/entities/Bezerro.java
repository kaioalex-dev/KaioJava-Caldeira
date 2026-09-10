package Aula2_Polimorfismo.entities;

public class Bezerro extends VacaMae{
    public Bezerro(int id, String cor, int patas, int orelha, int olhos){
        super(id, cor, olhos, patas, orelha);
    }

    @Override
    public void emitirSom(){
        System.out.println("MEEEE");
    }
}
