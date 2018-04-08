package org.apache.maven.Manager;

/**
 * DTO que contiene las llamadas e instancias de empleados
 * 
 * @author andrea.ortiz
 *
 */
public class Orquestador {

   private int numeroOperadorOcupado;
   private int numeroSupervisorOcupado;
   private int numeroDirectorOcupado;

   private static Orquestador instance = null;
   protected Orquestador() {
      // Exists only to defeat instantiation.
   }
   public static Orquestador getInstance() {
      if(instance == null) {
         instance = new Orquestador();
      }
      return instance;
   }

   public int getNumeroOperadorOcupado() {
      return numeroOperadorOcupado;
   }

   public void setNumeroOperadorOcupado(int numeroOperadorOcupado) {
      this.numeroOperadorOcupado = numeroOperadorOcupado;
   }

   public int getNumeroSupervisorOcupado() {
      return numeroSupervisorOcupado;
   }

   public void setNumeroSupervisorOcupado(int numeroSupervisorOcupado) {
      this.numeroSupervisorOcupado = numeroSupervisorOcupado;
   }

   public int getNumeroDirectorOcupado() {
      return numeroDirectorOcupado;
   }

   public void setNumeroDirectorOcupado(int numeroDirectorOcupado) {
      this.numeroDirectorOcupado = numeroDirectorOcupado;
   }

   public int getNumeroOperadorTotal() {
      return 5;
   }

   public void setNumeroOperadorTotal(int numeroOperadorTotal) {
   }

   public int getNumeroSupervisorTotal() {
      return 2;
   }

   public void setNumeroSupervisorTotal(int numeroSupervisorTotal) {
   }

   public int getNumeroDirectorTotal() {
      return 2;
   }

   public void setNumeroDirectorTotal(int numeroDirectorTotal) {
   }

}
