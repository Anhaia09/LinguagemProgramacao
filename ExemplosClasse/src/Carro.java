public class Carro {
    //Atributos
    private String cor;
    private int posX;
    private int posY;
    private int largura;
    private int altura;

    //Construtor(parametro) (this se refere ao atributo)
    public Carro(String cor, int posX, int posY, int largura, int altura){
        this.cor=cor;
        this.posX=posX;
        this.posY=posY;
        this.largura=largura;
        this.altura=altura;
    }

    //Métodos
    public void andarFrente(){
        if(posY>0)// zero é o limite da tela, ele só pode ir até o limite. If faz isso
            posY--;
    }
    public void andarRe(){
        if (posY<1080-altura)
        posY++;
    }
    public void andarDireita(){
        if (posX<1920-largura)
            posX++;
    }
    public void andarEsquerda(){
        if (posX>0)
            posX--;
    }

    @Override
    public String toString() {//mostra o estado/valor dos seus atributos
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                ", largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}
