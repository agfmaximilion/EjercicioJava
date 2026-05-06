import java.util.Scanner;
public class T1P1E1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);//declaro el teclado
        int numJ;//declaro la variable, numero del jugador
        
        /*pido un valor y no dejo de repetirlo hasta que me aseguro de que 
            está entre los valores que quiero*/
        do{
            System.out.print("Introduzca un numero entre 15 y 27: ");
            numJ=teclado.nextInt();
            if((numJ<15)||(numJ>27)){//si no es valido, muestro mensaje de error
                System.out.println("ERROR. El numero introducido no esta en el "
                        + "rango indicado.");
            }
        }while((numJ<15)||(numJ>27));
        teclado.close();
        
        //la maquina saca un numero
        int numM=(int)(Math.random()*(50-5+1)+5);
        System.out.println("La maquina ha sacado un "+numM);
        
        //comparamos los numeros y mostramos resultados
        if(numM>numJ){//si el num de la maquina es mayor
            System.out.println("La maquina gana!!!");
        }else if(numM<numJ){//si el num de la maquina es menor
            System.out.println("Tu ganas!!!");
        }else{//el resto de casos, en este caso solo puede ser empate
            System.out.println("Sacasteis el mismo numero, es un empate.");
        }
        

    }

}
