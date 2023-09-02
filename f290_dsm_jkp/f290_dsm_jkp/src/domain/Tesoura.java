package domain;

public class Tesoura implements Algoritimo {
    
    @Override
    public void executar(TipoAlgoritimo tipo) {
       switch(tipo){
        case PEDRA:
            System.out.println("Perdeu! Pedra quebra Tesoura.");
            break;
        case SPOCK:
            System.out.println("Perdeu! Spock derrete a Tesoura.");
            break;
        case LAGARTO:
            System.out.println("Ganhou! A Tesoura fura o Lagarto");
            break;
        case PAPEL:
            System.out.println("Ganhou! A Tesoura corta o Papel");
            break;
        default:
            System.out.println("Empate! Tesoura empata com Tesoura.");
       }
    }
    
}
