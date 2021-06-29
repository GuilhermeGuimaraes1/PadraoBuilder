
package padraoprojetobuilder;

public class ViolaoZeroDuploZeroTriploZero extends ViolaoBuilder {
           @Override
    public void buildPreco() {
        violao.preco = 1000.00;
    }

    @Override
    public void buildCorViolao() {
        violao.cor = "Branca. ";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipoCorda = "Aço. ";
    }

    @Override
    public void buildTipoTarraxa() {
        violao.tipoTarraxa = "12 cm x 4.5 cm. ";
    }

    @Override
    public void buildTipoMaterialCorpo() {
        violao.tipoMaterial = "carbono. ";
    }

    @Override
    public void buildModelo() {
        violao.modelo = "Violao zero, Duplo zero e Triplo zero. ";
    }
    
    @Override
    public void buildTamanhoBraco() {
        System.out.println("");
    }
}
