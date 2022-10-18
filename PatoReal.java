public class PatoReal extends Pato implements Voa,Nada,Grasna{

    public PatoReal(String nome,int energia){
        super(nome,energia);
    }

    @Override
    public void quack(){
        System.out.printf("%s: QUACK!\n",this.nome);
    }

    @Override
    public void nadar(){
        for(int i=0; i < this.energia; i++){
            System.out.printf("%s: Nadando...\n",this.nome);
        }
    }
    
    @Override
    public void voar(){
        for(int i=0; i < this.energia; i++){
            System.out.printf("%s: Voando...\n",this.nome);
        }
    }

    @Override
    public void display() {
        System.out.printf("Eu sou %s, um Pato Real!\n",this.nome); 
    }
}
