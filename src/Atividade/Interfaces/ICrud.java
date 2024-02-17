// Pacote Atividade.Interface
package Atividade.Interfaces;

// Importações de classes necessárias
import java.util.List;

import Atividade.Model.Contato;

// Definição da interface ICrud
public interface ICrud {
    boolean salvar();
    boolean alterar(int id);
    void excluir(int id);
    Contato consultar(int id);
    List<Contato> consultar();
}
