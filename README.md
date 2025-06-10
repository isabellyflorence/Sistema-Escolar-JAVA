# Sistema Escolar em Java

Este projeto tem como objetivo o desenvolvimento de um sistema simples para gerenciar informações de alunos, professores e turmas em uma escola. O projeto está dividido em três partes principais: criação de classes para **Aluno**, **Professor** e **Turma**.

## Estrutura do Projeto

O sistema possui as seguintes classes principais:

1. **Aluno**: Gerencia as informações dos alunos, como nome, matrícula, idade e nota final.
2. **Professor**: Gerencia os dados dos professores, incluindo nome, disciplina e salário.
3. **Turma**: Gerencia as informações das turmas, como código, série e quantidade de alunos.

### Classes Implementadas

#### **1. Classe `Aluno`**

A classe `Aluno` é responsável por armazenar e gerenciar as informações dos alunos. Seus principais atributos são:

* **nome**: Nome do aluno.
* **matricula**: Número de matrícula do aluno.
* **idade**: Idade do aluno.
* **notaFinal**: Nota final do aluno (inicializada como 0.0).

**Métodos:**

* **Construtor**: Recebe `nome`, `matricula` e `idade`. Inicializa `notaFinal` como 0.0.
* **Getters e Setters**: Para acessar e modificar os atributos. O **setter** de `notaFinal` valida que a nota esteja entre 0.0 e 10.0.

**Exemplo de uso no `main`:**

```java
Aluno aluno1 = new Aluno("João Silva", "12345", 18);
aluno1.setNotaFinal(8.5);
System.out.println("Nome: " + aluno1.getNome());
System.out.println("Matrícula: " + aluno1.getMatricula());
System.out.println("Idade: " + aluno1.getIdade());
System.out.println("Nota Final: " + aluno1.getNotaFinal());
```

#### **2. Classe `Professor`**

A classe `Professor` é responsável por armazenar as informações dos professores. Seus atributos incluem:

* **nome**: Nome do professor.
* **disciplina**: Disciplina que o professor leciona.
* **salario**: Salário do professor (deve ser maior que zero).

**Métodos:**

* **Construtor**: Recebe `nome`, `disciplina` e `salario`.
* **Getters e Setters**: Para acessar e modificar os atributos. O **setter** de `salario` valida que o valor seja positivo.
* **exibirDetalhes()**: Exibe as informações completas do professor.

**Exemplo de uso no `main`:**

```java
Professor professor1 = new Professor("Maria Oliveira", "Matemática", 3500.0);
professor1.exibirDetalhes();
```

#### **3. Classe `Turma`**

A classe `Turma` é responsável por gerenciar as informações sobre as turmas. Seus atributos são:

* **codigoTurma**: Identificador da turma.
* **serie**: Série do aluno (ex: 1º, 2º, 3º ano).
* **quantidadeAlunos**: Número de alunos na turma (inicializado como 0).

**Métodos:**

* **Construtor**: Recebe `codigoTurma` e `serie`. Inicializa `quantidadeAlunos` como 0.
* **Getters e Setters**: Para acessar e modificar os atributos. O **setter** de `quantidadeAlunos` valida que o número de alunos seja positivo.
* **exibirTurma()**: Exibe os dados completos da turma.

**Exemplo de uso no `main`:**

```java
Turma turma1 = new Turma("TUR-001", 1);
turma1.setQuantidadeAlunos(25);
turma1.exibirTurma();
```

---

## Como Rodar o Projeto

### 1. Baixar o código

Faça o clone do repositório para sua máquina:

```bash
git clone https://github.com/usuario/sistema-escolar-java.git
```

### 2. Compilando e Executando

No diretório do projeto, compile o código com o seguinte comando:

```bash
javac Aluno.java Professor.java Turma.java App.java
```

Em seguida, execute a aplicação com:

```bash
java App
```

### 3. Exemplo de Execução

Quando o programa for executado, o `main` do `App.java` criará objetos de cada classe (Aluno, Professor, Turma) e exibirá suas informações no terminal.

```java
public class App {
    public static void main(String[] args) {
        // Criação de um aluno
        Aluno aluno1 = new Aluno("João Silva", "12345", 18);
        aluno1.setNotaFinal(8.5);
        System.out.println("Aluno: " + aluno1.getNome() + ", Nota Final: " + aluno1.getNotaFinal());

        // Criação de um professor
        Professor professor1 = new Professor("Maria Oliveira", "Matemática", 3500.0);
        professor1.exibirDetalhes();

        // Criação de uma turma
        Turma turma1 = new Turma("TUR-001", 1);
        turma1.setQuantidadeAlunos(25);
        turma1.exibirTurma();
    }
}
```

---

## Contribuindo

1. Faça um fork deste repositório.
2. Crie uma branch para a sua funcionalidade (`git checkout -b feature/nova-funcionalidade`).
3. Faça alterações, commit e envie para o seu fork.
4. Abra um pull request explicando as mudanças realizadas.

---

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
