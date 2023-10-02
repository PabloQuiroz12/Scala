import scala.io.StdIn

object FindMinMaxNumbers extends App {
  val n = StdIn.readInt()
  val numbers = (1 to n).map(_ => StdIn.readInt())

  val (max, min) = numbers.foldLeft((Int.MinValue, Int.MaxValue)) {
    case ((currentMax, currentMin), number) =>
      (Math.max(currentMax, number), Math.min(currentMin, number))
  }

  println(s"Mayor: $max")
  println(s"Menor: $min")
}


