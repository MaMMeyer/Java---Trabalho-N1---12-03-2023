public class Aluno{
    public static void main(String[] args) {

        System.out.println("  -  Aluno  -  ");
        Dados universitario = new Dados();
        //Arquivo Entidade.java dados pessoais 
        universitario.academico.nome = "Marcelo";
        universitario.academico.cpf = "92564259049";
        universitario.academico.idade = 44;
        universitario.academico.sexo = "Masculino";
        //Imprimir na Tela
        System.out.println("Aluno : " + universitario.academico.nome);
        System.out.println("CPF   : " + universitario.academico.cpf);
        System.out.println("Idade : " + universitario.academico.idade);
        System.out.println("Sexo  : " + universitario.academico.sexo);

        //Arquivo Dados.java dados cadastrais Faculdade
        universitario.curso = "ADS";
        universitario.turno = "Vespertino";
        universitario.faculdade = "Fasipe";

        System.out.println("Curso : " + universitario.curso);

        universitario.matriculado();
        System.out.println("Turno : " + universitario.turno);
    }
}