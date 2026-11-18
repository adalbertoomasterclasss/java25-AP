/*Lêr três valores para os lados de um triângulo, considerando
lados como: A, B e C. Verificar se os lados fornecidos
formam realmente um triângulo, e se for esta condição
verdadeira, deverá ser indicado qual o tipo de triângulo foi
formado: isóceles, escaleno ou equilátero.
 Considere: */
void main(){
    double  lado1 = Double.parseDouble  (IO.readln("Insira o 1o valor do lado triângulo: "));
    double lado2 = Double.parseDouble  ( IO.readln("Insira o 2o valor: "));
    double lado3 = Double.parseDouble( IO.readln("Insira o 3o valor: "));
    if (lado1 == lado2 && lado3 == lado1)
 System.out.printf ("Triângulo equilátero! "); 
    else
    if (lado1 != lado2 && lado2 != lado3 && lado1!= lado3)
   System.out.printf ("Triângulo escaleno! ");
    else
        System.out.printf ("Triângulo isósceles! ");
}