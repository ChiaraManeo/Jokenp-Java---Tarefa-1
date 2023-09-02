package domain;
public class Spock implements Algoritimo {

    @Override
    public void executar(TipoAlgoritimo tipo){
        switch(tipo){
            case PEDRA:
                System.out.println("Ganhou! Spock evapora a Pedra.");
                break;
            case TESOURA:
                System.out.println("Ganhou! Spock derrete a Tesoura.");
                break;
            case LAGARTO:
                System.out.println("Perdeu! Lagarto morde o Spock.");
                break;
            case PAPEL:
                System.out.println("Perdeu! Papel refuta o Spock.");
                break;
            default:
                System.out.println("Empate! Spock empata com Spock.");
        }

    }    
}
