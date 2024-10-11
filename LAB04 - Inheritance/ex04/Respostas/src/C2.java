public class C2 extends C1 {
    public int atributoPublicoC2;
    protected int atributoProtegidoC2;
    private int atributoPrivadoC2;

    public C2() {
        super();
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(int publicoC1, int protegidoC1, int privadoC1, int publicoC2, int protegidoC2, int privadoC2) {
        super(publicoC1, protegidoC1, privadoC1);
        System.out.println("Classe C2: chamada do construtor com parâmetros");
        this.atributoPublicoC2 = publicoC2;
        this.atributoProtegidoC2 = protegidoC2;
        this.atributoPrivadoC2 = privadoC2;
    }

    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Atributo Público C2: " + atributoPublicoC2);
        System.out.println("Atributo Protegido C2: " + atributoProtegidoC2);
        System.out.println("Atributo Privado C2: " + atributoPrivadoC2);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
    }
}
