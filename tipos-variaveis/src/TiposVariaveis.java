public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        // estude a classe String que representa texto na aplicação
        String meuNome = "Sofia Teixeira";
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto = numeroNormal;  - Questing, força a linguagem a receber um número mais expeicifco e indica que o programador se responsabilizá-ra pelos erros
        short numeroCurto1 = (short)numeroNormal;

        int numero = 19;
        System.out.println(numero);
        numero = 25;
        System.out.println(numero);

        double VALOR_PI = 3.14;
        System.out.println(VALOR_PI);
        VALOR_PI = 14.14;
        System.out.println(VALOR_PI);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
        VALOR_PI = 14.14;
        System.out.println(VALOR_DE_PI);
    }
}
