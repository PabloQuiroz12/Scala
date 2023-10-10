package practica4

object Practica4 extends App {

  private val texto = "Hola que haces"

  private val cantidadVocales = contarVocales(texto)
  println(s"Cantidad de vocales: $cantidadVocales")
  private val cantidadConsonantes = contarConsonantes(texto)
  println(s"Cantidad de consonantes: $cantidadConsonantes")

  private val numeros = List(1, 2, 3, 4, 5, 6, 83, 997)

  private val pares = obtenerPares(numeros)
  println(s"Números pares: $pares")
  private val impares = obtenerImpares(numeros)
  println(s"Números impares: $impares")
  private val cantidadPares = contarPares(numeros)
  println(s"Cantidad de números pares: $cantidadPares")
  private val cantidadImpares = contarImpares(numeros)
  println(s"Cantidad de números impares: $cantidadImpares")
  private val primos = obtenerPrimos(numeros)
  println(s"Números primos: $primos")
  private val cantidadPrimos = contarPrimos(numeros)
  println(s"Cantidad de números primos: $cantidadPrimos")

  private def contarVocales(cadena: String): Int = {
    cadena.count("aeiouAEIOU".contains(_))
  }

  private def contarConsonantes(cadena: String): Int = {
    cadena.count(c => c.isLetter && !"aeiouAEIOU".contains(c))
  }

  private def obtenerPares(lista: List[Int]): List[Int] = {
    lista.filter(_ % 2 == 0)
  }

  private def obtenerImpares(lista: List[Int]): List[Int] = {
    lista.filter(_ % 2 != 0)
  }

  private def contarPares(lista: List[Int]): Int = {
    lista.count(_ % 2 == 0)
  }

  private def contarImpares(lista: List[Int]): Int = {
    lista.count(_ % 2 != 0)
  }

  private def esPrimo(numero: Int): Boolean = {
    if (numero <= 1) false
    else if (numero <= 3) true
    else if (numero % 2 == 0 || numero % 3 == 0) false
    else {
      var i = 5
      while (i * i <= numero) {
        if (numero % i == 0 || numero % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  private def obtenerPrimos(lista: List[Int]): List[Int] = {
    lista.filter(esPrimo)
  }

  private def contarPrimos(lista: List[Int]): Int = {
    lista.count(esPrimo)
  }
}
