package EjerciciosPDF

object Ejemplo1 extends App { //estamos diciendo que es una aplicacion
  //si extiende a app, no se pone el main

  def max(x: Int, y: Int): Int = { //el igual indica el inicio del código
    if (x > y) x
    else y
  }

  //la función devuelve el tipo de la última variable

  println(max(3, 4))

}
