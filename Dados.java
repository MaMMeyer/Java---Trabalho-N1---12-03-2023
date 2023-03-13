public class Dados{

    String curso;
    String turno;
    String faculdade;
    boolean matricula;
    

    void matriculado() {
        if (matricula) {
            return;
        } else {
            System.out.println("Aluno : Matriculado");
            matricula = true;
        }
    }

    void matriculanao() {
        if (matricula) {
            return;
        } else {
            System.out.println("Aluno Não matriculado");
            matricula = false;
        }
    }

    Entidade academico = new Entidade();

}