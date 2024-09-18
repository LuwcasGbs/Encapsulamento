package Aula18_09.exercicios;

public class ObjetoEndereco {

	public static void main(String[] args) {
		Endereco e1 = new Endereco();
		
		e1.setId(1);
		e1.setLogradouro("sla");
		e1.setNumero(12);
		e1.setComplemento("nenhum");
		e1.setBairro("N sei");
		e1.setCidade("Itapetininga");
		e1.setCep("12209-460");
		e1.setUf("??");

		System.out.println("----------");
		System.out.println(e1.getId());
		System.out.println(e1.getLogradouro());
		System.out.println(e1.getNumero());
		System.out.println(e1.getComplemento());
		System.out.println(e1.getBairro());
		System.out.println(e1.getCidade());
		System.out.println(e1.getCep());
		System.out.println(e1.getUf());
		
		Endereco e2 = new Endereco(1,"idk",13,"nenhum tmb","n sei","Itapetininga","12209-460","ainda n sei oq é");
		
		System.out.println("----------");
		System.out.println(e2.getId());
		System.out.println(e2.getLogradouro());
		System.out.println(e2.getNumero());
		System.out.println(e2.getComplemento());
		System.out.println(e2.getBairro());
		System.out.println(e2.getCidade());
		System.out.println(e2.getCep());
		System.out.println(e2.getUf());
	}

}
