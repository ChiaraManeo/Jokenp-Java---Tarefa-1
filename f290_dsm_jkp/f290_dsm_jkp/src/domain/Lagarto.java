package domain;

public class Lagarto implements Algoritimo {

    @Override
    public void executar(TipoAlgoritimo tipo){
        switch(tipo) {
            case PEDRA:
                System.out.println("Perdeu! Pedra machuca Lagarto.");
                break;
            case TESOURA:
                System.out.println("Perdeu! Tesoura corta Lagarto.");
                break;
            case SPOCK:
                System.out.println("Ganhou! Lagarto morde o Spock.");
                break;
            case PAPEL:
                System.out.println("Ganhou! Lagarto come Papel!");
                break;
            default:
                System.out.println("Empate! Lagarto empata com Lagarto.");

        }
    }
    
}
