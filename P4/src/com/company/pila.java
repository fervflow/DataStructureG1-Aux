package com.company;

public class pila {
    private int arr[];
    private int top;

    public pila(){
        this.arr = new int[3];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public boolean isFull(){
        return (this.arr.length-1 == this.top);
    }

    public void push(int element){
        if(this.isFull()){
            int aux[] = new int[this.arr.length+2];
            for (int i=0; i<this.arr.length; i++)
                aux[i] = this.arr[i];
            this.arr = aux;
        }
        this.arr[++top] = element;
    }

    public int peek(){
        return arr[top];
    }

    public int pop(){
        int temp = -1;
        if(!this.isEmpty()){
            temp = arr[top];
            arr[top--] = -1;
        }
        return temp;
    }
}

