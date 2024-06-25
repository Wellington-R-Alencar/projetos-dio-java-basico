import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		try {
			System.out.println("Digite o primeiro parâmetro");
		    int parametroUm = scanner.nextInt();
		    System.out.println("Digite o segundo parâmetro");
		    int parametroDois = scanner.nextInt();


			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro: " + exception.getMessage() );
		}finally{
            //Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }

		
	}
	public class ParametrosInvalidosException extends Exception {}
	 public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois- parametroUm;
		for (int i =0 ; i< contagem ; i ++){
			
			//contagem = parametroDois - parametroUm;
			System.out.println("Contagem " + (i+1));
		}
		 
		//realizar o for para imprimir os números com base na variável contagem
	}
}