package pct_fontematriz01;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
	
     int notasAlunos[][] = {{5,6,7},{8,9,5},{8,5,6},{4,9,5},{8,9,7},{6,8,9}}; 
     
     float soma_turma = 0.0f, mg_turma = 0.0f;
     float mg_aluno[] = new float [6];
     
     //soma das notas de cada aluno
     
	try {
	 System.out.println("Nome: Matheus Jardim da Costa Santos");
	 System.out.println("RA: D1943D-7");
	 
	 for(int nl=0; nl < notasAlunos.length; nl++) {
    	 for(int nc=0; nc < notasAlunos.length; nc++) {
    		 mg_aluno[nl] = ((notasAlunos[nl][0] + notasAlunos[nl][1] + notasAlunos[nl][2])/3);
    		if(mg_aluno[nl] >= 7) {
    		    System.out.println("Aluno: " + (nl + 1) + " sua média foi: " + mg_aluno[nl] + " Aprovado!!");
    			nl++;
    		} 
    		else {
    		    System.out.println("Nota do Aluno " + (nl + 1) + " abaixo da média. Estude mais para o exame!");
    		    nl++;
    		}
    	 }
     }
	//soma das notas 
     for(int n = 0; n < mg_aluno.length; n++) {
    	 soma_turma = soma_turma + mg_aluno[n];
     }
     
     mg_turma = soma_turma / mg_aluno.length;
     System.out.println("Média geral da turma é igual a: " + mg_turma);
	
	}catch(Exception e) {
		System.out.println("ERRO: " + e.getMessage());
	}
     
    System.gc();
	
	}
}

