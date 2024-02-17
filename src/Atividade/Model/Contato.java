// Pacote Atividade.Model
package Atividade.Model;

// Importações de classes necessárias
import java.util.ArrayList;
import java.util.List;

// Definição da classe Contato
public class Contato {

    // Atributos da classe
    private String nome;
    private String email;
    private String fone;

    // Lista para armazenar os contatos
    private static List<Contato> listaContatos = new ArrayList<>();

    // Construtor da classe
    public Contato(String nome, String email, String fone) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    // Método para salvar um contato
    public boolean salvar() {
        if (this.nome == null || this.email == null || this.fone == null) {
            return false;
        } else {
            listaContatos.add(this);
            return true;
        }
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}

