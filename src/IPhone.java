public class IPhone extends AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical
{
    public static void main(String[] args)
    {
        // Teste dos métodos de AparelhoTelefonico
        IPhone iphone = new IPhone();
        iphone.ligar("1234");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Teste dos métodos de ReprodutorMusical
        iphone.selecionarMusica("Rammstein - Haifisch");
        iphone.tocar();
        iphone.pausar();
        iphone.anterior();
        iphone.proxima();

        // Teste dos métodos de NavegadorInternet
        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    @Override
    public void tocar()
    {

    }

    @Override
    public void pausar()
    {

    }

    @Override
    public void anterior()
    {

    }

    @Override
    public void proxima()
    {

    }

    @Override
    public void selecionarMusica(String musica)
    {

    }

    @Override
    public void exibirPagina(String url)
    {

    }

    @Override
    public void adicionarNovaAba()
    {

    }

    @Override
    public void atualizarPagina()
    {

    }
}
