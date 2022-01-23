package javaapp02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class JavaApp02 {

    
    public static void main(String[] args) {
        
        
        String path = "B:\\temp\\in.txt";      
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Produto> list = new LinkedList<>();
            String line = br.readLine();
            while(line != null){
                String [] field = line.split(",");
                String nome = field[0];
                Double preco = Double.parseDouble(field[1]);
                list.add(new Produto(nome, preco));
                
                line = br.readLine();
            }
            
            System.out.println("Produtos Filtrados: ");
            Double soma = ProdutoServico.filtrarProduto(list);
            System.out.println("Soma dos Produto: " + soma);
            
        }
        catch(IOException ex){
            System.err.println("Erro: " + ex.getMessage() );
        }
        
        
    }
    
}
