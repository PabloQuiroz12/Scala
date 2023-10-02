object Main extends App{
  val saludar = (nombre: String) => "Hola, "+nombre

  val sumar = (num1: Int, num2 :Int) => num1.+(num2)

  println(saludar("Nari"))

  println("Suma: "+sumar(5,7))

  val estudiante = new Estudiante("Rodrigo")
  estudiante inscribir "Programacion Funcional"         // Notacion Infija
}

class Estudiante(nombre: String){
  def inscribir(materia: String): Unit = {
    println(s"Estudiante $nombre inscrito en materia $materia")
  }
}