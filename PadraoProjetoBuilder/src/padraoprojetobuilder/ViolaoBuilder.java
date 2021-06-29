//possui um metodo para contruir cada um dos dados do nosso produto
package padraoprojetobuilder;

public abstract class ViolaoBuilder{
    protected ViolaoProduct violao;
    
    public ViolaoBuilder() {
        violao = new ViolaoProduct();
    }
    
    public abstract void buildPreco();
    
    public abstract void buildCorViolao();
    
    public abstract void buildTipoCorda();
    
    public abstract void buildTipoTarraxa();
    
    public abstract void buildTipoMaterialCorpo();
    
    public abstract void buildModelo();
    
    public abstract void buildTamanhoBraco();
    
    public ViolaoProduct getViolao() {
        return violao;
    }
}
