package org.example.llamadas;

/**
 * DTO usado para confiturar la Llamada
 * Contiene la descripcion del cliente y el tiempo de la llamada
 * @author andrea.ortiz
 *
 */
public class Llamada {

   private int tiempoLlamada;
   private String descripcion;
   private String operador;
   
   public String getOperador() {
      return operador;
   }

   public void setOperador(String operador) {
      this.operador = operador;
   }

   public Llamada (String descripcion , int value){
      this.tiempoLlamada = value;
      this.descripcion = descripcion;
   }

   public void setValue(int value) {
      this.tiempoLlamada = value;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public int getValue() {
      return tiempoLlamada;
   }

   public String getDescripcion() {
      return descripcion;
   }
}
