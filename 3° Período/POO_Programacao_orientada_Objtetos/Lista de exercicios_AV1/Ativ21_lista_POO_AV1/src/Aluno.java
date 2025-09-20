import java.util.Scanner;

public class Aluno {

    Scanner sc = new Scanner(System.in);

    int registroAcademico;
    String cpf;
    String nome;
    double[] notas;
    int[] faltas;

    public Aluno (int registroAcademico, String cpf, String nome){
        this.registroAcademico = registroAcademico;
        this.cpf = cpf;
        this.nome = nome;
        this.notas = new double[4];
        this.faltas = new int[4];
    }

   // Getters e Setters
    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNota(int disciplina, double nota) {
        if (disciplina >= 0 && disciplina < 4) {
            this.notas[disciplina] = nota;
        }
    }

    public int[] getFaltas() {
        return faltas;
    }

    public void setFalta(int disciplina, int falta) {
        if (disciplina >= 0 && disciplina < 4) {
            this.faltas[disciplina] = falta;
        }
    }

    // Método para calcular média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para verificar situação
    public String calcularSituacao() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 60 || faltas[i] >= 5) {
                return "Reprovado";
            }
        }
        return "Aprovado";
    } 
    


    
}
