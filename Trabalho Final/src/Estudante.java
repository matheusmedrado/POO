import java.io.Serializable;
import java.time.LocalDate;

public abstract class Estudante implements Validavel, Serializable {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private double cra;

    public Estudante(String cpf, String nome, LocalDate dataNascimento, double cra) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cra = cra;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws CpfInvalidoException {
        if(cpf.length() != 11) {
            throw new CpfInvalidoException("CPF invalido");
        }
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getCra() {
        return cra;
    }
    public void setCra(double cra) {
        this.cra = cra;
    }

    public abstract String toString();

    @Override
    public boolean validar() {
        if(getCpf() != null && getCpf().length() == 11 && nome != null &&
                dataNascimento != null && (cra >= 0) && (cra <= 100)) {
            return true;
        } else {
            return false;
        }
    }

}

