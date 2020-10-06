package com.company.EJ1;
import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        int a=1;
        int valores =11;
        int lanzamientos=0;
        int [] Array = new int[valores];
        while (a != 0) {
            a++;
            System.out.println("--------------------");
            System.out.println("|     1.DADOS       |");
            System.out.println("|     2.PARCHIS     |");
            System.out.println("|     3.TIC TAC TOE |");
            System.out.println("|     4.QUIT        |");
            System.out.println("--------------------");
            int respuesta = scanner.nextInt();
            if (respuesta == 1) {
                    while (a != 0){
                        int D1 = (int) Math.floor(Math.random()*6+1);
                        int D2 = (int) Math.floor(Math.random()*6+1);
                        int suma = D1+D2;
                        lanzamientos++;
                        System.out.println("Empieza el juego tiramos el 1 dado ");
                        System.out.println("El primer dado a salido "+ D1 );
                        System.out.println("Empieza el juego tiramos el 2 dado ");
                        System.out.println("El segundo dado a salido "+ D2 );
                        System.out.println("El resultado es " + suma);
                        Array[suma-2]=Array[suma-2]+1;
                        System.out.println("Quieres jugar otra vez?");
                        System.out.println("1 -SI 2-NO");
                        int respuesta2 = scanner.nextInt();
                    if (respuesta2 == 1){
                        System.out.println("Volvemos a jugar");

                    }
                    else if (respuesta2 == 2){
                        break;
                    }
                    else {
                        break;
                    }
                    }

                }

            else if (respuesta == 2){
                System.out.println("estas jugando a parchis");
            }
            else if (respuesta == 3){
                System.out.println("estas jugando a tic tac toe");
            }
            else if (respuesta == 4) {
                break;
            }


        }
        System.out.println("Del numero 2 han salido "+ Array[0]);
        System.out.println("Del numero 3 han salido "+ Array[1]);
        System.out.println("Del numero 4 han salido "+ Array[2]);
        System.out.println("Del numero 5 han salido "+ Array[3]);
        System.out.println("Del numero 6 han salido "+ Array[4]);
        System.out.println("Del numero 7 han salido "+ Array[5]);
        System.out.println("Del numero 8 han salido "+ Array[6]);
        System.out.println("Del numero 9 han salido "+ Array[7]);
        System.out.println("Del numero 10 han salido "+ Array[8]);
        System.out.println("Del numero 11 han salido "+ Array[9]);
        System.out.println("Del numero 12 han salido "+ Array[10]);
    }
}