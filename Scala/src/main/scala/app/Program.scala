package app

import enums.{Andre, Bolinho, Grupo, Leo, Reiso}
import models.{Arrombado, EstudanteCesarSchool, Timbu}
import traits.{Desesperado, Estudante, Lascado}
import util.MultiplosDeDois

object Program {

  def quemTaApresentando(apresentador : Grupo): String = {
    apresentador match {
      case Andre => "cookies"
      case Bolinho => "bulinhu"
      case Leo => "vai dormir leo"
      case Reiso => "sou eu mesmo"
    }
  }

  def main(args: Array[String]): Unit = {

    val pessoaApresentando : Grupo = Reiso

    println(quemTaApresentando(pessoaApresentando))

    println(MultiplosDeDois(40))

//    object Reiso extends Lascado with Desesperado {
//      val isLascado: Boolean = true
//      val isDesesperado: Boolean = true
//
//      override def sound(): String = "o desgraca"
//    }
//
//    def sentarEChorar(estudante: Estudante) = {
//      "Chorando"
//    }

//    println(sentarEChorar(Reiso))

//    val timbu1 = new Timbu("Euzinho", 2)
//    // println(timbu1.toString())
//    println(timbu1.sound())
//    println(timbu1)
//    println()
//
//    val estudante1 = new Estudante("Eu", 1)
//    // println(estudante1.toString())
//    println(estudante1.sound())
//    println(estudante1)
//    println()
//
//    val arrombado1 = new Arrombado("Eudenovo", 1)
//    // println(arrombado1.toString())
//    println(arrombado1.sound())
//    println(arrombado1)
//    println()

  }

}
