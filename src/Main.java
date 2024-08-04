import aparelho.Iphone;

public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

//    Aparelho Telefonico
    iphone.ligar("879123445678");
    iphone.atender();
    iphone.iniciarCorreioVoz();

//    Reprodutor Musical
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Qualquer uma de pagode");

//    Navegador da Internet
    iphone.exibirPagina("www.apple.com");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}