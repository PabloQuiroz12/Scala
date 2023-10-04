object Main2 extends App {
  val listaEstudiantes = List(
    Estudiante(1,"Nari", 40),
    Estudiante(2,"Jazmin", 100),
    Estudiante(3,"Pablo", 40)
  )
  listaEstudiantes.filter(isAprobado).foreach(println)

  def isAprobado(estudiante: Estudiante): Boolean = estudiante.nota > 50
}

case class Estudiante(codigo: Int, nombre: String, nota: Double)


