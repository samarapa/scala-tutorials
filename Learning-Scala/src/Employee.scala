/**
  * Created by samarapa on 1/5/2017.
  */
class Employee {
  private var _name: String = "John Q. Public"
  var salary: Double = 0.0
  def this (n: String, s : Double)={
    this()
    _name = n
    salary = s
  }
  def name = _name
}
