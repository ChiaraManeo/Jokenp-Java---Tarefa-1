package domain;

public class Pedra implements Algoritimo{
    
    @Override
    public void executar(TipoAlgoritimo tipo) {
        switch(tipo){
            case PAPEL:
                System.out.println("Ganhou! Pedra embrulha Papel.");
                break;
            case TESOURA:
                System.out.println("Perdeu! Tesoura corta Papel.");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Pedra machuca Lagarto.");
                break;
            case SPOCK:
                System.out.println("Perdeu! Spock evapora a Pedra.");
                break;
            default:
                System.out.println("Empate! Pedra empata com Pedra.");
        }
    }
}
