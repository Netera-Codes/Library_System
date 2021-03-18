
public class Autor {
	
	String nome,pais;
	
	public void getdata( String nome, String pais) {
		
		this.nome=nome;
		this.pais=pais;
		
	}

	public void setdata() {
		
		System.out.println(" ");
		System.out.println("Nome do autor: "+nome);
		System.out.println("Nacionalidade: "+pais);
	}
	

}