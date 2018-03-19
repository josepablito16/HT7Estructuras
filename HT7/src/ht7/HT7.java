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
import static javafx.scene.input.KeyCode.K;
import java.util.Map;
import static javafx.scene.input.KeyCode.K;

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
 
        
        Association j=new Association("Hola","Hello");
        Node n=new Node (j);
        
        Association k=new Association("Ala","Ala");
        Node p=new Node (k);
        
    bt.add(n);
    bt.add(p);
    bt.add(n);
    
        System.out.println(bt.containsNode(n));
        
        
        bt.traverseInOrder(bt.root);
         
    
        
        
        
        
        
    }
    
}
