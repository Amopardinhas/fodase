package sistemaTaxonomico.TratamentoExcecoes;

public class IdDuplicado extends Exception {

    public IdDuplicado(String mensagem) {
        super(mensagem);
    }
}