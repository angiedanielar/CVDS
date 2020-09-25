package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TarifaTest {

    private CalculadorDescuentos calcu= new CalculadorDescuentos();
    @Test
    public void noDeberiaIngresarEdadNegativa() {
        try{
            calcu.calculoTarifa(20,20,-1);
            fail("intento hacer la operacion");
        }catch (Exception e){

        }
    }

    @Test
    public void deberiaIngresarEdad() {

        try{
            calcu.calculoTarifa(20,20,1);
        }catch (Exception e){

        }

    }

    @Test
    public void noDeberiaIngresarDiasNegativos() {

        try{
            calcu.calculoTarifa(20,-1,20);
            fail("intento hacer la operacion");
        }catch (Exception e){

        }

    }

    @Test
    public void deberiaIngresarDias() {

        try{
            long l= (long)calcu.calculoTarifa(20,1,20);
        }catch (Exception e){

        }

    }

    @Test
//-1
    public void noDeberiaIngresarTarifaBaseNegativa() {

        try{
            calcu.calculoTarifa(-1,20,18);
            fail("intento hacer la operacion");
        }catch (Exception e){

        }

    }


    @Test
    public void deberiaIngresarTarifaBase() {

        try{
            long l= (long)calcu.calculoTarifa(1,2,20);
            assertEquals(1,l);
        }catch (Exception e){

        }

    }

    @Test
    public void deberiaGenerarDescuentoAdultoMayor() {

        try{
            long l= (long)calcu.calculoTarifa(20,15,66);
            assertNotEquals(20,l);
        }catch (Exception e){

        }

    }

    @Test
    public void noDeberiaGenerarDescuentoAdultoMayor() {

        try{
            long l= (long)calcu.calculoTarifa(20,15,65);
            assertEquals(20,l);
        }catch (Exception e){

        }
    }

    @Test
    public void noDeberiaGenerarDescuentoMenorDeEdad() {

        try{
            long l= (long)calcu.calculoTarifa(20,15,18);
            assertEquals(20,l);
        }catch (Exception e){

        }

    }

    @Test
    public void deberiaGenerarDescuentoMenorDeEdad() {

        try{
            long l= (long)calcu.calculoTarifa(20,15,17);
            assertNotEquals(20,l);
        }catch (Exception e){

        }

    }

 @Test
    public void deberiaGenerarDescuentoDiasDeAntelacion() {

     try{
         long l= (long)calcu.calculoTarifa(20,21,20);
         assertNotEquals(20,l);
     }catch (Exception e){

     }

    }

 @Test
    public void noDeberiaGenerarDescuentoDiasDeAntelacion() {

     try{
         long l= (long)calcu.calculoTarifa(20,20,20);
         assertEquals(20, l);
     }catch (Exception e){

     }

    }

    

}
