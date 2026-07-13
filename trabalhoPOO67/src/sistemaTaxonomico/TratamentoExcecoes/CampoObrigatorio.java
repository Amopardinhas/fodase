package sistemaTaxonomico.TratamentoExcecoes;

public class CampoObrigatorio extends Exception {

    public CampoObrigatorio(String mensagem) {
        super(mensagem);
    }
}