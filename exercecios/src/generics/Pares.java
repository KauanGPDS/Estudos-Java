package generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Pares<C extends Number,V> {

	private final Set<par<C,V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		
		if(chave == null) return;
		
		par<C,V> novoPar = new par<C,V>(chave,valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		itens.add(novoPar);
}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<par<C,V>> parOpicional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		return parOpicional.isPresent() ? parOpicional.get().getValor() : null;
	}
}
