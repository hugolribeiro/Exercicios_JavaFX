package sample;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.time.LocalDate;


public class AlunoController {
    private ObservableList<Aluno> alunos = FXCollections.observableArrayList();
    private TableView<Aluno> table = new TableView<Aluno>();

    private LongProperty id = new SimpleLongProperty(1);
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty ra = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(LocalDate.now());

    public void setEntity(Aluno aluno) {
        if (aluno != null) {
            id.set(aluno.getId());
            nome.set(aluno.getNome());
            ra.set(aluno.getRa());
            nascimento.set(aluno.getNascimento());
        }
    }

    public Aluno getEntity() {
        Aluno aluno = new Aluno();
        aluno.setId(id.get());
        aluno.setNome(nome.get());
        aluno.setRa(ra.get());
        aluno.setNascimento(nascimento.get());
        return aluno;
    }
    public void adicionar() {
        Aluno aluno = getEntity();
        alunos.add(aluno);
    }

    public void pesquisarPorNome() {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().contains(nome.get())) {
                this.setEntity(aluno);
            }
        }
    }


    public void limpar(){
        Aluno aluno = getEntity();
        aluno.setId(0);
        id.set(0);
        ra.set("");
        nome.set("");
    }


    public long getId() {
        return id.get();
    }
    public LongProperty idProperty() {
        return id;
    }
    public String getNome() {
        return nome.get();
    }
    public StringProperty nomeProperty() {
        return nome;
    }
    public String getRa() {
        return ra.get();
    }
    public StringProperty raProperty() {
        return ra;
    }
    public LocalDate getNascimento() {
        return nascimento.get();
    }
    public ObjectProperty<LocalDate> nascimentoProperty() {
        return nascimento;
    }
}