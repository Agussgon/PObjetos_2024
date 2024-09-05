package entidades;

/*Necesitamos diseñar un sistema que permita a un vendedor consultar  por un producto.
 Los productos tienen nombre, precio de compra, precio de venta y stock disponibles.

 Se espera que los productos puedan informar si hay stock disponible
 y cuál es la ganancia obtenida por cada venta, según los precios disponibles.
 */
public class Producto {

    //atributos
private String nombre;
private Double precioCompra ;
private Double precioVenta;
private Integer stock;

private static final double COMISION=0.15;

// constructor explicito
public Producto(String nombreRecibido, Double precioCompraRecibido,
                Double precioVentaR, Integer stockR  ){
    this.nombre=nombreRecibido  ;
    this.precioCompra=precioCompraRecibido;
    this.precioVenta=  precioVentaR;
    this.stock=stockR;

}
// el que no se ve es implicito
public Producto(){}

//public Producto
    public Producto(String nombreR, Integer stock){
    this.nombre= nombreR;
    this.stock= stock;
    }

// métodos
  public  Boolean stockDisponible(){
      return stock > 0;
  }

  public String informarStock(){
    return  "el stock disponible es "+ this.stock  ;
    }

  public Double calcularGananciaObtenida(){
      return this.precioVenta - this.precioCompra ;
  }


// Métodos para mantener el encapsulamiento
// armamos un método para el único vendedor que esta habilitado para modificar el stock"
  public void setStock(Integer nuevoStock){
    this.stock= nuevoStock;
  }

  public Integer getStock(){
    return this.stock;
  }

  //consutando por la variable estática
    public double getCOMISION() {
        return COMISION;
    }

    //usando la v.e
    public Double calcularComision(){

    return calcularGananciaObtenida()* COMISION;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                '}';
    }
}
