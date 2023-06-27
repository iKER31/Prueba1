package practica;

import javax.swing.JOptionPane;

public class Practica {

    public static void ingresaValores(int[][] matriz) {
    int m=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la matriz"));
    for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor para la posición i,j"));
                }//cierra el segundo for
    }//cierra for
    }//cierra metodo
    
    public void imprimeMatriz(int[][] matriz) {
    int m = matriz.length;
    for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }//cierra for
    }//cierra for
}//cierra metodo
    
    
    public static void ingresaPais(String[][] matr, int m, int n) {
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = JOptionPane.showInputDialog("Digite el nombre del pais");
            }//cierra for
        }//cierra for
    }//cierra metodo

    public static int sumaMatriz(int[][] matri, int x) {
    int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sum += matri[i][j];
            }//cierra for
        }//cierra for
    return sum;
    }//cierra metodo

  
    public static int sumaColumna(int[][] mat, int columna) {
    int sum = 0;
        for (int i = 0; i < mat.length; i++) {
        sum = mat[i][columna];
        }//cierra for
        return sum;
    }//cierra metodo
    
    public static int sumaFila(int[][] matr) {
    int sum = 0;
    int fila= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas"));
        for (int j = 0; j < matr[0].length; j++) {
            sum = matr[fila][j];
        }//cierra for
    return sum;
    }//cierra metodo
  
    public static int[] sumaColumna2(int[][] matriz) {
    int[] sum = new int[matriz[0].length];
    for (int j = 0; j < matriz[0].length; j++) {
        for (int i = 0; i < matriz.length; i++) {
            sum[j] += matriz[i][j];
        }//cierra for
    }//cierra for
    return sum;
    }//cierra metodo
   
    
  public static void sumaImprimeColumna(int[][] mat) {
    int[] sum = sumaColumna2(mat);
    for (int j = 0; j < sum.length; j++) {
        System.out.println("La suma de la columna " + j + " es: " + sum[j]);
    }//cierra for
}//cierra metodo
  
  public void menu(){
        byte opc;
        char seguir = 's';
        int[][] matrizvalores = new int[2][2];
        String [][] pais = new String[2][2];
        int m=2;
        int n=2;
        int x=2;
        int[][] matrizSuma = new int[2][2];
        int y=2;
        int[][] matricolum = new int[2][2];
        int[][] matrizFila = new int[2][2];
        int[][] matricolumna2 = new int[2][2];
        int[][] mat = new int[2][2];
        while (seguir == 's' || seguir == 'S' ){
            opc = Byte.parseByte(JOptionPane.showInputDialog("Seleccione la opcion deseada\n1. Ingrese e Imprime los valores\n2. Ingresar pais\n3. Suma Matriz\n4. Suma columna\n5.Suma fila\n6. Suma columna2\n7. Suma e imprime columna")); 
            switch(opc){
                case 1: 
                ingresaValores(matrizvalores);
                imprimeMatriz(matrizvalores);
                break;
                case 2: ingresaPais(pais, m, n);
                break;
                case 3: sumaMatriz(matrizSuma, x);
                break;
                case 4: sumaColumna(matricolum, y);
                break;
                case 5: sumaFila(matrizFila);
                break;
                case 6: sumaColumna2(matricolumna2);
                break;
                case 7:sumaImprimeColumna(mat);
                break;
                default: System.out.println("Saliendo del programa");

               
              
            }
            seguir= (JOptionPane.showInputDialog("Desea seguir? \n S= si \n N= No").charAt(0));
        }
        }
    
  

    
    public static void main(String[] args) {
        Practica obj = new Practica();
        
        obj.menu();
    }
    
}
