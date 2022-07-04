package EjerciciosExtra

object ejercicioprofe extends App {

  def filterOdd(insnList: List[Int]): List[Int] = { //filtar impares
    for (n <- insnList if n % 2 != 0) yield n
  }

  def filterEven(insnList: List[Int]): List[Int] = { //filtra pares
    for (n <- insnList if n % 2 == 0) yield n
  }



  /*Funciones literal con nombre:
   val addOne = (x: Int) => x+1  // siempre que encontremos '=>' va a ser una funcion PURA
   println(addOne(1)) //invoco a la funcion y me devuleve 2 en este caso

   Esto sirve para poder usar funciones dentro de procedimientos o funciones

   Hay funciones literales anónimas, por ejemplo:
      (x: Int) => x+1
      cómo se invoca? normalemente se usan para hacerlas pasar como parametros de entrada de métodos
   */

  val isOdd = (x: Int) => {
    x % 2 != 0
  }: Boolean
  //  val isOdd : Int = > Boolean = (x: Int) => {x%2!=0}: Boolean  // no es necesario definirla de esta manera

  val isEven = (x: Int) => {
    x % 2 == 0
  }: Boolean

  def filterOdd2(insnList: List[Int]): List[Int] = { //filtar impares
    for (n <- insnList if isOdd(n)) yield n
  }

  def filterEven2(insnList: List[Int]): List[Int] = { //filtra pares
    for (n <- insnList if isEven(n) /*!isOdd(n)*/ ) yield n
  }

  //En este caso se puede hacer solo con una sola funcion ya que si no es par, va a ser impar


  val list = List(1, 7, 2, 8, 5, 6, 3, 9, 14, 12, 4, 10)
  val oddList = filterOdd2(list)
  val evenList = filterEven2(list)

  println(list)

  println("\nOdd" + oddList)
  println("Even" + evenList)

  //hacer la misma funcion pero que reciba por parametros el método isOdd


  def filter3(insnList: List[Int], f: (Int) => Boolean): List[Int] = { //creamos un nuevo parametros 'funcion' y luego le paso como parámetro la funcion odd o even que TIENEN LA MISMA ESTRUCTURA
    for (n <- insnList if f(n)) yield n
  }


  val list2 = List(1, 7, 2, 8, 5, 6, 3, 9, 14, 12, 4, 10)
  val oddList2 = filter3(list, isOdd)
  val evenList2 = filter3(list, isEven)




  // para rematar el golpe, lo podemos hacer genérico:

  //EjercicioGenéricos


}
