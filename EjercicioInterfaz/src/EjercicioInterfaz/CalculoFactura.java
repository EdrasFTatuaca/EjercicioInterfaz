package EjercicioInterfaz;

public interface CalculoFactura {
public static final float descuentos = 0;
public static final float impuestos = 0;
public static final float excepcionesIVA = 0;

float monto=0, iva=0, descuento=0;

iva = (monto/1.12)*0.12;

descuento=monto*0.05;

total=monto-descuento;
}
}