/**
  * Created by samarapa on 1/6/2017.
  */
class UnitConversion(val conversionfactor : Double) {

  private def convert(value: Double) = value * conversionfactor
  def apply(value :  Double) = convert(value)
}

object InchesToCentimeters extends UnitConversion(2.54){
  def main(args: Array[String]) {
    print(apply(50))
  }

}