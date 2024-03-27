import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
  int x, E;
  int A = 0;
  int B = 0;
  int C = 0;
  int voto = 0; 

      System.out.println("Digite a quantidade de Eleitores: ");
      E = entrada.nextInt();
    
    for ( x = 1 ; x <= E; x++) {
      System.out.println("digite o numero do seu candidato: 1, 2 ou 3. ");
      voto = entrada.nextInt();
      if (voto == 1){
        A = A + 1;
        System.out.println("O candidato A recebeu " + A + " votos");
      }
      else if (voto == 2){
        B = B + 1;
        System.out.println("O candidato B recebeu " + B + " votos");  
      }
      else if (voto == 3){
        C = C + 1;
      System.out.println("O candidato C recebeu " + C + " votos");
      }
     
    }
      System.out.println("O total de votos registrados foram=>" + E);
  }
}

