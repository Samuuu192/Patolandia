public class PatoBorracha extends Pato implements Nada,Grasna{

    public PatoBorracha(String nome,int energia){
        super(nome,0);
    }

    @Override
    public void setEnergia(int energia) {
        System.out.printf("%s: Patos de borracha não tem energia!\n",this.nome); 
    }

    @Override
    public void quack() {
        System.out.printf("%s: SQUEAK!\n",this.nome);

    }

    @Override
    public void nadar() {
        System.out.printf("%s: Boiando...\n",this.nome);
    }
    
    @Override
    public void display() {
       System.out.printf("Eu sou %s, um Pato de Borracha!\n",this.nome); 
    }
}
