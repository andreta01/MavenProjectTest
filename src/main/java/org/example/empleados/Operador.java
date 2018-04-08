package org.example.empleados;

import org.apache.maven.Manager.Dispatcher;
import org.apache.maven.Manager.Orquestador;
import org.example.llamadas.Llamada;

/**
 * Clase que adminsitra los Operadores
 * @author andrea.ortiz
 *
 */
public class Operador extends Dispatcher {

   public void dispatchCall(Orquestador orquestador, Llamada llamada) {
      System.out.println("Buscando operador disponible ..."+(orquestador.getNumeroOperadorTotal()-orquestador.getNumeroOperadorOcupado()));
      if (orquestador.getNumeroOperadorTotal() - orquestador.getNumeroOperadorOcupado() > 0) {
         orquestador.setNumeroOperadorOcupado(orquestador.getNumeroOperadorOcupado()+1);
         llamada.setOperador("operador");
         System.out.println("Llamada: "+llamada.getDescripcion()+" tomada por Operador:" + orquestador.getNumeroOperadorOcupado());
         
      } else {
         proximo.dispatchCall(orquestador, llamada);
      }
   }
}
