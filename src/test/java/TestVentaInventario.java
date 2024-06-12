import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.seed.entidades.Inventario;


public class TestVentaInventario {
    @Test
    public void testVentaInventario(){
        Inventario i = new Inventario();
        assertEquals(20, i.Venta(20, 40));
    }

}
