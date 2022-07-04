package EjerciciosExtra



case class Point(x: Int, y:Int){ //case class es una clase que define ojetos que generan objetos final (imutables)
  //los parámetros de la case class son los atributos final que va a tener la clase
  def +(newpt: Point) = Point(x+newpt.x, y+newpt.y) //el '+' significa la suma de dos objetos del mismo tipo
  def -(newpt: Point) = Point(x-newpt.x, y-newpt.y)
  override def toString="EjerciciosExtra.Point("+x+","+y+")" //en una clase case class NO es necesario poner el toString
}


object PPoint {
  def main(args: Array[String]){
    val p1= Point(3,4) //cuando es case class NO se pone 'new' y como es 'val' también es imutable
    val p2= Point(7,2)
    val p3= Point(-2,2)
    val p4= p1+p2-p3

    println(p4)
  }

}
