
public class Algo {
 public static int[] separaParImpar(int[] vet) {
	 int []vet1 = new int[vet.length];
	 int auxPar = 0, auxImpar = vet.length -1;
	 int contadorOperacao = 0;
	 for(int i = 0 ; i < vet.length;i++) {
		 if(vet[i] % 2 == 0) {
			 vet1[auxPar] = vet[i];
			auxPar++;
			contadorOperacao++;
	 	}
		 else {
			 vet1[auxImpar] = vet[i];
			auxImpar--;		 
			contadorOperacao++;
		 }
	 }
	 System.out.println("Quantidade de iteracoes vetor aux : "+contadorOperacao);
	 return vet1;
 }
 
 public static int[] separaParImpar2(int[] vet) {
	 int intetra = 0;
	 int aux = vet.length;
	 for(int i = 0; i<aux ; i++) {
	 if(vet[i]==0) {
			 for(int g = aux-1; g >=0; g--) {
				 if(vet[g]%2==0) {
					 int aux2 = vet[i];
					 vet[i]=vet[g];
					 vet[g]=aux2; break;
				 }
				 intetra++;
			 } 
		 }		
		  if((vet[i]%2) !=0) {
			 for(int g = aux-1; g > i; g--) {
				 if((vet[g]%2)==0) {
					 int aux2 = vet[i];
					 vet[i]=vet[g];
					 vet[g]=aux2; break;
				 }
				 intetra++;
			 }
		 }
		 intetra++;
	 }
	 System.out.println("Quantidade de iteracoes : "+intetra);
	return vet;
}
 
 public static int[] geraVetor(int par, int impar) {
	 int []gera = new int[par+impar];
	 int aux = 0;
	 for(int i=1; i >= par*2; i++ ) {
		 if(i%2==0) {
			 gera[i]=i;
		 }
	 }
	 for(int g1=1; g1 >= impar*2;g1++ ) {
		 if(g1%2==0) {
			 gera[g1]=g1;
		 }
	 }
	 return gera;
 }
	 
	 
 

 public static void main(String args[]) {
	 
	
	 
	 
	 int[] valores = {3,6,1,6,7,1,8,5,2,7,4,1,0,3};
	int[] val1 = separaParImpar(valores);
	 int[] val2 = separaParImpar2(valores);
	 int[] val3 = geraVetor(20, 80);
	 
	 
	 System.out.print("Com vetor auxiliar : ");
	for(int i = 0; i < val1.length; i++)
		 System.out.print("  "+val1[i]);
	
	 System.out.println("\n\n");
	 
	 System.out.print("sem vetor auxiliar : ");
	 for(int i = 0; i < val2.length; i++)
		 System.out.print("  "+val2[i]); 
	 
	 System.out.println("\n\n");
	 for(int gg = 1; gg <= 100;gg++) {
		 System.out.print("  "+gg); 
	 }
	 System.out.println("\n\n");
	 for(int gg = 1; gg <= 100;gg++) {
		 System.out.print("  "+gg); 
	 }
	 
	 System.out.println("\n\n");
	 for(int ii = 0; ii < val3.length; ii++)
		 System.out.print("  "+val3[ii]);
	  
 }
}
