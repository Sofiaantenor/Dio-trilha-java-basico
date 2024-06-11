public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto = numeroNormal;  - Questing, força a linguagem a receber um número mais expeicifco e indica que o programador se responsabilizá-ra pelos erros
        short numeroCurto = (short)numeroNormal;

    }
}
