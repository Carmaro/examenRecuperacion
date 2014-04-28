package Sudoku;


import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class sudoku {
    
    private char tablero[][];
    private ArrayList<String> listaTablero;
    private int tamCol;
    private int tamFil;
    public String cadena1;
    public static final char VACIO = '.';
    /**
     * 
     * @param tamCol Valor del tamaño de la columna
     * @param tamFil Valor del tamaño de la fila
     * 
     * 
     */
    public sudoku (int tamCol, int tamFil){
       this.tamCol = 9;
       this.tamFil =9;
       this.cadena1 = "78419623532158..97956327418297451386845963172613872954179645823432718569568239741";
       listaTablero = new ArrayList();
       tablero = new char[tamCol][tamFil];
       
       for (int f=0; f<tamFil; f++){
           for (int c=0; c<tamCol; c++){
              tablero [f][c]= VACIO;
           }
       }
    }
    
    
   /**
    * 
    * @return Retorna el contenido de la matriz como una cadena de caracteres. Ademas de poner saltos de lineas cada 3 caracteres. 
    */ 
    public String toString(){
        String retorno = "";
        for (int f=0; f<tamFil; f++){
            for(int c=0; c<tamCol; c++){
                retorno += tablero[f][c];
                for(int a=0; a< 3; a++){
                    for (int b=0; b<3; b++){
                        retorno += tablero[a][b];
                    }       
                }
            }
            retorno+= "\n";
        }
        return retorno;    
    }
/**
 * 
 * @return Retorna un caracter buscado por los parametros que el usuario introduzca. 
 */
    public char getValue(){ 
       char caracterBuscado = tablero[tamCol][tamFil];
       int pos = listaTablero.indexOf(caracterBuscado);
       return (char)pos;
    }
    /**
     * 
     * @return Retorna si la partida ha acabado o no mediante un boolean. 
     */
    public boolean isFinished(){
        
        for(int i=0; i<listaTablero.size(); i++){
            String contenido = listaTablero.get(i);
                if(contenido != String.valueOf(VACIO)){
                    return true;
                }else{
                    return false;
                }
        }
        return true;
        
    }



}

