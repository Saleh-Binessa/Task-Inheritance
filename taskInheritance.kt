open class Book(var title: String, val author: String, var yearPublished: Int) {
    open fun getBookInfo() {
        println("$title by $author ($yearPublished)")
    }
}
class fictionBook(title: String, author: String, yearPublished: Int, val pagesNumber: Int, val scienceFiction: String): Book(title, author, yearPublished) {
    override fun getBookInfo()
    {
        println("Title: $title\nAuthor:$author\nYear Of Publish: $yearPublished\nPages Number: $pagesNumber\nScience Fiction: $scienceFiction")
    }
    fun read() {
        println("Enjoy the fictional world of $title!")
    }
}
class nonFictionBook(title: String, author: String, yearPublished: Int, val pagesNumber: Int, val subject: String): Book(title, author, yearPublished) {
    override fun getBookInfo()
    {
        println("Title: $title\nAuthor:$author\nYear Of Publish: $yearPublished\nPages Number: $pagesNumber\nSubject: $subject")
    }
    fun study() {
        println("Delve into the facts about $pagesNumber in $title.")
    }
}

fun main() {
    val fictionBook = fictionBook("The Hobbit", "J.R.R. Tolkien", 1995, 450,"Fantasy")
    val nonFictionBook = nonFictionBook("Rich Dad Poor Dad", "Robert Kiosaki", 1997, 350, "science")

    println("Information about Fiction Book:")
    fictionBook.getBookInfo()
    fictionBook.read()

    println("\nInformation about Non-Fiction Book:")
    nonFictionBook.getBookInfo()
    nonFictionBook.study()
}