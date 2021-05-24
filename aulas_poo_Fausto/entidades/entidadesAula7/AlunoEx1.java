package entidadesAula7;

public class AlunoEx1 {

    private String nome;
    private float nota1;
    private float nota2;

    public AlunoEx1(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    private float media() {
        return (this.nota1 + this.nota2) / 2;
    }
    private String situação() {
        String situação = "";
        float media = this.media();
        if (media < 9) {
            situação = "Aprovado com excelência!!";
        }
        else if( media < 9 && media >= 7) {
            situação = "Aprovado.";
        }
        else if (media <= 7 && media > 4){
            situação = "Recuperação.";
        }
        else {
            situação = "Reprovado.";
        }
        return situação;
    }
    public String resultado() {
        return this.nome + ", média: " + this.media() + " - " + this.situação();
    }
}
