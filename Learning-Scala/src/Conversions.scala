/**
  * Created by samarapa on 1/6/2017.
  */
object Conversions {
  private var result :Double = 0.0

  def inchesToCentimeters(inch : Double) = {
    result = inch * 2.54
  }
  def gallonsToLiters(glns : Double) = {
    result = glns * 3.78
  }
  def milesToKilometers(mils : Double) = {
    result = mils * 1.6
  }
  result
}
