package Aula18_09.exercicios;

public class ObjetoItemTema {

	public static void main(String[] args) {
		Item_tema it1 = new Item_tema();
		
		it1.setId(1);
		it1.setNome("Lusca");
		it1.setEndereco("Rua Onde Judas Perdeu as Botas, Bairro Sla, nº008");
		
		System.out.println("----------------");
		System.out.println(it1.getId());
		System.out.println(it1.getNome());
		System.out.println(it1.getEndereco());
		
		Item_tema it2 = new Item_tema(2,"Lucas","Rua Onde Judas Perdeu as Botas, Bairro Sla, nº008");
		
		System.out.println("----------------");
		System.out.println(it2.getId());
		System.out.println(it2.getNome());
		System.out.println(it2.getEndereco());
		

	}

}
