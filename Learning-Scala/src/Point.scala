/**
  * Created by samarapa on 1/6/2017.
  */
class Point(val x :Int, val y:Int) {
override def toString = (x +":" + y)
}

object Point{
  def apply(x:Int,y :Int) = new Point(x,y)
}