/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jose
 */
public class HT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String linea, ingles,espanol;
        
        //File archivo = new File ("./cards_desc.txt");
        File archivo = new File ("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT7\\HT7Estructuras\\diccionario.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        
        while( (linea=br.readLine())!=null)
        {
            ingles=linea.substring(0,linea.indexOf(","));
            espanol=linea.substring(linea.indexOf(",")+1,linea.length());
                    
            System.out.println(ingles+espanol);
                    
        }
        
        BinaryTree bt = new BinaryTree();
 
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
 
        System.out.println(bt.containsNode(6));
        
        
        bt.traverseInOrder(bt.root);
         
    
        
        
        
        
        
    }
    
}
