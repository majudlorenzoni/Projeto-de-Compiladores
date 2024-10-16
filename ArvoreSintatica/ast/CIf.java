package ast;

import java.util.ArrayList;

public class CIf extends Comando {
    public Exp exp;
    public ArrayList<Comando> bloco;

    public CIf(int linha, Exp exp, ArrayList<Comando> bloco) {
        super(linha);
        this.exp = exp;
        this.bloco = bloco;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (" + exp.toString() + ") {\n");
        for (Comando cmd : bloco) {
            sb.append(cmd.toString());
        }
        sb.append("}\n");
        return sb.toString();
    }
}