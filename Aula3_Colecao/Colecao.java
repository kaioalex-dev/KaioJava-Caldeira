package Aula3_Colecao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Colecao{
    public static void main(String[] args) {
        List<String> personagens = new ArrayList<>();
        personagens.add("Mario");
        personagens.add("Luigi");
        personagens.add("Peach");
        personagens.add("Yoshi");

        System.out.println(personagens.get(0));
        personagens.remove(3);
        personagens.clear();

        List<String> inimigos = new LinkedList<>();
        inimigos.add("Goomba");
        inimigos.add("Koompa");
        inimigos.remove(0);

        Map<String, String> habilidades = new HashMap<>();

        habilidades.put("Mario", "Fireball");
        habilidades.put("Luigi", "Poltergust");
        habilidades.put("Yoshi", "Flutter Jump");
        habilidades.put("Peach", "Float");
        habilidades.put("Toad", "Speed Boost");

        String h = habilidades.get("Luigi");
        System.out.println(h);

        for(Map.Entry<String, String> e : habilidades.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        Map<String, Double> colegas = new HashMap<>();

        colegas.put("Jean", 0.1);
        colegas.put("Vini", 5.0);
        colegas.put("Lucas Vilante", 4.5);
        colegas.put("Humberto", 4.3);
        colegas.put("Gabriel", 4.5);

        double c = colegas.get("Jean");
        System.out.println(c);

        for(Map.Entry<String, String> e : habilidades.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}