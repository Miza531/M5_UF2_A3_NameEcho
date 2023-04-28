package m5_uf2_a3_nameecho;

import org.junit.Test;
import static org.junit.Assert.*;

public class M5_UF2_A3_NameEchoTest {
    
    M5_UF2_A3_NameEcho checker = new M5_UF2_A3_NameEcho();

    //Le pasamos como parámetro un solo nombre, debería retornar ese nombre en minúsculas
    @Test
    public void testNombreUnico() {
        String nombreCompleto = checker.CheckNameEcho("Miguel");
        assertEquals("Miguel", nombreCompleto);
    }

    //Le pasamos como parámetro un nombre y un apellido, debería retornar el apellido
    //en mayúsculas
    @Test
    public void testNombreDoble() {
        String nombreCompleto = checker.CheckNameEcho("Miguel Zambrano");
        assertEquals("Miguel ZAMBRANO", nombreCompleto);
    }

    //Le pasamos como parámetro un nombre, un segundo nombre y un apellido, debería 
    //retornar únicamente el apellido en mayúsculas
    @Test
    public void testNombreTriple() {
        String nombreCompleto = checker.CheckNameEcho("Miguel Enrique Zambrano");
        assertEquals("Miguel Enrique ZAMBRANO", nombreCompleto);
    }

    //Le pasamos como parámetro un nombre, un segundo nombre, un primer apellido y un SEGUNDO
    //apellido, debería retornar los dos apellidos en mayúsculas
    @Test
    public void testNombreCuadruple() {
        String nombreCompleto = checker.CheckNameEcho("Miguel Enrique Zambrano Contreras");
        assertEquals("Miguel Enrique ZAMBRANO CONTRERAS", nombreCompleto);
    }
}
