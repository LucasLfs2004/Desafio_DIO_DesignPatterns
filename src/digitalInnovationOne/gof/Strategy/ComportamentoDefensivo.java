package digitalInnovationOne.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento {
  public void mover () {
    System.out.println("Movendo se defensivamente...");
  }

  public void acao() {
    System.out.println("Em posição de defesa esperando um ataque...");
  }
}
