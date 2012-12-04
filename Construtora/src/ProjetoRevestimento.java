/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andsonbelo
 */
public class ProjetoRevestimento extends Projeto {

   private double metrosDeReboco;
   private double metrosDeGesso;
   private double metrosDeCeramica;
   private double metrosDePintura;
   private int portas;

    public ProjetoRevestimento() {
        super.projetoRevestimento = true;
    }

       
   public double getMetrosDeCeramica() {
        return metrosDeCeramica;
    }

    public void setMetrosDeCeramica(double metrosDeCeramica) {
        this.metrosDeCeramica = metrosDeCeramica;
    }

    public double getMetrosDeGesso() {
        return metrosDeGesso;
    }

    public void setMetrosDeGesso(double metrosDeGesso) {
        this.metrosDeGesso = metrosDeGesso;
    }

    public double getMetrosDePintura() {
        return metrosDePintura;
    }

    public void setMetrosDePintura(double metrosDePintura) {
        this.metrosDePintura = metrosDePintura;
    }

    public double getMetrosDeReboco() {
        return metrosDeReboco;
    }

    public void setMetrosDeReboco(double metrosDeReboco) {
        this.metrosDeReboco = metrosDeReboco;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
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
