//Ler 2 valores númericos inteiros e apresentar o resultado da diferença do maior pelo menor valor//
void main(){
    int ValorA = Integer.parseInt (IO.readln("insira um número: "));
    int ValorB = Integer.parseInt (IO.readln("insira outro número: "));
    int diferenca;

    if (ValorA > ValorB)
     diferenca=  ValorA- ValorB;
else
            diferenca=  ValorB - ValorA;
    System.out.printf ( "A diferença é: %d\n", diferenca);

}