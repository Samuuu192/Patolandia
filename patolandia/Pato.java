public abstract class Pato {

    protected int energia;
    protected String nome;

    public Pato(String nome, int energia){
        this.energia = energia;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void display();
}
