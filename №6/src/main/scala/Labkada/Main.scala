package Labkada

object Main extends App {

  //Часть 1
  println("Поменять местами соседние элементы в списке")
  val xs = List(3, 5, 7, 9)
  println(xs)
  println(Change.Swap(xs))
  /**
   *
   */
  //Часть 2
  println("Реализовать функцию ‘contains’, принимающую List[Int] и элемент Int, проверяющую, входит ли переданный элемент в список.")
  MyContains.containsWithTailRec(List(1, 3, 5, 7), 5) match { // Реализация через хвотовую рекурсию
    case true => println("True")
    case false => println("False")
  }
  MyContains.containsWithFold(List(1, 3, 5, 7), 5) match { // реализация через fold
    case true => println("True")
    case false => println("False")
  }
  /**
   *
   */
  //Часть 3
  println("Отфильтровать последовательность, оставив только элементы типа String(заодно и только элементы типа Int).")
  val xS = List("One", 2, 3, "Four", "Five")
  println(xS)
  println(xS.filter(FilterByType.onlyString)) // оставить только строки
  println(xS.filter(FilterByType.onlyInt)) // оставить только Int
}
