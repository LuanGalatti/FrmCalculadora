package model;
public class Calculadora {
private double numero1;
private double numero2;
private String operacao;
public Calculadora(){
    this(0,0,"");
}
    public Calculadora(double numero1, double numero2, String operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
public double getCalcular(){  
   double calculo=0;
    switch(getOperacao()){
        case "Adicao":
           calculo=numero1+numero2;
        break;
        case "Subtracao":
            calculo=(numero1-numero2);
        break;
        case "Multiplicacao":
            calculo=(numero1*numero2);
        break;
        case "Divisao":
            calculo=(numero1/numero2);
    break;
    }
return(calculo);
}
}
