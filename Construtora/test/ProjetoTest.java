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
    public void criarProjeto() {

        Projeto projeto = new Projeto();
        Assert.assertTrue("o projeto iniciou vazio", projeto.vazio());
    }

    @Test
    public void atribuirNomeAoProjeto() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        assertEquals("projeto estrutural", projeto.getNome());

    }

    @Test(expected = ExcecaoConstrutora.class)
    public void atribuirNomeJaExistenteAoProjeto() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        projeto.setCaracteristicas("projeto da estrutura etc etc etc...");
        projeto.projetos.add(projeto);
        projeto.setNome("projeto estrutural");

        /*
         * estou usando o mesmo objeto e seto duas vezes com informações
         * diferentes neste caso o teste "inserirCaracteristicasAntesDoNome" vai
         * furar!
         *
         * Além disso, como a lista de projetos (projetos) está na classe
         * Projeto eu precisaria garantir que vários objetos do tipo Projeto
         * fossem inseridos em APENAS UM List. Do jeito que se encontra o código
         * toda vez que eu instancio um Projeto eu crio obrigatoriamente uma lista e
         * insiro esse objeto, assim ao invés de ter uma lista com vários
         * objetos eu tenho várias listas com apenas um objeto em cada.
         *
         * Tentei usar um GerenciadorDeProjetos mas não consegui solucionar o
         * problema, me disseram que Singleton resolvia, mas eu não sei e parece
         * que iremos ver na disciplina.
         *
         */
    }

    @Test
    public void inserirCaracteristicasDoProjeto() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto Design");
        projeto.setCaracteristicas("projeto design de interiores");
        assertEquals("projeto design de interiores", projeto.getCaracteristicas());

    }

    @Test(expected = ExcecaoConstrutora.class)
    public void inserirCaracteristicasAntesDoNome() {
        Projeto projeto = new Projeto();
        projeto.setCaracteristicas("projeto design de interiores");

    }

    @Test
    public void informarPrazoParaExecucaoDoProjetoEmDias() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrtutura");
        projeto.setCaracteristicas("projeto da alvenaria");
        projeto.setPrazo(5);
        assertEquals(5, projeto.getPrazo());

    }

    @Test
    public void adicionarProjetoAoListDeProjetos() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrtutura");
        projeto.setCaracteristicas("projeto da alvenaria");
        projeto.setPrazo(5);
        projeto.projetos.add(projeto);
        Assert.assertEquals(projeto, projeto.projetos.get(0));
    }

    @Test
    public void removerProjetoExistenteNoListDeProjetos() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrtutural");
        projeto.setCaracteristicas("projeto da alvenaria");
        projeto.setPrazo(5);
        projeto.projetos.add(projeto);
        Assert.assertTrue("esperava que o projeto fosse encontrado",
                projeto.pesquisarProjeto("projeto estrtutural"));
        projeto.projetos.remove(projeto);
        Assert.assertFalse("esperava que o projeto não estivesse mais no list",
                projeto.projetos.contains(projeto));
    }

    @Test
    public void pesquisarProjetoExistenteNoListDeProjetos() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        projeto.setCaracteristicas("projeto da estrutura etc etc etc...");
        projeto.projetos.add(projeto);
        Assert.assertTrue("esperava que o projeto fosse encontrado",
                projeto.pesquisarProjeto("projeto estrutural"));
    }

    @Test(expected = ExcecaoConstrutora.class)
    public void pesquisarProjetoNaoExistenteNoListDeProjetos() {
        Projeto projeto = new Projeto();
        projeto.setNome("projeto estrutural");
        projeto.setCaracteristicas("projeto da estrutura etc etc etc...");
        projeto.projetos.add(projeto);
        projeto.pesquisarProjeto("projeto estrutural");
        projeto.pesquisarProjeto("projeto design");
    }

    @Test
    public void criarProjetoAlvenariaRacionalizada() {
        ProjetoAlvenariaRacionalizada projeto = new ProjetoAlvenariaRacionalizada();
        projeto.setNome("projeto alvenaria");
        projeto.setCaracteristicas("projeto alvenaria etc ettc etc");
        projeto.setPrazo(5);
        Assert.assertTrue("esperava que o projetoAlvenaria fosse true",
                projeto.projetoAlvenariaRacionalizada);

    }

    @Test
    public void criarProjetoRevestimento() {
        ProjetoRevestimento projeto = new ProjetoRevestimento();
        projeto.setNome("projeto revestimento");
        projeto.setCaracteristicas("projeto revestimento etc etc etc");
        Assert.assertTrue("esperava que o projetoRevestimento fosse true",
                projeto.projetoRevestimento);

    }

    @Test
    public void SetarDadosEmProjetoAlvenariaEAdicionarEmProjetos() {
        ProjetoAlvenariaRacionalizada pa = new ProjetoAlvenariaRacionalizada();
        pa.setNome("projeto alvenaria");
        pa.setCaracteristicas("projeto da alvenaria etc etc etc");
        pa.setPrazo(5);
        pa.setMetrosAlvenaria(1.3);//não sei como testo tipo Double
        pa.setPontosArCondicionado(2);
        Assert.assertEquals(2, pa.getPontosArCondicionado());
        pa.setPontosEletricos(8);
        Assert.assertEquals(8, pa.getPontosEletricos());
        pa.setPontosGas(2);
        Assert.assertEquals(2, pa.getPontosGas());
        pa.setPontosHidroSanitarios(3);
        Assert.assertEquals(3, pa.getPontosHidroSanitarios());
        pa.setPontosInterComunicacao(4);
        Assert.assertEquals(4, pa.getPontosInterComunicacao());
        pa.projetos.add(pa);
        Assert.assertEquals(pa, pa.projetos.get(0));

    }

    @Test
    public void SetarDadosEmProjetoRevestimentoEAdicionarEmProjetos() {
        ProjetoRevestimento pr = new ProjetoRevestimento();
        pr.setNome("projeto revestimento");
        pr.setCaracteristicas("projeto da revestimento etc etc etc");
        pr.setPrazo(5);
        pr.setMetrosDeCeramica(12.5);//não sei como testo tipo Double
        pr.setMetrosDeGesso(12.8);//não sei como testo tipo Double
        pr.setMetrosDePintura(20);//não sei como testo tipo Double
        pr.setPortas(2);
        assertEquals(2, pr.getPortas());
        pr.projetos.add(pr);
        Assert.assertEquals(pr, pr.projetos.get(0));
    }

    @Test
    public void removerProjetoAlvenariaExistenteNoListDeProjetos() {
        ProjetoAlvenariaRacionalizada pa = new ProjetoAlvenariaRacionalizada();
        pa.setNome("projeto alvenaria");
        pa.setCaracteristicas("projeto da alvenaria etc etc etc");
        pa.setPrazo(5);
        pa.setMetrosAlvenaria(1.3);//não sei como testo tipo Double
        pa.setPontosArCondicionado(2);
        Assert.assertEquals(2, pa.getPontosArCondicionado());
        pa.setPontosEletricos(8);
        Assert.assertEquals(8, pa.getPontosEletricos());
        pa.setPontosGas(2);
        Assert.assertEquals(2, pa.getPontosGas());
        pa.setPontosHidroSanitarios(3);
        Assert.assertEquals(3, pa.getPontosHidroSanitarios());
        pa.setPontosInterComunicacao(4);
        Assert.assertEquals(4, pa.getPontosInterComunicacao());
        pa.projetos.add(pa);
        Assert.assertTrue("esperava que o projeto fosse encontrado",
                pa.pesquisarProjeto("projeto alvenaria"));
        pa.projetos.remove(pa);
        Assert.assertFalse("esperava que o projeto não estivesse mais no list",
                pa.projetos.contains(pa));

    }

    @Test
    public void removerProjetoRevestimentoExistenteNoListDeProjetos() {
        ProjetoRevestimento pr = new ProjetoRevestimento();
        pr.setNome("projeto revestimento");
        pr.setCaracteristicas("projeto da revestimento etc etc etc");
        pr.setPrazo(5);
        pr.setMetrosDeCeramica(12.5);//não sei como testo tipo Double
        pr.setMetrosDeGesso(12.8);//não sei como testo tipo Double
        pr.setMetrosDePintura(20);//não sei como testo tipo Double
        pr.setPortas(2);
        pr.projetos.add(pr);
        Assert.assertTrue("esperava que o projeto fosse encontrado",
                pr.pesquisarProjeto("projeto revestimento"));
        pr.projetos.remove(pr);
        Assert.assertFalse("esperava que o projeto não estivesse mais no list",
                pr.projetos.contains(pr));

    }
}
