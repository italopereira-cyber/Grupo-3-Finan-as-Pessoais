import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String nome;
    private double saldo_inicial = 1000;
    private List<Transacao> MatrizDinamica = new ArrayList<>();

//"Id" int | "data" LocalDate | "saldo" double | "descrisao" String | "Categoria" String --> filtro de topicos da descrição?

public Conta(String nome,double saldo_inicial){
    this.nome = nome;
    this.saldo_inicial = saldo_inicial;
}

public void RemoverLinhaInteira(int linhaEspecifica){
    MatrizDinamica.remove(linhaEspecifica);
}

public void AdicionarLinha(Transacao t){
    MatrizDinamica.add(t);
}

public void MostrarLinha(int linha){
    System.out.println(MatrizDinamica.get(linha).getId());
    System.out.println(MatrizDinamica.get(linha).getData());
    System.out.println(MatrizDinamica.get(linha).getValor());
    System.out.println(MatrizDinamica.get(linha).getDescricao());
    System.out.println(MatrizDinamica.get(linha).getCategoria());
}

protected double getSaldoInicial(){
    return saldo_inicial;
}

protected String getNome(){
    return nome;
}
}
