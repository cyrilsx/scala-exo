package types.advanced

/**
 * Created by cyril on 14/05/15.
 */
class SingletonType {


  class Document(var title: String, author: String) {
    def setTitle(name: String): this.type = { this.title = name; this }
  }

  class Book(title: String, author: String, var chapter: String) extends Document(title, author) {
    def setChapter(chapter: String) =  { this.chapter = chapter; this }
  }

  object Title

  class Document2 {

  }


  def main(args: Array[String]) {
    val book = new Book("coin", "bouh", "chapter")
    book.setTitle("Scala for the win").setChapter("coin")
  }
}
