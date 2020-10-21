package com.company;

public class cola {

    private pila p1, p2;

    public cola(){
        p1 = new pila();
        p2 = new pila();
    }

    public void indroducirDatos(int dato){
        while (!this.p1.isEmpty()) {
            p2.push(p1.pop());
        }
        p1.push(dato);
        while (!p2.isEmpty()) {
            p1.push(p2.pop());
        }
    }

    public boolean vacio(){
        return (p1.isEmpty());
    }

    public int sacarDato(){
        int temp = -1;
        if (this.vacio())
            System.out.println("Cola vacia");
        else
            temp = p1.pop();
        return temp;
    }

//    public int primero (){
//
//    }

}


































