package EjerciciosPDF

object Ejemplo2 extends App {

  def obtenerSuma(args: Int*): Int = {
    var suma: Int = 0
    for (num <- args) { //num es una variable local, irá desde num hasta args
      suma += num
    }
    /*
    args.foreach(args => sum+=args) //podemos usar dentro del método obtenersuma la función foreach
    sum
     */

    suma //como es de tipo entero en valor de retorno será 'suma'
  }

  //usando el operador fold(/:)

  def obtenerSumafold(args: Int*): Int = { //el asterisco significa el número de parámetros
    //(0/:args)(_+_)
    args.foldLeft(5)(_ + _) //al primer elemento le suma el 0, podemos cambiar el 0 por cualquier numero

  }


  println("Suma obtenida " + obtenerSumafold(1, 2, 3, 4, 5, 6))

  println(("La salida de la locura es " + "loco " * 3))

  //4.
  for (i <- 10 to 0 by (-1)) {
    println(i)
  }


}
