import Models.{Arrombado, EstudanteCesarSchool, Timbu}
import Traits.Animal

trait Animal {
    def sound() : String
}

abstract class Mamifero(protected val nome: String, protected val idade: Int) extends Animal {
    def getNome() = nome
    def getIdade() = idade

    override def toString() = {
        "Nome: " + getNome() + "\n" + "Idade: " + getIdade()
    }
}

class Timbu(nome: String, idade: Int) extends Models.Mamifero(nome, idade) {
    def sound() = "squeek"
}

class Estudante(nome: String, idade: Int) extends Models.Mamifero(nome, idade) {
    def sound() = "joao fudeu meu find"
}

class Arrombado(nome: String, idade: Int) extends Models.Mamifero(nome, idade) {
    def sound() = "perdi"
}

object Main { 
    def main(args: Array[String]): Unit = {
        val timbu1 = new Timbu("Euzinho", 2)
        // println(timbu1.toString())
        println(timbu1.sound())
        println(timbu1)
        println()

        val estudante1 = new Estudante("Eu", 1)
        // println(estudante1.toString())
        println(estudante1.sound())
        println(estudante1)
        println()

        val arrombado1 = new Arrombado("Eudenovo", 1)
        // println(arrombado1.toString())
        println(arrombado1.sound())
        println(arrombado1)
        println()
    } 
}
