
package padraoprojetobuilder;

public class Violao12CordasBuilder extends ViolaoBuilder {
    
       @Override
    public void buildPreco() {
        violao.preco = 700.88;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Azul. ";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipoCorda = "Aço. ";
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
        violao.modelo = "Violao 12 Cordas. ";
    }
    
}
