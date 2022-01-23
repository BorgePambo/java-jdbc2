package javaapp02;

import java.util.List;


public class ProdutoServico {
    
   
    public static Double filtrarProduto(List<Produto> list){
        
        double soma = 0.0;
        for(Produto item: list){
            if(item.getPreco() >= 100.0 ){
                soma = soma + item.getPreco();
            }
        }
        
        return soma;
    }
    
    
}
