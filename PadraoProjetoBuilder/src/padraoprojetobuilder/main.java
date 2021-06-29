
package padraoprojetobuilder;

public class main {

    public static void main(String[] args) {
        VenderViolaoDirector loja = new VenderViolaoDirector( 
                new ViolaoClassicoBuilder());
        
        loja.violaoVenda();
        ViolaoProduct violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor + 
                " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);
    }
    
}
