package digitalInnovationOne.gof;

import digitalInnovationOne.gof.Facade.Facade;
import digitalInnovationOne.gof.Singleton.SingletonEager;
import digitalInnovationOne.gof.Singleton.SingletonLazy;
import digitalInnovationOne.gof.Singleton.SingletonLazyHolder;
import digitalInnovationOne.gof.Strategy.*;

public class Test {
  public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);


    //Strategy

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);

    robo.mover();

    robo.setComportamento(defensivo);
    robo.mover();
    robo.acao();

    robo.setComportamento(agressivo);
    robo.acao();
    robo.mover();
    robo.acao();

    // Facade

    Facade facade = new Facade();
    facade.migrarCliente("Lucas", "04843060");
  }
}