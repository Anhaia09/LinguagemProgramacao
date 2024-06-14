public class ContaBancaria {
    //Atributos

    private int numero;
    private double saldo;
    private String titular;

    //Construtor
    public ContaBancaria(int numero,String titular){
        this.numero=numero;
        this.saldo=0.0;
        this.titular=titular;
    }

    //Métodos
    public void depositar(double valor){
        if (valor>0)
            this.saldo+=valor;

    }
    public void sacar(double valor){
        if (valor>0 && saldo>=valor)
            this.saldo-=valor;

    }

    //getter and setters
    public double getSaldo() {
        return this.saldo;
    }
}
