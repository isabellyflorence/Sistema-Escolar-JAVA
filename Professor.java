package models;

public class Professor {

    private String nome;
    private double salario;
    private String disciplina;

    // Construtor completo
    public Professor(String nome, double salario, String disciplina) {  
        this.nome = nome;
        setSalario(salario);
        this.disciplina = disciplina;
    }
    // Construtor apenas com nome
    public Professor(String nome) {
        this.nome = nome;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
     public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: O salário deve ser maior que zero.");
        }
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void exibirProfessor() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Matéria: " + disciplina);
    }
    
}
   