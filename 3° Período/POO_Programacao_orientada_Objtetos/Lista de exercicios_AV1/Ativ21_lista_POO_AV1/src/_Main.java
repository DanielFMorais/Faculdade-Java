public class _Main {
    public static void main(String[] args) throws Exception {
        

        // Criando primeiro aluno
        Aluno a1 = new Aluno(1234, "01234567890", "João");
        a1.setNota(0, 70);
        a1.setNota(1, 80);
        a1.setNota(2, 90);
        a1.setNota(3, 85);

        a1.setFalta(0, 2);
        a1.setFalta(1, 1);
        a1.setFalta(2, 0);
        a1.setFalta(3, 3);

        System.out.println("Aluno: " + a1.getNome());
        System.out.println("Média: " + a1.calcularMedia());
        System.out.println("Situação: " + a1.calcularSituacao());

        System.out.println("--------------------------------");

        // Criando segundo aluno
        Aluno a2 = new Aluno(5678, "98765432100", "Maria");
        a2.setNota(0, 55);
        a2.setNota(1, 60);
        a2.setNota(2, 50);
        a2.setNota(3, 70);

        a2.setFalta(0, 4);
        a2.setFalta(1, 2);
        a2.setFalta(2, 1);
        a2.setFalta(3, 0);

        System.out.println("Aluno: " + a2.getNome());
        System.out.println("Média: " + a2.calcularMedia());
        System.out.println("Situação: " + a2.calcularSituacao());
    }
}
