package EjerciciosPDF

object Ejemplo4 extends App {

  def eliminaNegativos(a: Array[Int]): Array[Int] = {
    for (num <- a if num > 0) yield num
  }

  val b = Array(2, -1, 3, 4, -5)
  val res = eliminaNegativos(b)
  // imprime el resultado

  /*for(n <- res)
    println(n)

   */
  res.foreach(println)

}
