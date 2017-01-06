

/**
  * Created by samarapa on 1/5/2017.
  */
class Car(val manufacturer: String, val model:String, val year: Int, val lp:String) {

  def this( manufacturer: String,  model:String,  year: Int) ={
    this(manufacturer,model,year,"")
  }
  def this( manufacturer: String,  model:String, lp:String) ={
    this(manufacturer,model,-1,lp)
  }
  def this( manufacturer: String,  model:String) ={
    this(manufacturer,model,-1,"")
  }
  override def toString = {
    "[" + manufacturer + "," + model + "," +year +","+lp+"]"
  }
}
