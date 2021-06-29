package padraoprojetobuilder;

public class ViolaoFolkBuilder extends ViolaoBuilder {

    @Override
    public void buildPreco() {
        violao.preco = 400.80;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Cinza. ";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipoCorda = "Nylon. ";
    }

    @Override
    public void buildTipoTarraxa() {
        violao.tipoTarraxa = "12 cm x 3.5 cm. ";
    }

    @Override
    public void buildTipoMaterialCorpo() {
        violao.tipoMaterial = "carbono. ";
    }

    @Override
    public void buildModelo() {
        violao.modelo = "Folk. ";
    }
}
