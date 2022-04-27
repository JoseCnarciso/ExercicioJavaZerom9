import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class TestaConta {
    public static void main( String[] args ) {

        Cliente cl1 = new Cliente("c1",true,"1987",5);
        Cliente cl2 = new Cliente("c2",true,"1937887",15);
        Cliente cl3 = new Cliente("c3",true,"1982457",2);
        Cliente cl4 = new Cliente("c4",true,"197685787",9);
        Cliente cl5 = new Cliente("c5",true,"193737717",14);
        Cliente cl6 = new Cliente("c6",true,"19378245247",3);
        Cliente cl7 = new Cliente("c7",true,"196387387",4);
        Cliente cl8 = new Cliente("c8",true,"198245247",5);
        Cliente cl9 = new Cliente("c9",true,"19323787",5);
        Cliente cl10 = new Cliente("c10",true,"1937687",25);
        Cliente cl11 = new Cliente("c11",true,"192487",47);
        Cliente cl12 = new Cliente("c12",true,"19786787",1);
        Cliente cl13 = new Cliente("c13",true,"1937587",4);
        Cliente cl14 = new Cliente("c14",true,"1924856787",12);
        Cliente cl15 = new Cliente("c15",true,"1934537887",9    );

        cl1.autentica("1987");
        cl10.autentica("165465");
        cl15.autentica("1934537887");
        cl7.autentica("16516516515");
        cl11.autentica("192487");
        // Necessário criar uma listas com todos os objetos criados, para que possa usar a função lambda para dar os parâmetros do que vamos fazer.
        List<Cliente> clientes = Arrays.asList(cl1,cl2,cl3,cl4,cl5,cl6,cl7,cl8,cl9,cl10,cl11,cl12,cl13,cl14,cl15 );
        //função lambda " Objeto cl" é o parâmetro e o código seria o 'SOUT'(cl.getCompras), que será impresso na tela.
        clientes.forEach(cl -> System.out.println(cl.getCompras()));

        System.out.println("--------------------------------------------------------------------------");

        // chama uma interface funcional e cria se a lista da classe desejada, 
        Comparator<Cliente> comparatorMaior = Comparator.comparing(Cliente::getCompras);
        Stream<Cliente> maisCompras = clientes.stream().max(comparatorMaior).stream();
        System.out.println(maisCompras);
        System.out.println("--------------------------------------------------------------------------");

        Comparator<Cliente> comparatorMenor = Comparator.comparing(Cliente::getCompras);
        Stream<Cliente> menosCompras = clientes.stream().min(comparatorMenor).stream();
        System.out.println(menosCompras);
        System.out.println("--------------------------------------------------------------------------");

        System.out.println(clientes.stream().mapToDouble(Cliente::getCompras).average().getAsDouble());


    }
}
