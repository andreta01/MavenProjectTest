package org.example.empleados;

import org.apache.maven.Manager.Dispatcher;
import org.apache.maven.Manager.Orquestador;
import org.example.llamadas.Llamada;

/**
 * Clase que administra el numero de Directores
 * @author andrea.ortiz
 *
 */
public class Director extends Dispatcher {

   public void dispatchCall(Orquestador orquestador, Llamada llamada) {
      System.out.println("Buscando director ..."+(orquestador.getNumeroDirectorTotal()-orquestador.getNumeroDirectorOcupado()));
      if (orquestador.getNumeroDirectorTotal() - orquestador.getNumeroDirectorOcupado() > 0) {
         orquestador.setNumeroDirectorOcupado(orquestador.getNumeroDirectorOcupado()+1);
         llamada.setOperador("director");
         System.out.println("Llamada: "+llamada.getDescripcion()+" tomada por Director:" +orquestador.getNumeroDirectorOcupado());
      } else {
         proximo.dispatchCall(orquestador, llamada);
      }
   }

}
