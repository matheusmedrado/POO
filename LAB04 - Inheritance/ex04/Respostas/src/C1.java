public class C1 {
    public int atributoPublico;
    protected int atributoProtegido;
    private int atributoPrivado;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrão, sem parâmetros");
    }

    public C1(int publico, int protegido, int privado) {
        System.out.println("Classe C1: chamada do construtor com parâmetros");
        this.atributoPublico = publico;
        this.atributoProtegido = protegido;
        this.atributoPrivado = privado;
    }

    public void mostrarAtributos() {
        System.out.println("Atributo Público: " + atributoPublico);
        System.out.println("Atributo Protegido: " + atributoProtegido);
        System.out.println("Atributo Privado: " + atributoPrivado);
    }

    public void mostrarAtributosSuper() {
        mostrarAtributos();
    }
}
