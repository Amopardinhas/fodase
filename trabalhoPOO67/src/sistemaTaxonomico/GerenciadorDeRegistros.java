package sistemaTaxonomico;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeRegistros {

    private List<Registro> registros;

    public GerenciadorDeRegistros() {
        this.registros = new ArrayList<>();
    }

    // CREATE
    public void adicionarRegistro(Registro registro) {
        registros.add(registro);
    }

    //listar todos
    public List<Registro> listarRegistros() {
        return registros;
    }

    //buscar por ID do tombo
    public Registro buscarPorId(String idTombo) {
        for (Registro r : registros) {
            if (r.getIdTombo().equalsIgnoreCase(idTombo)) {
                return r;
            }
        }
        return null;
    }

    //buscar por espécie
    public List<Registro> buscarPorEspecie(String especie) {
        List<Registro> encontrados = new ArrayList<>();

        for (Registro r : registros) {
            if (r.getTaxonomia().getEspecie().equalsIgnoreCase(especie)) {
                encontrados.add(r);
            }
        }

        return encontrados;
    }

    //buscar por gênero
    public List<Registro> buscarPorGenero(String genero) {
        List<Registro> encontrados = new ArrayList<>();

        for (Registro r : registros) {
            if (r.getTaxonomia().getGenero().equalsIgnoreCase(genero)) {
                encontrados.add(r);
            }
        }

        return encontrados;
    }

    //buscar por coletor
    public List<Registro> buscarPorColetor(String nomeColetor) {
        List<Registro> encontrados = new ArrayList<>();

        for (Registro r : registros) {
            if (r.getColetor().getNome().equalsIgnoreCase(nomeColetor)) {
                encontrados.add(r);
            }
        }

        return encontrados;
    }

    //buscar por UF
    public List<Registro> buscarPorUf(String uf) {
        List<Registro> encontrados = new ArrayList<>();

        for (Registro r : registros) {
            if (r.getUf().equalsIgnoreCase(uf)) {
                encontrados.add(r);
            }
        }

        return encontrados;
    }

    // atualizar
    public boolean atualizarRegistro(String idTombo, Registro novoRegistro) {
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdTombo().equalsIgnoreCase(idTombo)) {
                registros.set(i, novoRegistro);
                return true;
            }
        }
        return false;
    }

    // Deletar
    public boolean removerRegistro(String idTombo) {
        Registro registro = buscarPorId(idTombo);

        if (registro != null) {
            registros.remove(registro);
            return true;
        }

        return false;
    }
}
//todas as funções:
//adicionarRegistro
//listarRegistros
//buscarPorId
//atualizarRegistro
//removerRegistro