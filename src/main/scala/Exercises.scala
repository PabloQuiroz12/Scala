object Exercises extends App {
  val comparar = (a: Int, b: Int) => println( if (a == b) "Son iguales" else "No son iguales")
  val negPos = (a: Int, b: Int) => println( if (a < 0 && b < 0) "Los dos son negativos"
  else if (a > 0 && b < 0) s"$a es positivo, $b es negativo" else if (a < 0 && b > 0) s"$a es negativo, $b es positivo"
  else "Ambos son postivos")

  comparar(3,4)
  negPos(5,-1)

  val mapa = Map(1 -> "Uno", 2 -> "Dos", 3 -> "Tres", 4 -> "Cuatro", 5 -> "Cinco")
  val res  = mapa.get(5)
  println(res)
  println(res.getOrElse("Numero invalido"))


}
