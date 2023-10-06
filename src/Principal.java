import aplicacao.Pessoa;

public class Principal {


    public static void main(String[] args){

    Pessoa pessoa = new Pessoa(15 , "Joao" );
    System.out.println("O nome da pessoa é " + pessoa.getNome());
    System.out.println("A idade da pessoa é "+ pessoa.getIdade());

pessoa.setNome("Nicão");
pessoa.setNome("18");

System.out.println("------------------------------------------------");


System.out.println("O nome da pessoa é   " + pessoa.getNome());
System.out.println("A idade da pessoa é " + pessoa.getIdade());

    }
}
