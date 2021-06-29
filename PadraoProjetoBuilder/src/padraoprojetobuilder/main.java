package padraoprojetobuilder;

public class main {

    public static void main(String[] args) {
        VenderViolaoDirector loja = new VenderViolaoDirector(
                new ViolaoClassicoBuilder());

        loja.violaoVenda();
        ViolaoProduct violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);

        System.out.println();

        loja = new VenderViolaoDirector(new ViolaoFolkBuilder());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);

        System.out.println();

        loja = new VenderViolaoDirector(new ViolaoFletBuilder());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);

        System.out.println();

        loja = new VenderViolaoDirector(new ViolaoJumboBuilder());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);
        
        System.out.println();

        loja = new VenderViolaoDirector(new Violao7CordasBuilder());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);
        
        System.out.println();

        loja = new VenderViolaoDirector(new Violao12CordasBuilder());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);
        
        System.out.println();

        loja = new VenderViolaoDirector(new ViolaoZeroDuploZeroTriploZero());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.tipoCorda + " Tipo tarraxa: " + violao.tipoTarraxa
                + " Material " + violao.tipoMaterial);
    }

}
