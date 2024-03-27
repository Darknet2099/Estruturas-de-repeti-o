import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
  int x, nota , quant ;
  double soma = 0 , media;
     System.out.println("Digite a quantidade de Notas");
    quant = entrada.nextInt();
    
    for ( x = 1 ; x <= quant; x++){
      System.out.println("Digite a nota");
      nota = entrada.nextInt();
      soma += nota;
    }
    media = soma / quant;
    System.out.print("A média é: " + media);
    
  }
}
