 void main()
{
    float fahrenheit = Float.parseFloat (IO.readln("Digite a temperatura em graus fahrenheit: "));
    float celsius = (fahrenheit-32) * 5/9;
    IO.println (fahrenheit + "oF equivalem a: " + celsius + "oC" );
}  
