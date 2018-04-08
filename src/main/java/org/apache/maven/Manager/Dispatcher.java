package org.apache.maven.Manager;

import org.example.llamadas.Llamada;

/**
 * Clase que maneja la cadena de responsabilidad de los empleados
 * @author andrea.ortiz
 *
 */
public abstract class Dispatcher {

   protected Dispatcher proximo;

   /**
    * Metodo que llama al la proxima instancia
    * @param proximo
    */
   public void establecerProximo(Dispatcher proximo) {

      this.proximo = proximo;

   }

   /**
    * Metodo para implementar por las instancias
    * @param orquestador
    */
   public abstract void dispatchCall(Orquestador orquestador, Llamada llamada);

}
