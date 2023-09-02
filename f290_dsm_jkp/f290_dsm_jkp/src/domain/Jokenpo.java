package domain;

public class Jokenpo {
   private Algoritimo algoritimo;
   
   public void setAlgoritimo(Algoritimo algoritimo){
    this.algoritimo = algoritimo;
   }

   public void jogar(TipoAlgoritimo tipo){
    algoritimo.executar(tipo);
   }
}
