package models
import traits.{Desesperado, Lascado}

class EstudanteCesarSchool(nome: String, idade: Int) extends Mamifero(nome, idade) with Lascado with Desesperado{

  override val isLascado: Boolean = true
  override val isDesesperado: Boolean = true

  override def sound(): String = "to cansado"

}
