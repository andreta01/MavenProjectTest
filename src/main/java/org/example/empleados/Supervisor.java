package org.example.empleados;

import org.apache.maven.Manager.Dispatcher;
import org.apache.maven.Manager.Orquestador;
import org.example.llamadas.Llamada;

/**
 * Clase que administra a los Supervisores
 * @author andrea.ortiz
 *
 */
public class Supervisor extends Dispatcher {

   public void dispatchCall(Orquestador orquestador, Llamada llamada) {
      System.out.println("Buscando Supervisor disponible ..."+(orquestador.getNumeroSupervisorTotal()-orquestador.getNumeroSupervisorOcupado()));
      if (orquestador.getNumeroSupervisorTotal() - orquestador.getNumeroSupervisorOcupado() > 0) {
         orquestador.setNumeroSupervisorOcupado(orquestador.getNumeroSupervisorOcupado()+1);
         llamada.setOperador("supervisor");
         System.out.println("Llamada: "+llamada.getDescripcion()+" tomada por Supervisor:" +orquestador.getNumeroSupervisorOcupado());
      } else {
         proximo.dispatchCall(orquestador, llamada);
      }
   }

}
