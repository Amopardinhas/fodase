package sistemaTaxonomico;

import java.time.LocalDate;

public class Registro{
    private String idTombo;
    private Taxonomia taxonomia;
    private String localidadeColeta;
    private String uf;
    private LocalDate dataColeta;
    private Pessoa coletor;
    private String identificador;
    private String observacoes;

    public Registro(String idTombo, Taxonomia taxonomia, String localidadeColeta, String uf, LocalDate dataColeta, Pessoa coletor, String identificador, String observacoes) {
        this.idTombo = idTombo;
        this.taxonomia = taxonomia;
        this.localidadeColeta = localidadeColeta;
        this.uf = uf;
        this.dataColeta = dataColeta;
        this.coletor = coletor;
        this.identificador = identificador;
        this.observacoes = observacoes;
    }

    public String getIdTombo() {
        return idTombo;
    }

    public void setIdTombo(String idTombo) {
        this.idTombo = idTombo;
    }


    public Taxonomia getTaxonomia() {
        return taxonomia;
    }

    public void setTaxonomia(Taxonomia taxonomia) {
        this.taxonomia = taxonomia;
    }

    public String getLocalidadeColeta() {
        return localidadeColeta;
    }

    public void setLocalidadeColeta(String localidadeColeta) {
        this.localidadeColeta = localidadeColeta;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public LocalDate getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDate dataColeta) {
        this.dataColeta = dataColeta;
    }

    public Pessoa getColetor() {
        return coletor;
    }

    public void setColetor(Pessoa coletor) {
        this.coletor = coletor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}