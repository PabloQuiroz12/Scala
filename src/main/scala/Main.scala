object Main extends App{
  val productos = List(
    Producto("Coca Cola", BigDecimal(6)),
    Producto("Galletas", BigDecimal(5.5)),
    Producto("Pringles", BigDecimal(12))
  )

  val descuentos = List(5,10,8)

  val total = productos.reduce((producto,acc) => Producto("TOTAL", producto.precio + acc.precio))
  println(total)

  val productosCondDescuento = productos.map(producto => producto.copy(precio = producto.precio * 0.9))
  println(productosCondDescuento)

  val productosConIVA = productosCondDescuento.map(producto => producto.copy(precio = producto.precio * 1.13))
  println(productosConIVA)

  val productosCondDescuentoInd = Range(0,productos.length).map(index => {
    val producto = productos(index)
    producto.copy(precio = producto.precio * (1 - descuentos(index) / 100.0))
  })
  println(productosCondDescuentoInd)

}

case class Producto(nombre: String, precio: BigDecimal){
}
