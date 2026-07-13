package sistemaTaxonomico;

public class Professor extends Pessoa {
    private String especialidade;

    public Professor(String nome,String especialidade) {
        super(nome);

        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}


