package Models

import Traits.Animal

abstract class Mamifero(protected val nome: String, protected val idade: Int) extends Animal {

  def getNome() = nome
  def getIdade() = idade

  override def toString() = "Nome: " + getNome() + "\n" + "Idade: " + getIdade()

}
