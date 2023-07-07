package modelo1paraMuitos;

import infra.Dao;
import padrao.Produto;

public class novoPedido {
	
	public static void main(String[] args) {
	    Dao<Object> daoProduto = new Dao<>();


	    Produto produto = new Produto("Geladeira", 2977.99);
	    Pedido pedido = new Pedido();
	    itemPedido item = new itemPedido(pedido, produto, 10);
	    
	        daoProduto.abrirT().incluir(produto).incluir(item).incluir(pedido).fecharT().fechar();
	}


}
