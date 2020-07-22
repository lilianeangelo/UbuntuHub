package revisao;

abstract class Casa {
    protected String janela;
    protected String porta;
    protected String escada;
    // protected vs private
    public Casa(){
    }

    public Casa(String janela, String porta, String escada) {
        this.janela = janela;
        this.porta = porta;
        this.escada = escada;
    }

    public String getJanela() {
        return janela;
    }

    public void setJanela(String janela) {
        this.janela = janela;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getEscada() {
        return escada;
    }

    public void setEscada(String escada) {
        this.escada = escada;
    }

    public abstract void abrirPorta();

    public abstract void telefonarVizinho();
}
