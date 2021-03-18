import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello World");
	 
		Scanner obj=new Scanner (System.in);
		
		int choice =0;
		
		while(choice !=3) {
			
			System.out.println("1 - Adicionar um livro / 2 - Adicionar um autor");
			
			choice =obj.nextInt();
			
			if(choice == 1) {
				
				Livro obj1=new Livro();
				obj1.titulo=obj.nextLine();
				System.out.println("Insira o titulo do livro");
				obj1.titulo=obj.nextLine();
				System.out.println("Insira o autor do livro");
				obj1.autor=obj.nextLine();
				System.out.println("Insira o editora do livro");
				obj1.editora=obj.nextLine();
				System.out.println("Insira o ISBN do livro");
				obj1.isbn=obj.nextInt();
				System.out.println("Insira o ano de lancamento do livro");
				obj1.ano=obj.nextInt();
				
				obj1.getdata(obj1.titulo, obj1.autor, obj1.editora, obj1.isbn, obj1.ano);
				obj1.setdata();
				}		
					else if (choice==2) {
						
						Autor obj1=new Autor();
						obj1.nome=obj.nextLine();
						System.out.println("Insira o nome do autor");
						obj1.nome=obj.nextLine();
						System.out.println("Insira o país de origem do autor");
						obj1.pais=obj.nextLine();
						
						obj1.getdata(obj1.nome, obj1.pais);
						obj1.setdata();		
					
			}
				
		}
		
	}

}