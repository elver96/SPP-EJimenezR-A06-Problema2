/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.a06.p2;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num=solicitaNumero();
        calcularFactorial(num);
    }
    public static int solicitaNumero(){
        int num, opEntrada;
        Scanner kb= new Scanner(System.in);
        System.out.println("Introduce un numero para calcular Factorial");
        num=kb.nextInt();
        if(num<1 || num>10){
            System.out.println("Ese número se encuentra fuera de rango!!");
            solicitaNumero();
        }else{
            
        }
        return num;
    } 
    public static void calcularFactorial(int num){
        int fact, cont;
        cont=1;
        fact=1;
        do{
            cont++;
            fact=fact*cont;
        }while(cont<num);
        System.out.println("El factorial del número es "+fact);
    }
}
