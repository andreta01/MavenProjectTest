package org.apache.maven.Manager;

import org.example.llamadas.Llamada;
import org.junit.Test;

public class AdministratorTest {

   @Test
   public void shuldManageCalls() {
      // Se configura la descripcion del cliente y el tiempo en segundos de la llamada
      Llamada cliente1 = new Llamada("Cliente 1", 5);
      Llamada cliente2 = new Llamada("Cliente 2", 6);
      Llamada cliente3 = new Llamada("Cliente 3", 5);
      Llamada cliente4 = new Llamada("Cliente 4", 8);
      Llamada cliente5 = new Llamada("Cliente 5", 8);
      Llamada cliente6 = new Llamada("Cliente 6", 9);
      Llamada cliente7 = new Llamada("Cliente 7", 5);
      Llamada cliente8 = new Llamada("Cliente 8", 5);
      Llamada cliente9 = new Llamada("Cliente 9", 5);
      Llamada cliente10 = new Llamada("Cliente 10", 5);

      Administrador operario1 = new Administrador(cliente1);
      operario1.start();
      Administrador operario2 = new Administrador(cliente2);
      operario2.start();
      Administrador operario3 = new Administrador(cliente3);
      operario3.start();
      Administrador operario4 = new Administrador(cliente4);
      operario4.start();
      Administrador operario5 = new Administrador(cliente5);
      operario5.start();
      Administrador operario6 = new Administrador(cliente6);
      operario6.start();
      Administrador operario7 = new Administrador(cliente7);
      operario7.start();
      Administrador operario8 = new Administrador(cliente8);
      operario8.start();
      Administrador operario9 = new Administrador(cliente9);
      operario9.start();
      Administrador operario10 = new Administrador(cliente10);
      operario10.start();

      try {
         Thread.sleep(20 * 1000);
      } catch (InterruptedException ex) {
         Thread.currentThread().interrupt();
      }
   }

}
