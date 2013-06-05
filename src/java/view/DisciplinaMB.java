/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DisciplinaEJB;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Disciplina;

/**
 *
 * @author jeferson
 */
@ManagedBean
@ViewScoped
public class DisciplinaMB {

    public DisciplinaMB() {
        disciplina = new Disciplina();
    }
    private Disciplina disciplina;
    @EJB
    DisciplinaEJB disciplinaEJB;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void salvar() {
        disciplinaEJB.salvar(disciplina);
        System.out.println("Salvando disciplina " + disciplina.getDescricao() + " do curso " + disciplina.getCurso() + " com ID " + disciplina.getId() );
    }

    public List<Disciplina> findAll() {
        return disciplinaEJB.findAll();
    }
}
