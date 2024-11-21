import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorDeDados implements Serializable {
    private ArrayList<Estudante> listaDeEstudantes;
    private ArrayList<Professor> listaDeProfessores;
    private ArrayList<Estudante> listaDeEstudantesPosGrad;
    private ArrayList<Estudante> listaDeEstudantesGrad;
    private ArrayList<Disciplina> listaDeDisciplinas;
    private ArrayList<Disciplina> listaDeTurma;

    public GerenciadorDeDados() {
        listaDeEstudantes = new ArrayList<>();
        listaDeProfessores = new ArrayList<>();
        listaDeEstudantesPosGrad = new ArrayList<>();
        listaDeEstudantesGrad = new ArrayList<>();
        listaDeDisciplinas = new ArrayList<>();
        listaDeTurma = new ArrayList<>();
    }

    public void addEstudanteGrad(String cpf, String nome, LocalDate dataNascimento, double cra,
                                 boolean estagioSupervisionado) throws GerenciadorException {
        try {
            Estudante novoEstudante = new EstudanteGraduacao(cpf, nome, dataNascimento, cra, estagioSupervisionado);
            if (novoEstudante.validar()) {
                listaDeEstudantesGrad.add(novoEstudante);
                listaDeEstudantes.add(novoEstudante);
            } else {
                throw new GerenciadorException("Estudante inválido!");
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao adicionar estudante: " + e.getMessage());
        }
    }

    public void addEstudantePosGrad(String cpf, String nome, LocalDate dataNascimento, double cra,
                                    String temaPesquisa) throws GerenciadorException {
        try {
            Estudante novoEstudante = new EstudantePosGraduacao(cpf, nome, dataNascimento, cra, temaPesquisa);
            if (novoEstudante.validar()) {
                listaDeEstudantesPosGrad.add(novoEstudante);
                listaDeEstudantes.add(novoEstudante);
            } else {
                throw new GerenciadorException("Estudante inválido!");
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao adicionar estudante: " + e.getMessage());
        }
    }

    public void addProfessor(String cpf, String nome, LocalDate dataNascimento,
                             LocalDate inicioContrato, String departamento) throws GerenciadorException {
        try {
            Professor novoProfessor = new Professor(cpf, nome, dataNascimento, inicioContrato, departamento);
            if (novoProfessor.validar()) {
                listaDeProfessores.add(novoProfessor);
            } else {
                throw new GerenciadorException("Professor inválido!");
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao adicionar professor: " + e.getMessage());
        }
    }

    public void addDisciplina(String codigo, String nome, int cargaHoraria) throws GerenciadorException {
        try {
            Disciplina novaDisciplina = new Disciplina(codigo, nome, cargaHoraria);
            if (novaDisciplina.validar()) {
                listaDeDisciplinas.add(novaDisciplina);
            } else {
                throw new GerenciadorException("Disciplina inválida!");
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao adicionar disciplina: " + e.getMessage());
        }
    }

    public void addTurma(String codigoDisciplina, int semestre, int ano, String nomeTurma) throws GerenciadorException {
        try {
            Disciplina disciplinaEncontrada = null;
            for (Disciplina disciplina : listaDeDisciplinas) {
                if (disciplina.getCodigo().equals(codigoDisciplina)) {
                    disciplinaEncontrada = disciplina;
                    break;
                }
            }

            if (disciplinaEncontrada != null) {
                Disciplina novaDisciplina = new Disciplina(
                        disciplinaEncontrada.getCodigo(),
                        disciplinaEncontrada.getNomeDisciplina(),
                        disciplinaEncontrada.getCargaHoraria(),
                        semestre,
                        ano,
                        nomeTurma
                );
                listaDeTurma.add(novaDisciplina);
            } else {
                throw new GerenciadorException("Disciplina não encontrada!");
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao adicionar turma: " + e.getMessage());
        }
    }

    public void removerEstudanteGrad(String nome) throws GerenciadorException {
        try {
            Estudante estudanteParaRemover = null;
            for (Estudante estudante : listaDeEstudantesGrad) {
                if (estudante.getNome().equals(nome)) {
                    estudanteParaRemover = estudante;
                    break;
                }
            }
            if (estudanteParaRemover != null) {
                listaDeEstudantesGrad.remove(estudanteParaRemover);
                listaDeEstudantes.remove(estudanteParaRemover);
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao remover estudante: " + e.getMessage());
        }
    }

    public void removerEstudantePosGrad(String nome) throws GerenciadorException {
        try {
            Estudante estudanteParaRemover = null;
            for (Estudante estudante : listaDeEstudantesPosGrad) {
                if (estudante.getNome().equals(nome)) {
                    estudanteParaRemover = estudante;
                    break;
                }
            }
            if (estudanteParaRemover != null) {
                listaDeEstudantesPosGrad.remove(estudanteParaRemover);
                listaDeEstudantes.remove(estudanteParaRemover);
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao remover estudante: " + e.getMessage());
        }
    }

    public void removerProfessor(String nome) throws GerenciadorException {
        try {
            Professor professorParaRemover = null;
            for (Professor professor : listaDeProfessores) {
                if (professor.getNome().equals(nome)) {
                    professorParaRemover = professor;
                    break;
                }
            }
            if (professorParaRemover != null) {
                listaDeProfessores.remove(professorParaRemover);
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao remover professor: " + e.getMessage());
        }
    }

    public void removerDisciplina(String codigo) throws GerenciadorException {
        try {
            Disciplina disciplinaParaRemover = null;
            for (Disciplina disciplina : listaDeDisciplinas) {
                if (disciplina.getCodigo().equals(codigo)) {
                    disciplinaParaRemover = disciplina;
                    break;
                }
            }
            if (disciplinaParaRemover != null) {
                listaDeDisciplinas.remove(disciplinaParaRemover);
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao remover disciplina: " + e.getMessage());
        }
    }

    public void removerTurma(String nomeTurma) throws GerenciadorException {
        try {
            Disciplina turmaParaRemover = null;
            for (Disciplina turma : listaDeTurma) {
                if (turma.getTurma().getNomeTurma().equals(nomeTurma)) {
                    turmaParaRemover = turma;
                    break;
                }
            }
            if (turmaParaRemover != null) {
                listaDeTurma.remove(turmaParaRemover);
            }
        } catch (Exception e) {
            throw new GerenciadorException("Erro ao remover turma: " + e.getMessage());
        }
    }

    public ArrayList<Estudante> getListaDeEstudantes() {
        return listaDeEstudantes;
    }

    public ArrayList<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public ArrayList<Estudante> getListaDeEstudantesPosGrad() {
        return listaDeEstudantesPosGrad;
    }

    public ArrayList<Estudante> getListaDeEstudantesGrad() {
        return listaDeEstudantesGrad;
    }

    public ArrayList<Disciplina> getListaDeDisciplinas() {
        return listaDeDisciplinas;
    }

    public ArrayList<Disciplina> getListaDeTurma() {
        return listaDeTurma;
    }
}




