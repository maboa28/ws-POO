package Entidades;
public class Contato {
    private String nome;
    private Integer numeroDeTelefone;
    int index = 0;


    public Contato(String n, Integer numeroDeTelefone) {
        this.nome = n;
        this.numeroDeTelefone = ndt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public Integer getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(Integer ndt) {
        this.numeroDeTelefone = ndt;
    }

    public void inserir(Contato c) {
        this.contatos[index] = c;
    }

    public void imprimir() {

    }
}
