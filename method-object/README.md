# Method Object

La clase calculadora de precios se usa para calcular precio total a partir de un precio base de $100. 

Ha habido algunos cambios en el proyecto y el cliente nos está solicitando esto:

1. El módulo de calcular precios debe de poder usar otros precios base.
2. En la frontera el IVA tiene un valor de 10%, nos interesa poder usar este módulo en nuestra nueva sucursal de Tijuana.
3. De acuerdo al dictamen de reforma a la Ley del Impuesto al Valor agregado, en el 2010, el IVAs ahora será de 16% y 11% en la frontera. 
4. Actualmente, el módulo solo regresa el precio total, nos interesa saber tener el precio desglosado, cual es el monto del IVA.

Puedes hacer el 0.15 una variable:

```
public double calculaPrecios() {
    double precioBase = 100;
    double iva = 0.15;
    
    double montoIva = precioBase * iva;
    double precioTotal = precioBase + montoIva;

    LOGGER.info("Precio total: ${}, monto IVA: ${}", precioTotal, montoIva);

    return precioTotal;

}
```

El código principal, que puede ser reutilizado, se encuentra en estas dos lineas

```
double montoIva = precioBase * iva;
double precioTotal = precioBase + montoIva;
```