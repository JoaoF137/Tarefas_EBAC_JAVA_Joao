package mod10;
import java.util.Scanner;


public class ExercicioMod10 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		float media;
	
	
	System.out.println("=====SISTEMA DE CÁLCULO DE MÉDIA=============");

		System.out.println("Digite a primeira nota do aluno:");
		float nota1 = a.nextFloat();
		System.out.println("Digite a segunda nota do aluno:");
		float nota2 = a.nextFloat();
		System.out.println("Digite a terceira nota do aluno:");
		float nota3 = a.nextFloat();
		System.out.println("Digite a quarta nota do aluno:");
		float nota4 = a.nextFloat(); 
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if (media >= 7.0) {
			System.out.println("O aluno foi aprovado com a média: "+media);

		}
		if (media >= 5.0 && media < 7.0) {
			System.out.println("O aluno está de recuperação com a média: "+media);

		}
		
		if (media < 5.0) {
			System.out.println("O aluno está reprovado com a média: "+media);

		}
		
	}
}
