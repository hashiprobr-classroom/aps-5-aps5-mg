package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data extends Referencia{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limites;

    public Data () {
        this.ano=1970;
        this.mes=1;
        this.dia=1;
        this.limites=new HashMap<>();

        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int a, int m, int d){
        if (a<1970){
            a=1970;
        }
        if (m<1){
            m=1;
        }
        else if (m>12){
            m=12;
        }
        if (d<1){
            d=1;
        }
        if (d>limites.get(m)){
            d=limites.get(m);

        }
        this.ano=a;
        this.mes=m;
        this.dia=d;
    }
    @Override
    public int comoInteiro(){
        int soma=0;
          soma+= (ano-1970)*365;
         for (int m=1; m<this.mes; m++){
             soma+=limites.get(m);
         }
         soma+=dia;

        return soma;
    }
}
