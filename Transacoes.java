
import java.time.LocalDate;
public abstract class Transacao {

    private int id;
    private LocalDate data;
    private double valor_transacao;
    private String descricao;
    private String categoria;

    protected Transacao(int id, LocalDate data, double valor_transacao,
                     String descricao, String categoria) {
        this.id = id;
        this.data = data;
        this.valor_transacao = valor_transacao;
        this.descricao = descricao;
        this.categoria = categoria;
    }

     protected int getId() {
        return id;
    }

     protected LocalDate getData() {
        return data;
    }

     protected double getValor() {
        return valor_transacao;
    }

    protected String getDescricao() {
        return descricao;
    }

     protected String getCategoria() {
        return categoria;
    }

    public abstract void aplicar(Conta conta);

    public abstract String getTipo();
}
