object Main3 extends App {
  val listaEstudiantes = List(
    Estudiante2(1,"Nari", 40),
    Estudiante2(2,"Jazmin", 100),
    Estudiante2(3,"Pablo", 40)
  )

  val codigosEstudiantes = List(2,5)

  codigosEstudiantes.map(obtenerNombreEstudiantes).foreach(println(_))

  def isAprobado(estudiante: Estudiante2): Boolean = estudiante.nota > 50

  def obtenerNombreEstudiantes(codigo: Int): String = {
    listaEstudiantes.find(_.codigo.equals(codigo)).map(_.nombre).getOrElse("No encontrado")

//    listaEstudiantes.find(estudiante => codigo.equals(estudiante.codigo)) match {
//        case Some(estudiante2) => estudiante2.nombre
//        case None => "No encontrado"
//    }

//     listaEstudiantes.filter(_.codigo.equals(codigo)).map(_.nombre).headOption.getOrElse("No encontrado")
  }
}

