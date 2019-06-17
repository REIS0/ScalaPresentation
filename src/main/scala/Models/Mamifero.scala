package Models

abstract class Mamifero(protected val nome: String, protected val idade: Int) {

  def getNome() = nome
  def getIdade() = idade

  override def toString() = "Nome: " + getNome() + "\n" + "Idade: " + getIdade()

}
