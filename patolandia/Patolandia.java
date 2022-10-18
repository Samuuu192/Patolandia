public class Patolandia {
    public static void main(String[] args) {

        PatoReal pr1 = new PatoReal("Donald",1);
        PatoVermelho pv1 = new PatoVermelho("Patolino",1);
        PatoBorracha pb1 = new PatoBorracha("Aristóteles",0);
        PatoMadeira pm1 = new PatoMadeira("O Gerônimo", 0);

        pr1.display();
        pv1.display();
        pb1.display();
        pm1.display();

        pr1.quack();
        pv1.quack();
        pb1.quack();

        pr1.nadar();
        pv1.nadar();
        pb1.nadar();

        pr1.voar();
        pv1.voar();
    }
}
