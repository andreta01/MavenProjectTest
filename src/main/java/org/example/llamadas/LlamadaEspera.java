package org.example.llamadas;

import org.apache.maven.Manager.Dispatcher;
import org.apache.maven.Manager.Orquestador;

public class LlamadaEspera extends Dispatcher  {

   @Override
   public void dispatchCall(Orquestador orquestador, Llamada llamada) {
      try {
         Thread.sleep(10 * 1000);
      } catch (InterruptedException ex) {
         Thread.currentThread().interrupt();
      }
      proximo.dispatchCall(orquestador, llamada);
   }
      
   

}
