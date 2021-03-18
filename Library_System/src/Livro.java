
public class Livro {
	
	String titulo,autor,editora;
	int isbn,ano;
	
	public void getdata( String titulo, String autor, String editora, int isbn, int ano) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.editora=editora;
		this.isbn=isbn;
		this.ano=ano;
		
	}

	public void setdata() {
		

		System.out.println("Título do livro: "+titulo);
		System.out.println("Autor do livro: "+autor);
		System.out.println("Editora do livro: "+editora);
		System.out.println("ISBN do livro: "+isbn);
		System.out.println("Ano de lancamento: "+ano);
	}
	
}