package Aula2_Polimorfismo.entities;

import Aula2_Polimorfismo.utilitys.Animal;

public class VacaMae implements Animal{
    private int id;
    private String cor;
    private int patas;
    private int orelha;
    private int olhos;

    VacaMae(int id, String cor, int olhos, int patas, int orelha){
        setId(id);
        setCor(cor);
        setOrelha(orelha);
        setPatas(patas);
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        if(patas < 0 || patas > 4){
            throw new IllegalArgumentException("Numero invalido de patas");
        }
        this.patas = patas;
    }
    public int getOrelha() {
        return orelha;
    }
    public void setOrelha(int orelha) {
        if(orelha < 0 || orelha > 2){
            throw new IllegalArgumentException("Numero invalido de orelhas");
        }

        this.orelha = orelha;
    }   

    public int getOlhos(){
        return olhos;
    }

    public void setOlhos(int olhos){
        if(olhos < 0 || olhos > 2){
            throw new IllegalArgumentException("Numero invalido de olhos");
        }
        this.olhos = olhos;
    }

    @Override
    public void emitirSom(){
        System.out.println("MUUUUUUUUUUU");
    }

    @Override
    public void coletarProduto(){
        System.out.println("Retirando leite...");
    }

    public String toString(){
        return "Cor: " + cor + ", Olhos:" + olhos + ", Orelha: "+ orelha + ", Pata: " + patas;
    }

}
