public class C3 extends C2 {
    public int atributoPublicoC3;
    protected int atributoProtegidoC3;
    private int atributoPrivadoC3;

    public C3() {
        super();
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(int publicoC1, int protegidoC1, int privadoC1, int publicoC2, int protegidoC2, int privadoC2, int publicoC3, int protegidoC3, int privadoC3) {
        super(publicoC1, protegidoC1, privadoC1, publicoC2, protegidoC2, privadoC2);
        System.out.println("Classe C3: chamada do construtor com parâmetros");
        this.atributoPublicoC3 = publicoC3;
        this.atributoProtegidoC3 = protegidoC3;
        this.atributoPrivadoC3 = privadoC3;
    }

    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Atributo Público C3: " + atributoPublicoC3);
        System.out.println("Atributo Protegido C3: " + atributoProtegidoC3);
        System.out.println("Atributo Privado C3: " + atributoPrivadoC3);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
    }
}
