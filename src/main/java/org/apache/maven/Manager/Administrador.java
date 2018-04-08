package org.apache.maven.Manager;

import org.example.empleados.Director;
import org.example.empleados.Operador;
import org.example.empleados.Supervisor;
import org.example.llamadas.Llamada;
import org.example.llamadas.LlamadaEspera;

/**
 * Clase que maneja los hilos
 * 
 * @author andrea.ortiz
 *
 */
public class Administrador extends Thread {

   private Llamada llamada;
   private static Orquestador orquestador;

   public Administrador(Llamada llamada) {
      super();
      this.llamada = llamada;
      orquestador = Orquestador.getInstance();
   }

   @Override
   public synchronized void run() {
      System.out.println("Llamada entrante" + llamada.getDescripcion() + " ... ");
      startCall();
      this.tiempoLlamada(llamada.getValue());
      System.out.println("Llamada terminada " + llamada.getDescripcion());
      endCall();
   }

   /**
    * Metodo encargado de despachar las llamadas
    */
   private void startCall(){
      Dispatcher contestador1 = new Operador();
      Dispatcher contestador2 = new Supervisor();
      Dispatcher contestador3 = new Director();
      Dispatcher contestador4 = new LlamadaEspera();
      contestador1.establecerProximo(contestador2);
      contestador2.establecerProximo(contestador3);
      contestador3.establecerProximo(contestador4);
      contestador4.establecerProximo(contestador1);
      contestador1.dispatchCall(orquestador, llamada);
      
   }
   
   /**
    * Metodo que libera empleados cuando filaliza la llamada
    */
   private void endCall() {
      if (llamada.getOperador().equals("operador")) {
         orquestador.setNumeroOperadorOcupado(orquestador.getNumeroOperadorOcupado() - 1);
      } else if (llamada.getOperador().equals("supervisor")) {
         orquestador.setNumeroSupervisorOcupado(orquestador.getNumeroSupervisorOcupado() - 1);
      } else {
         orquestador.setNumeroDirectorOcupado(orquestador.getNumeroDirectorOcupado() - 1);
      }

   }

   /**
    * Tiempo de espera entre llamadas
    * 
    * @param segundos
    */
   private void tiempoLlamada(int segundos) {
      try {
         Thread.sleep(segundos * 1000);
      } catch (InterruptedException ex) {
         Thread.currentThread().interrupt();
      }
   }

}
