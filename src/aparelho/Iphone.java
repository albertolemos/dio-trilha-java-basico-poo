package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atender ligação");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciar correio de voz");
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo a página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionar nova aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizar página");
  }

  @Override
  public void tocar() {
    System.out.println("Tocar uma música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausar uma música");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionar uma música: " + musica);
  }
}
