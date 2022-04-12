import br.inatel.c206.teoria.brownie.Brownie;
import br.inatel.c206.teoria.brownie.cafe.BrownieCafe;
import br.inatel.c206.teoria.brownie.doce_de_leite.BrownieDoceDeLeite;
import br.inatel.c206.teoria.brownie.nutella.BrownieNutella;

public class Main {

    public static void main(String[] args) {

        Brownie brownieNutella = new BrownieNutella("The Perfecto", 20, "Nutella");
        Brownie brownieDoceDeLeite = new BrownieDoceDeLeite("The Good one", 12, "Doce de Leite");
        Brownie brownieCafe = new BrownieCafe("OK...", 20, "Cafe");

        brownieCafe.addCarrinhoDeCompras();
        brownieNutella.addCarrinhoDeCompras();
        brownieDoceDeLeite.addCarrinhoDeCompras();

    }
}
