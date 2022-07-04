package EjerciciosPDF

object Ejemplo8 extends App {
  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {


    val (menores, igualesmayores) = values.partition(_ < v)
    val (iguales, mayores) = igualesmayores.partition(_ == v)

    (menores.length, iguales.length, mayores.length)


  }

  def lteqgtCount(values: Array[Int], v: Int): (Int, Int, Int) = {


    val menores = values.count(_ < v)
    val iguales = values.count(_ == v)
    val mayores = values.count(_ > v)

    (menores, iguales, mayores)


  }

  def lteqgtyield(values: Array[Int], v: Int): Array[Int] = {


    for (num <- values if num > v) yield num

  }

  val valores = Array(2, -1, 3, 4, -5)
  val valor = 3
  val res = lteqgtCount(valores, valor)
  println(res.toString)
}
