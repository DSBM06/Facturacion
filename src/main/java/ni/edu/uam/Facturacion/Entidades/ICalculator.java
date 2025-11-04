package ni.edu.uam.Facturacion.Entidades;

import ni.edu.uam.Facturacion.Calculadores.CalculadorSiguienteNumeroParaAnyo;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.PropertyValue;

import javax.persistence.Column;

public class ICalculator {
    @Column(length=6)
    @DefaultValueCalculator(value= CalculadorSiguienteNumeroParaAnyo.class,
            properties=@PropertyValue(name="anyo") // Para inyectar el valor de anyo de Factura
            // en el calculador antes de llamar a calculate()
    )
    int numero;
}
