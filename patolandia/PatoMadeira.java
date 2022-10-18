public class PatoMadeira extends Pato {

    public PatoMadeira(String nome,int energia){
        super(nome,0);
    }

    @Override
    public void setEnergia(int energia) {
        System.out.printf("%s: Patos de Madeira não tem energia!\n",this.nome); 
    }
    
    @Override
    public void display() {
       System.out.printf("Eu sou %s, um Pato de Madeira!\n",this.nome); 
    }
}
