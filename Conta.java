import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta extends Transacao {
    private String nome;
    private double saldo_inicial = 1000;
    private List<Transacao> MatrizDinamica = new ArrayList<>();

//"Id" int | "data" LocalDate | "saldo" double | "descrisao" String | "Categoria" String --> filtro de topicos da descrição?

public Conta(int id, LocalDate data, double saldo_transacao,String descricao, String categoria){
    super(id,data,saldo_transacao,descricao,categoria);
}

public void RemoverLinhaInteira(int linhaEspecifica){
    MatrizDinamica.remove(linhaEspecifica);
}

public void AdicionarLinha(Transacao t){
    MatrizDinamica.add(t);
}

public void MostrarLinha(int linha){
    Transacao o =  MatrizDinamica.get(linha);
    System.out.println(o.getId());
    System.out.println(o.getData());
    System.out.println(o.getValor());
    System.out.println(o.getDescricao());
    System.out.println(o.getCategoria());
}

protected double getSaldoInicial(){
    return saldo_inicial;
}

protected String getNome(){
    return nome;
}

protected Transacao AcessoArray(int index){
    return MatrizDinamica.get(index);
}

@Override
public String getTipo(){
    return "ainda vou fazer";
}

@Override 
public void aplicar(Conta Conta){
    // ainda a termianr esse aqui
}}
       
