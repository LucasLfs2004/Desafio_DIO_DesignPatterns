package digitalInnovationOne.gof.Strategy;

public class ComportamentoNormal implements Comportamento {
  public void mover() {
    System.out.println("Movendo-se normalmente...");
  }

  public void acao() {
    System.out.println("O robô não está realizando nenhuma ação no momento");
  }
}
