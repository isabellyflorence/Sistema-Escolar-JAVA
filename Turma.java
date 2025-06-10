package models;

public class Turma {
    private String codigoTurma;
    private int serie;
    private int quantidadeAlunos;

    public Turma(String codigoTurma, int serie) {
        this.codigoTurma = codigoTurma;
        this.serie = serie;
        this.quantidadeAlunos = 0;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if (quantidadeAlunos >= 0) {
            this.quantidadeAlunos = quantidadeAlunos;
        } else {
            System.out.println("Erro: a quantidade de alunos deve ser positiva.");
        }
    }

    public void exibirTurma() {
        System.out.println("Código da Turma: " + codigoTurma);
        System.out.println("Série: " + serie);
        System.out.println("Quantidade de Alunos: " + quantidadeAlunos);
    }
}
