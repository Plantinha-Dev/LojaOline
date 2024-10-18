public class LojaOnline {
public static void main(String[] args) {


                Produto produto1 = new Produto("Produto A", 100.0);
                Produto produto2 = new Produto("Produto B", 200.0);
                Produto produto3 = new Produto("Produto C", 150.0);

                CarrinhoDeCompras carrinho = new CarrinhoDeCompras();


                carrinho.adicionarProduto(produto1);
                carrinho.adicionarProduto(produto2);
                carrinho.adicionarProduto(produto3);

                carrinho.setDescontoStrategy(new DescontoClienteRegular());
                System.out.println("Total com desconto para cliente regular: " + carrinho.calcularTotal());

                carrinho.setDescontoStrategy(new DescontoClienteVip());
                System.out.println("Total com desconto para cliente VIP: " + carrinho.calcularTotal());

                carrinho.setDescontoStrategy(new DescontoClienteNovo());
                System.out.println("Total sem desconto para cliente novo: " + carrinho.calcularTotal());
            }
        }
