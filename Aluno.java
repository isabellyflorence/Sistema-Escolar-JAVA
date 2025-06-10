package models;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private double notaFinal;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.notaFinal = 0.0;
    }

    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 10.0) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Erro: nota deve estar entre 0.0 e 10.0");
        }
    }

    @Override
    public String toString() {
        return "Aluno [Nome: " + nome +"|"+ ", Matricula: " + matricula +"|"+ ", Idade: " + idade +"|"+ ", Nota Final: " + notaFinal
                + "]";
    }

    

}
     

