//utiliza a estrutura do builder para definir o algoristimo de construção do produto
package padraoprojetobuilder;

public class VenderViolaoDirector {
    protected ViolaoBuilder venderViolao;
    
    public VenderViolaoDirector(ViolaoBuilder venderViolao) {
        this.venderViolao = venderViolao;
    }
    
    public void violaoVenda() {
        venderViolao.buildPreco();
        venderViolao.buildCorViolao();
        venderViolao.buildTipoCorda();
        venderViolao.buildTipoTarraxa();
        venderViolao.buildTipoMaterialCorpo();
        venderViolao.buildModelo();
        venderViolao.buildTamanhoBraco();
    }
    
   public ViolaoProduct getViolao() {
       return venderViolao.getViolao();
   }
}
