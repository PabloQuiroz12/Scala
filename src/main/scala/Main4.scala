object Main4 extends App {
  val listaEstudiantes = List(
    Estudiante2(1,"Nari", 40),
    Estudiante2(2,"Jazmin", 100),
    Estudiante2(3,"Pablo", 40),
    Estudiante2(4,"Sebastian", 51)
  )

  val promedioNotas = listaEstudiantes.map(_.nota).sum / listaEstudiantes.length

  listaEstudiantes.filter(isAprobado).map(_.nombre)foreach(println)

  def isAprobado(estudiante: Estudiante2): Boolean = estudiante.nota > 50

}
