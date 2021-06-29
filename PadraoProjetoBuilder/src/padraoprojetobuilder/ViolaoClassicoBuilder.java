
package padraoprojetobuilder;

public class ViolaoClassicoBuilder extends ViolaoBuilder {

    @Override
    public void buildPreco() {
        violao.preco = 320.20;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Preto. ";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipoCorda = "aço. ";
    }

    @Override
    public void buildTipoTarraxa() {
        violao.tipoTarraxa = "12 cm x 4 cm. ";
    }

    @Override
    public void buildTipoMaterialCorpo() {
        violao.tipoMaterial = "carbono. ";
    }

    @Override
    public void buildModelo() {
        violao.modelo = "Clássico. ";
    }
    
    
    
}
