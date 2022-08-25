import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            Scanner in = new Scanner(System.in);

            Hashtable<String, Integer> contatos =
                    new Hashtable<String, Integer>();

            System.out.print("Insira um nome para o contato: ");
            String nomeContato = in.next();
            System.out.print("Entre com o numero de contato: ");
            int numero = in.nextInt();

            Integer numeroContato = Integer.valueOf(numero);

            contatos.put(nomeContato, numeroContato);
            System.out.println("\n" + "Contato | Numero");

            for (Map.Entry<String, Integer> agenda
                    : contatos.entrySet()) {

                System.out.println(agenda.getKey() + " | " + agenda.getValue());
                System.out.println("Parabéns cadastro realizado!!!");
            }

            System.out.print("Informe o nome do contato para a busca: ");
            String buscarContato = in.next();

            if (contatos.containsKey(buscarContato)) {
                System.out.println(contatos.get(buscarContato));
            } else {
                System.err.println("Contato não existe");
            }
        }
    }

