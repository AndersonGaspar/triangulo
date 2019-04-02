import org.junit.Test;
import poo.Triangulo;

import static org.junit.Assert.assertEquals;

public class TestaTriangulo {

    @Test
    public void testarTipoTriangulo(){
       assertEquals("deu erro ao testar equilatero", "equilatero", Triangulo.tipoTriangulo(3,3,3));
       assertEquals("deu erro ao testar equilatero", "equilatero", Triangulo.tipoTriangulo(-3,-3,-3));

        assertEquals("deu erro ao testar isosceles", "isosceles", Triangulo.tipoTriangulo(4,4,3));
        assertEquals("deu erro ao testar isosceles", "isosceles", Triangulo.tipoTriangulo(3,4,3));
        assertEquals("deu erro ao testar isosceles", "isosceles", Triangulo.tipoTriangulo(4,3,3));

        assertEquals("deu erro ao testar escaleno", "escaleno", Triangulo.tipoTriangulo(3,4,5));
        assertEquals("deu erro ao testar escaleno", "escaleno", Triangulo.tipoTriangulo(10,20,30));
    }

}
