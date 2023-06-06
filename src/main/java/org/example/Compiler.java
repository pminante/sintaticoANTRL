package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class Compiler {
    String payload;

    public Compiler(String payload) {
        this.payload = payload;
    }

    public void execute(){
        CharStream input = CharStreams.fromString(this.payload);
        SintaticoLexer lexicon = new SintaticoLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexicon);
        token.fill();
        List<Token> tokens = token.getTokens();
        for(Token t : tokens){
            int ttype = t.getType();
            String tname = lexicon.getVocabulary().getSymbolicName(ttype);
            String ttext = t.getText();
            int tline = t.getLine();
            int tcolumn = t.getCharPositionInLine();
            System.out.println("TOKEN = [ " + tname + " ] , TEXTO = [ " + ttext + " ] , LINHA = [ " + tline + " ] , COLUNA = [ " + tcolumn + " ]");
        }
        SintaticoParser p = new SintaticoParser(token);
    }
}
