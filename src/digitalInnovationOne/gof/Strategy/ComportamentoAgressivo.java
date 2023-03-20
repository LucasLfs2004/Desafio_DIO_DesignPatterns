package digitalInnovationOne.gof.Strategy;

public class ComportamentoAgressivo implements Comportamento {
  public void mover() {
    System.out.println("Movendo-se agressivamente...");
  }

  public void acao() {
    System.out.println("Realizando um ataque...");
  }
}
