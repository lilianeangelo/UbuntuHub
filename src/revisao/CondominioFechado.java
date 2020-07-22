package revisao;

public class CondominioFechado extends Casa{
    private String porteiro;

    public CondominioFechado(String janela, String porta, String escada, String porteiro) {
        super(janela, porta, escada);
        this.porteiro = porteiro;
    }

    public CondominioFechado(){

    }

    public String getPorteiro() {
        return porteiro;
    }

    public void setPorteiro(String porteiro) {
        this.porteiro = porteiro;
    }

    @Override
    public void abrirPorta() {
        System.out.println("Abrirei a porta!");
    }

    @Override
    public void telefonarVizinho() {

    }

    public void lavarALixeira(){
        System.out.println("Consegui lavar a lixeira");
    }

    public void cortar(String corte){
        System.out.println("Vou cortar a grama");
    }

    public void cortar(int hora){
        System.out.println(12);
    }

    public void cortar(boolean zelador){
        if(zelador == true){
            System.out.println("Corte a grama agora!");}
        else{
            System.out.println("Não corte a grama!");
        }
    }
}
