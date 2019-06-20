class Estudante(
    private val nome: String, 
    private val idade: Int, 
    private var media: Double,
    private var saldoBancario: Double = 0
    ) {
      
    def getNome() = nome
    def getIdade() = idade
    def getMedia() = media
    def getSaldoBancario() = saldoBancario + " reais"
    
    def depositar(valor: Double) = saldoBancario += valor
    def gastar(valor: Double) = saldoBancario -= valor

    override def toString() = "Nome: " + getNome() + "\n" + "Idade: " + getIdade()

}

