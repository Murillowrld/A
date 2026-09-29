import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        int fib[]= new int [10];
        int pa[]= new int [10];
        int pg[]= new int [10];
        
        //1.1 Prechendo vetor Fibonnacci
        fib[0]=0;
        fib[1]=1;

        for (int i =2; i<10; i++){
            fib[i] = fib [i-1]+fib[i-2];
        }
        //2. Preencher o vetor
        System.out.print("Digite o valor inicial da PA: ");
        int inicioPA = ler.nextInt();
        pa[0]=inicioPA;
        System.out.print("Digite o valor razao da PA: ");
        int razaoPA = ler.nextInt();

        for(int i =1; i<10;i++){
            pa[i] = pa[i-1]+razaoPA;

        }

        //3. Preenchendo o valor PG
        System.out.print("Digite o valor inicial da PG");
        int inicioPG = ler.nextInt();
        System.out.print("Digite o valor darazao da PG: ");
        int razaoPG = ler.nextInt();
        pg[0]=inicioPG;
        for(int i =1; i<10; i++){
            pa[i] = pg[i-1]*razaoPG;
        }

        //4. Imprimir os três vetores
        System.out.println("\nVetor Fibonnacci: ");
        for (int i = 0; i<10; i++){
            System.out.print(fib[i]+",");
        }
        System.out.println("\nVetor Progressão Aritimética: ");
        for (int i = 0; i<10; i++){
            System.out.print(pa[i]+",");

    }
    System.out.println("\nVetor Progressão Geométrica: ");
        for (int i = 0; i<10; i++){
            System.out.print(pg[i]+",");
        }
        ler.close();
    }
}

