/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andsonbelo
 */
public class ProjetoAlvenariaRacionalizada extends Projeto {
    
    private int pontosEletricos;
    private int pontosArCondicionado; 
    private int pontosHidroSanitarios;
    private int pontosInterComunicacao;
    private int pontosGas;
    private double metrosAlvenaria;
    private double calculotempo;
    
    public ProjetoAlvenariaRacionalizada() {
        super.projetoAlvenariaRacionalizada = true;
    }
   
    public double getMetrosAlvenaria() {
        return metrosAlvenaria;
    }

    public void setMetrosAlvenaria(double metrosAlvenaria) {
        this.metrosAlvenaria = metrosAlvenaria;
    }

    public int getPontosArCondicionado() {
        return pontosArCondicionado;
    }

    public void setPontosArCondicionado(int pontosArCondicionado) {
        this.pontosArCondicionado = pontosArCondicionado;
    }

    public int getPontosEletricos() {
        return pontosEletricos;
    }

    public void setPontosEletricos(int pontosEletricos) {
        this.pontosEletricos = pontosEletricos;
    }

    public int getPontosGas() {
        return pontosGas;
    }

    public void setPontosGas(int pontosGas) {
        this.pontosGas = pontosGas;
    }

    public int getPontosHidroSanitarios() {
        return pontosHidroSanitarios;
    }

    public void setPontosHidroSanitarios(int pontosHidroSanitarios) {
        this.pontosHidroSanitarios = pontosHidroSanitarios;
    }

    public int getPontosInterComunicacao() {
        return pontosInterComunicacao;
    }

    public void setPontosInterComunicacao(int pontosInterComunicacao) {
        this.pontosInterComunicacao = pontosInterComunicacao;
    }
   
    public int CalculoQuantidadeDeFuncionarios(){
        
        
        return 1;
        /*de acordo com a quantidade que as variáveis forem setadas, o calculo
         irá retornar números de funcionários (ex.: 1 encanador, 2 pedreiros, etc..) 
         * necessários para executar o projeto no prazo (getPrazo()) estipulado e informado
         * ao sistema.
         * 
         * Existe um orgão que diz qual a média de produção que um funcionário executa por dia
         * ainda tenho que conversar com o meu cliente (meu irmão).
         */       
    }




}

