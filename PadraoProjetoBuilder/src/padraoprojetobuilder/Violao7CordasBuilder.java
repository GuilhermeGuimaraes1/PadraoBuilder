
package padraoprojetobuilder;

public class Violao7CordasBuilder extends ViolaoBuilder {
       @Override
    public void buildPreco() {
        violao.preco = 600.00;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Cinza. ";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipoCorda = "Aço. ";
    }

    @Override
    public void buildTipoTarraxa() {
        violao.tipoTarraxa = "12 cm x 4.0 cm. ";
    }

    @Override
    public void buildTipoMaterialCorpo() {
        violao.tipoMaterial = "carbono. ";
    }

    @Override
    public void buildModelo() {
        violao.modelo = "Violao 7 Cordas. ";
    }
}
