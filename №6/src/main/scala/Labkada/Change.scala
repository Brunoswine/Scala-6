package Labkada

object Change {

  def Swap(xs: List[Int]): List[Int] = {
    SwapIter(xs,  List.empty)
  }

  @scala.annotation.tailrec
  def SwapIter(remaining: List[Int], acc: List[Int]): List[Int] = {
    remaining.length match {
      case 0 => acc   // Менять местами можно, пока элементов больше 1
      case 1 => acc:+remaining.head
      case _ => {
        val first = remaining.head // first - первое значение оставшегося. Можно заменить на apply(0)
        val second = remaining.apply(1) // second - второе значение. apply выбирает значение по его индексу
        val cut: List[Int] = remaining.drop(2) // создать новый лист, без первых двух элементов
        SwapIter(cut, acc :+ second :+ first)
      }
    }
  }

}