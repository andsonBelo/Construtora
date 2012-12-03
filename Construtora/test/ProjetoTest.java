/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author andsonbelo
 */
public class ProjetoTest {
    
    
    
    @Test
    public void criarProjeto(){
        
        Projeto projeto = new Projeto();
        Assert.assertTrue("o projeto iniciou vazio", projeto.vazio());
    }    
    
    @Test
    public void atribuirNomeAoProjeto(){
        Projeto projeto = new Projeto();
        //Assert.assertTrue("esperava que o projeto recebesse um nome",
                //projeto.setNome("projeto estrutural"));
        projeto.setNome("projeto estrutural");
        assertEquals("projeto estrutural", projeto.getNome());
                
    }
   @Test
     public void inserirCaracteristicasDoProjeto(){
           Projeto projeto = new Projeto();
           projeto.setNome("projeto Design"); 
           //Assert.assertTrue("esperava que as caracterísitcas fossem inseridas", 
             //      projeto.setCaracteristicas("projeto design de interiores"));
           projeto.setCaracteristicas("projeto design de interiores");
           assertEquals("projeto design de interiores", projeto.getCaracteristicas());
        
   }
    
 @Test
   public void informarPrazoParaExecucaoDoProjeto(){
           Projeto projeto = new Projeto();
           projeto.setNome("projeto estrtutura"); 
           projeto.setCaracteristicas("projeto da alvenaria");
           //Assert.assertTrue("esperava que fosse atribuído um prazo para o projetoAlvenaria", projeto.setPrazo(5));
           projeto.setPrazo(5);
           assertEquals(5, projeto.getPrazo());
        
 }
   
   @Test
    public void SelecionarProjetoAlvenariaRacionalizada() {
        Projeto projeto = new ProjetoAlvenariaRacionalizada();
        projeto.setNome("projeto alvenaria");
        projeto.setCaracteristicas("projeto alvenaria etc ettc etc");
        projeto.setPrazo(5);
        Assert.assertTrue("esperava que o projetoAlvenaria fosse true", projeto.projetoAlvenariaRacionalizada);

    }
  
     
   @Test
    public void SelecionarProjetoRevestimento() {
        Projeto projeto = new ProjetoRevestimento();
        projeto.setNome("projeto revestimento");
        projeto.setCaracteristicas("projeto revestimento etc etc etc");
        Assert.assertTrue("esperava que o projetoRevestimento fosse true", projeto.projetoRevestimento);

    }
      
   @Test(expected=ExcecaoConstrutora.class)
     public void inserirCaracteristicasAntesDoNome(){
           Projeto projeto = new Projeto();
           projeto.setCaracteristicas("projeto design de interiores");
     
     }
    @Test(expected=ExcecaoConstrutora.class)
    public void atribuirNomeJaExistenteAoProjeto(){ 
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        projeto.setCaracteristicas("projeto da estrutura etc etc etc...");
        projeto.projetos.add(projeto);
        
        
        projeto.setNome("projeto estrutural");//estou usando o mesmo objeto e seto duas vezes com info diferentes
        //neste caso o teste "inserirCaracteristicasAntesDoNome" vai furar?
        
        
    }
      
 
    @Test
    public void pesquisarProjetoExistente(){ 
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        projeto.setCaracteristicas("projeto da estrutura etc etc etc...");
        projeto.projetos.add(projeto);
        Assert.assertTrue("esperava que o projeto fosse encontrado", 
                projeto.pesquisarProjeto("projeto estrutural"));
    }
    
     @Test(expected=ExcecaoConstrutora.class)
     public void pesquisarProjetoNaoExistente(){
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        projeto.setCaracteristicas("projeto da estrutura etc etc etc...");
        projeto.projetos.add(projeto);
        Assert.assertTrue("esperava que o projeto fosse encontrado", 
                projeto.pesquisarProjeto("projeto estrutural"));
        projeto.pesquisarProjeto("projeto design");  
     } 
    @Test
   public void inserirDadosEmProjetoAlvenariaRacionalizada(){
       ProjetoAlvenariaRacionalizada projeto = new ProjetoAlvenariaRacionalizada();
       projeto.setNome("projeto alvenaria"); 
       projeto.setCaracteristicas("projeto da alvenaria etc etc etc");
       projeto.setPrazo(5);
       projeto.setPrazo(5);
       projeto.setMetrosAlvenaria(10);
       projeto.setPontosArCondicionado(2);
       projeto.setPontosEletricos(8);
       projeto.setPontosGas(2);
       projeto.setPontosHidroSanitarios(3);
       projeto.setPontosInterComunicacao(4);
   }
   
   @Test
   public void inserirDadosEmProjetoRevestimento(){
       ProjetoRevestimento projeto = new ProjetoRevestimento();
       projeto.setNome("projeto revestimento"); 
       projeto.setCaracteristicas("projeto da revestimento etc etc etc");
       projeto.setPrazo(5);
       projeto.setMetrosDeCeramica(12.5);
       projeto.setMetrosDeGesso(12.8);
       projeto.setMetrosDePintura(20);
       projeto.setPortas(2);
   }
   
     
     
     
    }
