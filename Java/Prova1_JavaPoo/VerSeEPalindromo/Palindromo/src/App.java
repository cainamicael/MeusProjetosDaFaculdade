import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase ou a palavra para fazer o teste se é ou não palíndromo (Não use acentos):");
        String palavra = sc.nextLine();
        String p = palavra;
        palavra = palavra.replace(" ", "");
        int i;
        int c = 0;
        int l = (palavra.length());
        for (i = 0; i< palavra.length(); i++){
            l--;
            if (palavra.charAt(i)==palavra.charAt(l)){
              c += 1;  
            }
           
        }
        if (c == palavra.length()){
            System.out.printf("%s Se desconsiderar os espaços, é palíndromo",p);
        }else {
            System.out.printf("%s Não eh palíndromo",p);
        }
    }
}

/* Para ver no Github:
https://github.com/cainamicael/MeusProjetosDaFaculdade/tree/main/Java/Prova1_JavaPoo/VerSeEPalindromo
*/
