import java.util.Random;
public class Utente {

    String nome;
    int budget;

    public  Utente(String nome){
        this.nome = nome;
        this.budget = (int)(Math.random() * 100);
    }
}
