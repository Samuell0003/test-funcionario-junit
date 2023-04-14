
package funcionario;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, int hotasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHorasTrabalhadas(hotasTrabalhadas);
        this.valorHora = validaValorHora(valorHora);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHotasTrabalhadas() {
        return horasTrabalhadas;
    }

    public final int validaHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40) {
            throw new IllegalArgumentException("Horas trabalhas maior que permitido");
        } else {
            return horasTrabalhadas;
        }
    }

    public final double validaValorHora(double valorHora) {
        if (valorHora > (1320 * 0.04) && valorHora <= (1320 * 0.1)) {
            return valorHora;
        } else {
            throw new IllegalArgumentException("O valor por hora precisa ser entre 4% e 10% do salário mínimo.");
        }
    }

    public void setHotasTrabalhadas(int hotasTrabalhadas) {
        this.horasTrabalhadas = validaHorasTrabalhadas(hotasTrabalhadas);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validaValorHora(valorHora);
    }

    public double calcularPagamento() {
        if (valorHora * horasTrabalhadas >= 1320) {
            return valorHora * horasTrabalhadas;
        } else {
            throw new IllegalArgumentException("Valor menor que salario minimo");
        }
    }

}
