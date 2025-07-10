package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CamionTest {

    Camion cut = new Camion(0, 8, "Rojo", false, 0.0);

    @Test
    void testAcelerar() {
        cut.acelerar(50);
        int velocidadFinal = cut.acelerar(100);
        assertEquals((50 + 100), velocidadFinal);
    }

    @Test
    void testRemolque() {

        cut.setRemolque(true);
        assertTrue(cut.getRemolque());
    }

    @Test
    void testCargarMercancia() {

        double cargaTotal = 0.0;

        cargaTotal = cut.anadirCarga(198);
        cargaTotal = cut.anadirCarga(465);

        assertEquals((663), cargaTotal);
    }

}
