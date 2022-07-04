package EjerciciosPDF

object Ejemplo6 extends App {
  def eliminaNegativos(a: Array[Int]): Array[Int] = {
    for (n <- a if n > 0) yield n
  }

  val b = Array(2, -1, 3, 4, -5)
  val res = eliminaNegativos(b)

  res.foreach(print)


}
