import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao Curso java");
        curso1.setCargaHoraria(8);


        System.out.println(curso1.getTitulo());
    }
}
