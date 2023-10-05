object Main2 extends App {
  val listaEstudiantes = List(
    Estudiante2(1,"Nari", 40),
    Estudiante2(2,"Jazmin", 100),
    Estudiante2(3,"Pablo", 40)
  )
  listaEstudiantes.filter(isAprobado).foreach(println)

  def isAprobado(estudiante: Estudiante2): Boolean = estudiante.nota > 50
}

case class Estudiante2(codigo: Int, nombre: String, nota: Double)


