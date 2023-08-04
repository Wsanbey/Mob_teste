package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;
 

public class PessoaRepositorio {
    List<Pessoa> pessoaLista = new ArrayList<>();
  
    public boolean addPessoa(Pessoa u) {
        return this.pessoaLista.add(u);
    } 
 
}
