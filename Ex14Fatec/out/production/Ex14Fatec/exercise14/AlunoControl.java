package exercise14;

import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public boolean getAlunos() {
        return alunos.isEmpty();
    }

    public Aluno pesquisarPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public Aluno pesquisarPorId(long id){
        for (Aluno aluno : alunos){
            if (aluno.getId() == id){
                return aluno;
            }
        }
        return null;
    }
}
