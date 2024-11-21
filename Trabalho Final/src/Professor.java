import java.io.Serializable;
import java.time.LocalDate;

public class Professor implements Validavel, Serializable {
    protected String cpf;
    protected String nome;
    protected LocalDate dataNascimento;
    protected LocalDate inicioDeContrato;
    protected String departamento;

    public Professor(String cpf, String nome, LocalDate dataNascimento, LocalDate inicioDeContrato, String departamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.inicioDeContrato = inicioDeContrato;
        this.departamento = departamento;
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

    public LocalDate getInicioDeContrato() {
        return inicioDeContrato;
    }

    public void setInicioDeContrato(LocalDate inicioDeContrato) {
        this.inicioDeContrato = inicioDeContrato;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public boolean validar() {
        if(getCpf() != null && getCpf().length() == 11 && nome != null &&
                dataNascimento != null && getInicioDeContrato() != null &&
                departamento != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "CPF: " + getCpf() +
                "\nNome: " + getNome() +
                "\nData de Nascimento: " + getDataNascimento() +
                "\nInício de Contrato: " + getInicioDeContrato() +
                "\nDepartamento: " + getDepartamento();
    }


}
