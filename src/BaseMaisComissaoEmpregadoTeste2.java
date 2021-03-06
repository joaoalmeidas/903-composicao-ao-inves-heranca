
public class BaseMaisComissaoEmpregadoTeste2 {

	public static void main(String[] args) {
		
		BaseMaisComissaoEmpregado2 empregado = new BaseMaisComissaoEmpregado2("Jo�o", "Guilherme", "22542189641", 10000, .06, 300);
		
		System.out.println("Dados do empregado obtidos atrav�s dos m�todos get().");
		
		System.out.printf("%n%s %s%n", "O nome �", empregado.getComissao().getNome());
		
		System.out.printf("%n%s %s%n", "O sobrenome �", empregado.getComissao().getSobrenome());
		
		System.out.printf("%n%s %s%n", "O CPF �", empregado.getComissao().getNumeroSeguroSocial());

		System.out.printf("%s %.2f%n", "O total de vendas �", empregado.getComissao().getVendasBrutas());
		
		System.out.printf("%s %.2f%n", "A taxa de comiss�o �", empregado.getComissao().getTaxaDeComissao());
		
		System.out.printf("%s %.2f%n", "O sal�rio base �", empregado.getSalarioBase());
		
		empregado.setSalarioBase(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Informa��es atualizadas obtidas atrav�s do toString()", empregado.toString());

	}

}
