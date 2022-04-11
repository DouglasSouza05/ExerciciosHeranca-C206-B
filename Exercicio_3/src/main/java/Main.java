import br.inatel.c206.teoria.brownie.Brownie;
import br.inatel.c206.teoria.brownie.cafe.BrownieCafe;
import br.inatel.c206.teoria.brownie.doce_de_leite.BrownieDoceDeLeite;
import br.inatel.c206.teoria.brownie.nutella.BrownieNutella;
import br.inatel.c206.teoria.comprador.Comprador;

public class Main {

    public static void main(String[] args) {

        Comprador comprador = new Comprador("Zézin, the EATER", 200);

        Brownie brownieNutella = new BrownieNutella("The Perfecto", 20, "Nutella");
        Brownie brownieDoceDeLeite = new BrownieDoceDeLeite("The Good one", 12, "Doce de Leite");
        Brownie brownieCafe = new BrownieCafe("OK...", 20, "Cafe");

        comprador.efetuarCompra(brownieNutella);

    }
}
