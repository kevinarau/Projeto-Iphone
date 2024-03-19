
package Processador;

import aparelhoIphone.AparelhorTelefonico.aparelhoTele;
import aparelhoIphone.Navegadorinternet.navegadorInternet;
import aparelhoIphone.ReproduzirMusica.reprodutorMusical;


public class Processar implements aparelhoTele, navegadorInternet, reprodutorMusical {


    public void ChamaCorreioVoz() {
        System.out.println("Digitando via equipamento multifucional");

    }

    @Override
    public void atender() {   System.out.println("Digitando via equipamento multifucional");

    }

    @Override
    public void ligar() {

    }


    public void NovaAba() {
        System.out.println("Imprimir  via equipamento multifucional");

    }


    public void atualizarPag() {
        System.out.println("Imprimir  via equipamento multifucional");

    }

    @Override
    public void ExibirPag() {
        System.out.println("Imprimir  via equipamento multifucional");

    }


    @Override
    public void tocar() {
        System.out.println("Imprimir  via equipamento multifucional");
    }

    @Override
    public void pausar() {
        System.out.println("Imprimir  via equipamento multifucional");
    }

    @Override
    public void ListaMusica() {
        System.out.println("Imprimir  via equipamento multifucional");
    }
}