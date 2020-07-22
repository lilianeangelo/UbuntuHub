package revisao;

public class Bairro extends Casa{
    private String rua;
    private Integer vizinhos;

    public Bairro(String janela, String porta, String escada, String rua, Integer vizinhos) {
        super(janela, porta, escada);
        this.rua = rua;
        this.vizinhos = vizinhos;
    }

    public Bairro(){

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(Integer vizinhos) {
        this.vizinhos = vizinhos;
    }

    @Override
    public void abrirPorta() {
        System.out.println("Abrir a porta do bar abaixo da casa");
    }

    @Override
    public void telefonarVizinho() {
        System.out.println("Vou telefonar para meu vizinho");
    }
}
