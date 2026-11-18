void main(){
    float nota1 = Float.parseFloat (IO.readln("Insira a nota da 1a unidade: "));
    float nota2 = Float.parseFloat (IO.readln("Insira a nota da 2a unidade: "));
    float nota3 = Float.parseFloat (IO.readln("Insira a nota da 3a unidade: "));

    float Media = (nota1 + nota2 + nota3) / 3;
    if (Media >= 7)
        System.out.printf("Aprovado com média %.2f \n", Media);
    else
     System.out.printf("Reprovado com média %.2f \n", Media);
}
