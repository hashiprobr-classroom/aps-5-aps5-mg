package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia{
    private int hora;
    private int minuto;

    public Tempo (){
        this.hora=0;
        this.minuto=0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void atualiza (int h, int m){
        if (h<0){
            h=0;
        }
        else if (h>23){
            h=23;
        }
        if (m<0){
            m=0;
        }
        else if (m>59){
            m=59;
        }

        this.hora=h;
        this.minuto=m;
    }

    @Override
    public int comoInteiro(){
        int soma=0;
        soma+=hora*60;
        soma+=minuto;
        return soma;
    }
}
