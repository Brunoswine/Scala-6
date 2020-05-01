package Labkada

object FilterByType {

  def onlyString(xS: Any) = xS match {
    case string: String => true
    case _ => false
  }

  def onlyInt(xS: Any) = xS match {
    case int: Int => true
    case _ => false
  }

}
