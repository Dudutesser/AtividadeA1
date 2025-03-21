package Questoes;

public class Aluno extends BaseIdentificador{
    String nome;
    String genero;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Aluno(int codigo, String nome, String genero) {
        super(codigo);
        this.nome = nome;
        this.genero = genero;
    }
    
    @Override
    public void Executar() {
        
    }
}
