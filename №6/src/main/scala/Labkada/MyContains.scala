package Labkada

object MyContains {

  @scala.annotation.tailrec
  def containsWithTailRec(remaining: List[Int], InputElem: Int /*acc: List[Int]*/): Boolean = {
    remaining match {
      case Nil => false
      case head :: tail => {
           head match {
             case InputElem => true
             case _ => containsWithTailRec(tail, InputElem)
           }

      }
    }
  }

  def containsWithFold (xs:List[Int], InputElem: Int): Boolean ={
    val dada = xs.fold(0){ (z,curr)=>
      val i = curr
      if (i == InputElem) z+1
      else z + 0
    }
    dada match{
      case 0 => false
      case _ => true
    }
  }

}
