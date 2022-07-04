package EjerciciosExtra

object EjercicioGenéricos extends App {


  def filter[T](list: List[T], f: (T) => Boolean): List[T] = {
    for (n <- list if f(n)) yield n
  }

  val esPar = (x: Int) => {
    x % 2 == 0
  }: Boolean

  val lst = List(1, 7, 2, 8, 5, 6, 3, 9, 14, 12, 4, 10)
  println(lst)
  //println(filter[Int](lst[Int], esPar))
  println("Pares " + filter(lst, (v: Int) => v % 2 == 0))


  val lstd = List(1.5, 7.4, 2.3, 8.1, 5.6, 6.2, 3.5, 9.2, 14.6)
  println(lstd)
  println("Double >2.0  " + filter(lstd, (v: Double) => v > 2.0))


  val lsts = List("it´s", "a", "far", "f", "better", "thing")
  println(lsts)
  println("String longitud > 2 " + filter(lsts, (v: String) => {
    println("hola"); v.length > 2
  }))


}
