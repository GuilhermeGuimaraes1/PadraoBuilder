package padraoprojetobuilder;

public class ViolaoJumboBuilder extends ViolaoBuilder {

    @Override
    public void buildPreco() {
        violao.preco = 500.88;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Preto. ";
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
        violao.modelo = "Jumbo. ";
    }
}
