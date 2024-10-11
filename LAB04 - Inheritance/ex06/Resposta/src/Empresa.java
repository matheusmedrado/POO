public class Empresa {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50.0);
        ingressoNormal.escreveValor();
        ((Normal) ingressoNormal).imprimeTipo();

        VIP ingressoVIP = new VIP(100.0, 20.0);
        System.out.println("Valor do ingresso VIP: R$" + ingressoVIP.getValorVIP());

        CamaroteInferior camaroteInferior = new CamaroteInferior(150.0, 30.0, "Setor A");
        camaroteInferior.imprimeLocalizacao();
        System.out.println("Valor do Camarote Inferior: R$" + camaroteInferior.getValorVIP());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200.0, 50.0);
        System.out.println("Valor do Camarote Superior: R$" + camaroteSuperior.getValor());
    }
}
