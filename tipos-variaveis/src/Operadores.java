public class Operadores {
    public static void main(String[] args){

        // Operador de ATRIBUIÇÃO 
        String nome = "Sofia";
        int idade = 18;
        double peso = 68.5;
        char sexo = 'F';
        boolean doadorOrgao = true;
        //Date dataNascimento = new Date(); - No caso o Date seria um método

        // Operadores ARITMÉTICOS
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 7);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao); // ?
        concatenacao = 1 + 1 + 1 + "1"; 
        System.out.println(concatenacao); //31
        concatenacao = 1 + "1" + 1 +1;
        System.out.println(concatenacao); //1111
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);  //1111
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);  //13

        // Operadores UNÁRIOS
        int numero1 = 5;
        System.out.println(-numero1); //-5
        System.out.println(numero1);  //5
        numero1 = - numero1;
        System.out.println(numero1); //-5
        numero1 = + numero1;
        System.out.println(numero1); //-5
        numero1 = numero1 * -1;
        System.out.println(numero1); //5
        
        numero1 = numero1 + 1;
        System.out.println(numero1); // 6
        numero1++;
        System.out.println(numero1); // 6
        System.out.println(numero1++); // 5
        System.out.println(numero1); // 6
        System.out.println(++numero1); // 6

        System.out.println(numero1--); // 5
        System.out.println(numero1); // 4
        System.out.println(--numero1); // 4

        boolean variavel = true;
        System.out.println(!variavel); // false
        System.out.println(variavel); // true
        variavel = !variavel;
        System.out.println(variavel);  //false

        // operador TERNÁRIO
        int a,b;
        String resultado_opr = "";
        a = 5;
        b = 6;
        // Exemplo de  condicional utilizando uma estrutura if/else
        if(a==b)
            resultado_opr = "Verdadeiro";
        else 
            resultado_opr = "Falso";
        System.out.println(resultado_opr);

        // Mesma condiciona, mas dessa vez, utilizando o operador condicional Ternário
        resultado_opr = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado_opr);
        int resulta = a==b ? 1 : 0;
        System.out.println(resulta);

        // operadores RELACIONAIS
        int n1 = 1;
        int n2 = 2;
        boolean simNao = n1 == n2;
        System.out.println("Número 1 é IGUAL ao número 2?  " + simNao);

        simNao = n1 != n2;
        System.out.println("Número 1 é DIFERENTE ao número 2?  " + simNao);

        simNao = n1 > n2;
        System.out.println("Número 1 é MAIOR ao número 2?  " + simNao);

        simNao = n1 >= n2;
        System.out.println("Número 1 é MAIOR OU IGUAL ao número 2?  " + simNao);

        if(n1<n2){
            System.out.println("A nossa condição é verdadeira");
        }
        
        if(n1==n2){
            System.out.println("A nossa condição é verdadeira");
        }

        String nomeUm = "SOFIA";
        String nomeDois = "SOFIA";
        System.out.println(nomeUm==nomeDois); // true 

        nomeDois = new String("SOFIA");
        System.out.println(nomeUm==nomeDois);  // false
        System.out.println(nomeUm.equals(nomeDois)); // true  - eguals compara conteúdos

        // operadores LÓGICOS 
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }

        if(condicao1 && ( 7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        System.out.println("FIM");






    }
}
