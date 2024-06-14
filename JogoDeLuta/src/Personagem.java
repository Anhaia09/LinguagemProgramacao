import java.util.Random;

public class Personagem {

    //Atributos
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    //Construtor
    Random r = new Random();
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = r.nextInt(11)+20;
        this.defesa = r.nextInt(6)+10;
    }

    //Metodos
    public boolean atacar(Personagem personagem){
        if(this.getVida() <= 0) {
            return false;
        }
        int result = personagem.getVida() -(this.getAtaque() - personagem.getDefesa());
        personagem.setVida(result);
        return true;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                '}';
    }
}
