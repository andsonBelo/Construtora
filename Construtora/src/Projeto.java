
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andsonbelo
 */
public class Projeto {

    private String nome;
    public List projetos = new ArrayList<Projeto>();
    private String caracteristicas;
    private boolean temNome = false;
    boolean projetoAlvenariaRacionalizada = false;
    boolean projetoRevestimento = false;
    private int prazo;
    //GerenciadorProjeto gp = new GerenciadorProjeto();
    
    public boolean vazio() {
        return true;
    }

    
    public void setNome(String nome) {
             Iterator it = projetos.iterator();
		while (it.hasNext()){
			Projeto p = (Projeto) it.next();
			if (p.getNome().equals(nome))
                            throw new ExcecaoConstrutora("este nome de Projeto já existe");
                }
        /*for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getNome().equals(nome)){
                throw new ExcecaoConstrutora("este nome de Projeto já existe");
            }
        }
        */
        this.nome = nome;
        this.temNome = true;
        
    }
    
    public String getNome() {
        return this.nome;
    
    }

   /* public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
        
    }*/
    public void setCaracteristicas(String caracteristicas) {
        if (temNome){
            this.caracteristicas = caracteristicas; 
            
            
        }else
            throw new ExcecaoConstrutora("é preciso preencher o nome antes das características do projeto"); 
    }

public String getCaracteristicas() {
        return caracteristicas;
    }
 
public boolean pesquisarProjeto(String nomeASerPesquisado) {
        Iterator it = projetos.iterator();
		while (it.hasNext()){
			Projeto p = (Projeto) it.next();
			if (p.getNome().equals(nomeASerPesquisado)){
                            return true; // acho que tem que retornar um toString;
                        } 
               }
        /*for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getNome().equals(nomeASerPesquisado)) {
                return true;
            }
        }*/

        throw new ExcecaoConstrutora("este Projeto não existe");
    }

    

    public void setPrazo(int dias) {
        this.prazo = dias;
        
    }

    public int getPrazo() {
        return prazo;
    }
   

}
