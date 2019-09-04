/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romao.domain;

/**
 *
 * @author romao
 */
public class FormsIns {

    private String nome;
    private String email;
    private String sexo;
    private String select;
    private String[] cursos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSelect() {
        return select;
    }
    public void setSelect(String select) {
        this.select = select;
    }
    public String[] getCursos() {
        return cursos;
    }
    
    public void setCursos(String[] cursos) {
        this.cursos = cursos;     
    }
}
