package Entregar;


import java.util.Scanner;

public class cines {
    public static void main(String[] args) {
        int arrayint[][];
        char arraycharacters[][];
        int filas,asientos;
        arrayint=creartablaINT();
        arraycharacters=crearTablaCharacteres(arrayint);
        muestraLasSalas(arraycharacters);
        filas=pideLasFilas();
        asientos=pideLosAsientos();
        if(comprobadorDEAsientos(filas,asientos,arraycharacters))
        {
            asignadoDeasientos(filas,asientos,arraycharacters);
        }
        else {
            System.out.printf("Ese asiento esta ocupado, no es posible elegirlo.\n ");
        }
        muestraLasSalas(arraycharacters);
    }
    public static int pideLasFilas()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Elige Fila: ");
        int n=sc.nextInt();
        return n;
    }
    public static int pideLosAsientos()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Elige Asiento: ");
        int n=sc.nextInt();
        return n;
    }
    public static char[][] crearTablaCharacteres(int array[][])
    {
        char arraychararacter[][]=new char[4][4];
        for (int i = 0; i <4 ; i++) {//un for para asignar ocupado o libre de acuerdo al valor de cada posicion
            for (int j = 0; j <4 ; j++) {
                if (array[i][j]==1) {arraychararacter[i][j]='X';}
                else {arraychararacter[i][j]='L';}
            }
        }

        return arraychararacter;
    }

    public static int[][] creartablaINT()
    {
        int array[][]=new int[4][4];
        for (int i = 0; i <4 ; i++) {//un for para rellenarlos con numeros entre 1 y 2
            for (int j = 0; j <4 ; j++) {array[i][j]= (int)(Math. random()*2+1);}
        }

        return array;
    }
    public static void muestraLasSalas(char arraycharacter[][] )
    {
        System.out.printf("Asientos disponibles \n");
        System.out.printf("===========================================\n");
        System.out.printf("Libre: L   Ocupado:  X  \n");
        for (int i = 0; i <4 ; i++) {
            System.out.printf("Fila "+i+" :");
            for (int j = 0; j < 4; j++) {
                System.out.printf("  "+arraycharacter[i][j]);

            }
            System.out.printf("\n");
        }
    }
    public static void asignadoDeasientos(int fila,int asiento,char arraycharacter[][])
    {
        arraycharacter[fila][asiento]='X';
    }
    public static boolean comprobadorDEAsientos(int fila,int asiento,char arraycharacter[][])
    {
        boolean posible=false;
        if(arraycharacter[fila][asiento]=='L')
        {
            posible=true;
        }
        return posible;
    }


}


