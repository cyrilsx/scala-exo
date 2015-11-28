package types.advanced

/**
 * Created by cyril on 14/05/15.
 */
class StruturalTypes {

  def appendLines(target: {def append(str: String): Any}, lines: Iterable[String]): Unit = {
    for (l <- lines) {
      target.append(l)
      target.append("\n")
    }
  }


  class Toto {
    def append(s: String) = None
    override def toString: String = "Toto"
  }

  class Tata {
    override def toString: String = "Tata"
  }

  def main(args: Array[String]) {
    val toto: Toto = new Toto
     // toto appendLines Seq("fdjfkd", "ewew")
  }



}
