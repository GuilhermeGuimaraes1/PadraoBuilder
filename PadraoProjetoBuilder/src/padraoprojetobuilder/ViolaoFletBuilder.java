package padraoprojetobuilder;

public class ViolaoFletBuilder extends ViolaoBuilder {

    @Override
    public void buildPreco() {
        violao.preco = 300.80;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Branca. ";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipoCorda = "Nylon. ";
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
        violao.modelo = "Flet. ";
    }
}
