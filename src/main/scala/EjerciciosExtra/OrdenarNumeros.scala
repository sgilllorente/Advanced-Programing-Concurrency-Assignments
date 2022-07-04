package EjerciciosExtra

object OrdenarNumeros extends App {


  def ordenarNumeros(c: Array[Int]): Array[Int] = {

    //val (mayores, menores) = c.partition(_%2==0)
    val (mayores, menores) = c.partition(_ >= 0)

    menores ++ mayores
  }

  val c = Array(2, -1, 3, 4, -5)
  val res = ordenarNumeros(c)

  res.foreach(print(_))

}
