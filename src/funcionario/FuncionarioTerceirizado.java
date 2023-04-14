package funcionario;
public class FuncionarioTerceirizado extends Funcionario {
   private double despesasAdicionais;


   public FuncionarioTerceirizado() { }


   public FuncionarioTerceirizado(String nome, int hotasTrabalhadas, double valorHora, double despesasAdicionais) {
       super(nome, hotasTrabalhadas, valorHora);
       this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
   }


   public final double validaDespesasAdicionais(double despesas) {
       if (despesas > 1000) {
           throw new IllegalArgumentException ("Valor acima de 1000 reais");
       } else {
           return despesas;
       }
   }


   public double getDespesasAdicionais() {
       return despesasAdicionais;
   }


   public void setDespesasAdicionais(double despesasAdicionais) {
       this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
   }


  


  
}
