
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
public class GerenciadorProjeto {

     public List projetos = new ArrayList<Projeto>();
     
     
    public Projeto pesquisarProjeto1(String nomeASerPesquisado) {
        Iterator it = projetos.iterator();
		while (it.hasNext()){
			Projeto p = (Projeto) it.next();
			if (p.getNome().equals(nomeASerPesquisado)){
                            return p;
                        } 
               }
       

        throw new ExcecaoConstrutora("este Projeto não existe");
    }


}