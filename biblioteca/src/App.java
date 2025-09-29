public class App {
    public static void main(String[] args) throws Exception {
      
    
        // Aluno: Maria, 17 anos, Matrícula A123
        Aluno aluno = new Aluno("Maria", 17, "A123");

        // Livro: Dom Casmurro, Machado de Assis, 1899
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        // --- 2. Exibição das Informações Iniciais (usa o toString() de cada classe) ---
        
        System.out.println("--- Informações Iniciais ---");
        System.out.println(aluno); 
        System.out.println(livro);

        // --- 3. Alteração dos Atributos usando Setters ---
        
        // Altera a idade da aluna para 18
        aluno.setIdade(18);

        // Altera o título do livro para Memórias Póstumas de Brás Cubas
        livro.setTitulo("Memórias Póstumas de Brás Cubas");

        // --- 4. Exibição das Informações Atualizadas ---

        System.out.println("\n--- Informações Atualizadas ---");
        System.out.println(aluno);
        System.out.println(livro);
    }
}
    

