package trabalhoFacil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Programa extends Pokemons {

	 Scanner scan = new Scanner(System.in);
	    List<Pokemons> pokedex = new ArrayList<>();
	    List<PokemonsLendarios> pokedexLendario = new ArrayList<>();
	    Pokemons p = new Pokemons();
	    PokemonsLendarios p2 = new PokemonsLendarios();

	    public void mostraPokemons() {
	        // Ordena a lista de pokémons em ordem alfabética pelo nome
	        Collections.sort(pokedex, new Comparator<Pokemons>() {
	            @Override
	            public int compare(Pokemons p1, Pokemons p2) {
	                return p1.getNome().compareToIgnoreCase(p2.getNome());
	            }
	        });

	        System.out.println("Pokémons Normais:");
	        for (Pokemons pokemon : pokedex) {
	            System.out.println("Nome: " + pokemon.getNome());
	            System.out.println("Tipo 1: " + pokemon.getTipo1());
	            System.out.println("Tipo 2: " + pokemon.getTipo2());
	            System.out.println("----------------------");
	        }

	        System.out.println("Pokémons Lendários:");
	        for (PokemonsLendarios lendario : pokedexLendario) {
	            System.out.println("Nome: " + lendario.getNome());
	            System.out.println("Tipo1 :" + lendario.tipo1);
	            System.out.println("Tipo2 : " + lendario.tipo2);
	            System.out.println("----------------------");
	        }
	    }

	    public void adicionarPokemonNormal(String nome, double peso, double altura, String tipo1, String tipo2) {
	        pokedex.add(new Pokemons(nome,peso,altura,tipo1,tipo2));
	    }

	    public void adicionarPokemonLendario(String nome, double peso, double altura, String tipo1, String tipo2,String definStr,String regiao) {
	    	
	        pokedexLendario.add(new PokemonsLendarios(nome,peso,altura,tipo1,tipo2,definStr,regiao));
	    }

	    public void adicionarOs7() {
	        Pokemons p1 = new Pokemons("Chamader", 0.50, 0.32, "Fogo", null);
	        Pokemons p2 = new Pokemons("Charmelon", 1.00, 1.10, "Fogo", null);
	        Pokemons p3 = new Pokemons("Charizard", 5.00, 5.00, "Fogo", "Voador");
	        Pokemons p4 = new Pokemons("Pikachu", 0.30, 0.30, "Elétrico", null);
	        Pokemons p5 = new Pokemons("Caterpie", 0.05, 0.10, "Inseto", null);
	        Pokemons p6 = new Pokemons("Metapod", 0.15, 0.30, "Inseto", null);
	        Pokemons p7 = new Pokemons("Butterfree", 0.50, 0.80, "Inseto", "Voador");
	        pokedex.add(p1);
	        pokedex.add(p2);
	        pokedex.add(p3);
	        pokedex.add(p4);
	        pokedex.add(p5);
	        pokedex.add(p6);
	        pokedex.add(p7);
	        
	        PokemonsLendarios p8 = new PokemonsLendarios("Articuno", 10,5.00,"voador","Gelo","Passaro Lendario","Kanto");
	        pokedexLendario.add(p8);
	    }


	    public void menu() {
	    	int opcao = 0;
	        do {
	            System.out.println("----- MENU -----");
	            System.out.println("1. Mostrar Pokémons");
	            System.out.println("2. Modificar Pokémon (Procure por nome)");
	            System.out.println("3. Adicionar Pokémon");
	            System.out.println("4. Remover Pokémon Lendário");
	            System.out.println("5. Modificar Nome do Pokémon Lendário (Procure por nome)");
	            System.out.println("6. Remover Pokémon Normal");
	            System.out.println("7. Buscar Pokémon Normal por nome");
	            System.out.println("8. Buscar Pokémon Lendário por nome");
	            System.out.println("9. Adicionar Pokemon Lendario");
	            System.out.println("10. Sair");
	            System.out.println("----------------");
	            try {
	            String digito = scan.next();
	            int parsaNumero = Integer.parseInt(digito);
	            
	           
	          
	            
	            if(parsaNumero == 1|| parsaNumero == 2 || parsaNumero == 3 || parsaNumero == 4 || parsaNumero == 5 || parsaNumero == 6 ||parsaNumero == 7 ||parsaNumero == 8 ||parsaNumero == 9 ||parsaNumero == 10 ) {
	            switch (parsaNumero) {
	                case 1:
	                    mostraPokemons();
	                    break;
	                case 2:
	                    alterarNomePokemon();
	                    break;
	                case 3:
	                    System.out.println("Digite o Nome do Pokémon");
	                    String nome = scan.next();
	                    System.out.println("Digite a Altura do Pokémon");
	                    String altura = scan.next();
	                    String altura1 = altura.replace(",", ".");
	                    double d = Double.valueOf(altura1);
	                    System.out.println("Digite o Peso do Pokémon");
	                    String peso = scan.next();
	                    String peso1 = peso.replace(",", ".");
	                    double d2 = Double.valueOf(peso1);
	                    System.out.println("Digite o Tipo do Pokémon");
	                    String tipo = scan.next();
	                    System.out.println("Digite o Tipo 2 do Pokémon");
	                    String tipo2 = scan.next();
	                    adicionarPokemonNormal(nome, d, d2, tipo, tipo2);
	                    break;
	                case 4:
	                    System.out.println("Digite o nome do Pokémon lendário a ser removido:");
	                    String nomePokemonLendario = scan.next().toLowerCase().trim();
	                    removerPorNome(nomePokemonLendario, pokedexLendario);
	                    break;
	                case 5:
	                    alterarNomePokemonLendario();
	                    break;
	                case 6:
	                    System.out.println("Digite o Nome do Pokémon normal para remover:");
	                    String nomeNormalP = scan.next().toLowerCase().trim();
	                    removerPorNome2(nomeNormalP, pokedex);
	                    break;
	                case 7:
	                   System.out.println("Digite o Nome Que Deseja Busca ");
	                   String nome34 = scan.next();
	                   BuscaPorNomePokemonNormal(nome34, pokedex);
	                   break;
	                case 8:
	                	System.out.println("Digite o nome do pokemon lendario que deseja busca : ");
	                	String nome1 = scan.next();
	                    BuscaPorNomePokemonLendario(nome1, pokedexLendario);
	                    break;
	                case 9:
	                    System.out.println("Digite o Nome que quer adicionar : ");
	                    scan.nextLine();
	                    String nome3 = scan.nextLine();
	                    
	                    System.out.println("Digite o Peso do Pokemon que você quer adicionar : ");
	                    String d4 = scan.next();
	                    String d5 = d4.replace(",", ".");
	                    double d6 = Double.valueOf(d5);
	                    System.out.println("Digite a Altura do Pokemon que você quer adicionar : ");
	                    String d7 = scan.next();
	                    String d8 = d4.replace(",", ".");
	                    double d9 = Double.valueOf(d5);
	                    System.out.println("Digite o Tipo1 do pokemon ");
	                    String tipo8 = scan.next();
	                    System.out.println("Digite o tipo2 do pokemon ");
	                    String tipo9 = scan.next();
	                    System.out.println("Digite a definicao do pokemon ");
	                    scan.nextLine();
	                    String defini = scan.nextLine();
	                    System.out.println("Digite a regiao ");
	                    String regiao = scan.nextLine();
	                    
	                    adicionarPokemonLendario(nome3, d6, d9, tipo8, tipo9, defini, regiao);
	                    break;
	                case 10:
	                    opcao = 14;
	                    break;
	                default:
	                    System.out.println("Opção Inválida");}
	            }else{
	            System.out.println("Opcao Invalida");
	            }}catch (Exception e) {
					e.getMessage();
					
				}
	    
	        } while (opcao != 14);
	        }
	    public void alterarNomePokemon() {
	        System.out.println("Digite o Nome do Pokemon que busca -> ");
	        String nomeAntigo = scan.next();
	        String nomeAntigo1 = nomeAntigo.toLowerCase().trim();
	        
	        for (Pokemons pokemon1 : pokedex) {
	            String pokemonString = pokemon1.getNome().toLowerCase().trim();
	            if (pokemonString.equals(nomeAntigo1)) {
	                System.out.println("Nome Novo Do Pokemon -> ");
	                String novoNome = scan.next();
	                
	                if (!novoNome.isEmpty()) {
	                    pokemon1.setNome(novoNome);
	                    System.out.println("Nome alterado com sucesso!");
	                }
	                
	                return; // Encerra o método após encontrar o Pokémon
	            }
	        }

	        System.out.println("Pokémon não encontrado.");
	    }
	    
	 
	    
	    public void alterarNomePokemonLendario() {
	        System.out.println("Digite o Nome do Pokemon lendário que busca -> ");
	        String nomeAntigo = scan.next();
	        String nomeAntigo1 = nomeAntigo.toLowerCase().trim();

	        for (PokemonsLendarios lendario : pokedexLendario) {
	            String lendarioString = lendario.getNome();
	            if (lendarioString != null && lendarioString.toLowerCase().trim().equals(nomeAntigo1)) {
	                System.out.println("Nome Novo Do Pokemon -> ");
	                String novoNome = scan.next();
	                
	                if (!novoNome.isEmpty()) {
	                    lendario.setNome(novoNome);
	                    System.out.println("Nome alterado com sucesso!");
	                }
	                
	                return; // Encerra o método após encontrar o Pokémon lendário
	            }
	        }

	        System.out.println("Pokémon lendário não encontrado.");
	    }
	       

	    public void removerPorNome(String nome, List<PokemonsLendarios> lista1) {
	        
	        String nomeFormatado = nome.trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	        Iterator<PokemonsLendarios> iterator = lista1.iterator();
	        while (iterator.hasNext()) {
	            PokemonsLendarios pokemonLendario = iterator.next();
	            String nomePokemonLendario = pokemonLendario.getNome().trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	            if (nomePokemonLendario.equals(nomeFormatado)) {
	            	System.out.println("Nome -> " + pokemonLendario.getNome());
	            	System.out.println("Definicao -> " + pokemonLendario.getDefinicao());
	            	System.out.println("Regiao -> " + pokemonLendario.getRegiao());
	            	System.out.println("Tipo1 -> " + pokemonLendario.getTipo1());
	            	System.out.println("Tipo2 -> " + pokemonLendario.getTipo2());
	            	System.out.println("Altura -> " + pokemonLendario.getAltura());
	            	System.out.println("Peso -> " + pokemonLendario.getPeso());
	            	System.out.println("Deseja apaga Esse Pokemon ? (S(sim)/N(Nao))");
	            	String resp = scan.next().toLowerCase();
	            	if(resp.equals("s")) {
	                iterator.remove();
	                break;  // Opcional: para interromper o loop após encontrar o primeiro elemento com o nome
	            	}else {
	            		break;
	            	}
	            }
	        }
	    }
	    public void removerPorNome2(String nome, List<Pokemons> lista) {
	        String nomeFormatado = nome.trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	        Iterator<Pokemons> iterator = lista.iterator();
	        while (iterator.hasNext()) {
	            Pokemons pokemon = iterator.next();
	            String nomePokemon = pokemon.getNome().trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	            if (nomePokemon.equals(nomeFormatado)) {
	            	System.out.println("Nome -> " + pokemon.getNome());
	            	System.out.println("Tipo1 -> " + pokemon.getTipo1());
	            	System.out.println("Tipo2 -> " + pokemon.getTipo2());
	            	System.out.println("Altura -> " + pokemon.getAltura());
	            	System.out.println("Peso -> " + pokemon.getPeso());
	            	System.out.println("Deseja apaga Esse Pokemon ? (S(sim)/N(Nao))");
	            	String resp = scan.next().toLowerCase();
	            	if(resp.equals("s")) {
	                iterator.remove();
	                break; 
	                }else {
	                	break;
	                }// Opcional: para interromper o loop após encontrar o primeiro elemento com o nome
	            }
	        }
	    }
	    
	    public void BuscaPorNomePokemonNormal(String nome, List<Pokemons> lista) {
	        String nomeFormatado = nome.trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	        Iterator<Pokemons> iterator = lista.iterator();
	        while (iterator.hasNext()) {
	            Pokemons pokemon = iterator.next();
	            String nomePokemon = pokemon.getNome().trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	            if (nomePokemon.equals(nomeFormatado)) {
	            	System.out.println("Nome -> " + pokemon.getNome());
	            	System.out.println("Tipo1 -> " + pokemon.getTipo1());
	            	System.out.println("Tipo2 -> " + pokemon.getTipo2());
	            	System.out.println("Altura -> " + pokemon.getAltura());
	            	System.out.println("Peso -> " + pokemon.getPeso());
	                	break;
	                }// Opcional: para interromper o loop após encontrar o primeiro elemento com o nome
	            }
	        }
	    public void BuscaPorNomePokemonLendario(String nome, List<PokemonsLendarios> lista) {
	        String nomeFormatado = nome.trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	        Iterator<PokemonsLendarios> iterator = lista.iterator();
	        while (iterator.hasNext()) {
	            PokemonsLendarios pokemon = iterator.next();
	            String nomePokemon = pokemon.getNome().trim().toLowerCase(); // Remove espaços e converte para letras minúsculas
	            if (nomePokemon.equals(nomeFormatado)) {
	            	System.out.println("Nome -> " + pokemon.getNome());
	            	System.out.println("Tipo1 -> " + pokemon.getTipo1());
	            	System.out.println("Tipo2 -> " + pokemon.getTipo2());
	            	System.out.println("Altura -> " + pokemon.getAltura());
	            	System.out.println("Peso -> " + pokemon.getPeso());
	            	System.out.println("Definicao ->" + pokemon.getDefinicao());
	            	System.out.println("Regiao ->" + pokemon.getRegiao());
	                	break;
	                }// Opcional: para interromper o loop após encontrar o primeiro elemento com o nome
	            }
	        }
	    }


