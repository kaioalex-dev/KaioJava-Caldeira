package Aula2_Polimorfismo.entities;

import Aula2_Polimorfismo.utilitys.Animal;

public class GalinhaMae implements Animal{
    private int id;
    private String cor;
    private int olhos;
    private int asa;
    private int patas;
    private int orelha;

    public GalinhaMae(int id, String cor, int olhos, int asa, int patas, int orelha) {
        setId(id);
       setCor(cor);
       setOlhos(olhos);
       setAsa(asa);
       setPatas(patas);
       setOrelha(orelha);
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
    public int getOlhos() {
        return olhos;
    }
    public void setOlhos(int olhos) {
        if(olhos < 0 || olhos > 2){
            throw new IllegalArgumentException("Numero invalido de olhos");
        }
        this.olhos = olhos;
    }
    public int getAsa() {
        return asa;
    }
    public void setAsa(int asa) {
        this.asa = asa;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
         if(patas < 0 || patas > 2){
            throw new IllegalArgumentException("Numero invalido de patas");
        }
        this.patas = patas;
    }

     public int getOrelha() {
        return orelha;
    }

     public void setOrelha(int orelha) {
         if(orelha < 0 || orelha > 2){
            throw new IllegalArgumentException("Numero invalido de orelha");
        }
        this.orelha = orelha;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("PÓ PÓ PÓ");
    }

    @Override
    public void coletarProduto(){
        System.out.println("Colocando ovo....");
    }

    public String toString(){
        return "Cor: " + cor + ", Olhos:" + olhos + ", Orelha: "+ orelha + ", Asas: " + asa + ", Pata: " + patas ;
    }
}
