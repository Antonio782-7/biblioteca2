

// ESTRUTURA MÍNIMA DA CLASSE LIVRO (para compilação)
class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

// CLASSE EMPRESTIMO
/**
 * Representa o registro de um empréstimo, associando um Aluno e um Livro
 * e registrando as datas de transação.
 */
public class Emprestimo {
    
    // --- Atributos Privados ---
    
    private Aluno aluno;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    // --- Construtor ---

    public Emprestimo(Aluno aluno, Livro livro, String dataEmprestimo) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null; // Devolução pendente
    }

    // --- Getters ---

    public Aluno getAluno() {
        return aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    // --- Setters ---

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // --- Método toString() ---

    @Override
    public String toString() {
        String infoDevolucao = (dataDevolucao == null) 
                               ? "Devolução Pendente" 
                               : "Devolvido em: " + dataDevolucao;
        
        return "--- Detalhes do Empréstimo ---\n" +
               "  Aluno: " + aluno.getNome() + "\n" +
               "  Livro: " + livro.getTitulo() + "\n" +
               "  Emprestado em: " + dataEmprestimo + "\n" +
               "  Status: " + infoDevolucao + "\n" +
               "------------------------------";
    }
}

