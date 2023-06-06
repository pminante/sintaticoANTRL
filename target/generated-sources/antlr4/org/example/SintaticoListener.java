// Generated from org/example/Sintatico.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SintaticoParser}.
 */
public interface SintaticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SintaticoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SintaticoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(SintaticoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(SintaticoParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(SintaticoParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(SintaticoParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(SintaticoParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(SintaticoParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(SintaticoParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(SintaticoParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(SintaticoParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(SintaticoParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(SintaticoParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(SintaticoParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(SintaticoParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(SintaticoParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(SintaticoParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(SintaticoParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(SintaticoParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(SintaticoParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(SintaticoParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(SintaticoParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(SintaticoParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(SintaticoParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(SintaticoParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(SintaticoParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(SintaticoParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(SintaticoParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(SintaticoParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(SintaticoParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(SintaticoParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(SintaticoParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(SintaticoParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(SintaticoParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(SintaticoParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(SintaticoParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(SintaticoParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(SintaticoParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(SintaticoParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(SintaticoParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SintaticoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SintaticoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(SintaticoParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(SintaticoParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(SintaticoParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(SintaticoParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(SintaticoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(SintaticoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(SintaticoParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(SintaticoParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(SintaticoParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(SintaticoParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(SintaticoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(SintaticoParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterIntnum(SintaticoParser.IntnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitIntnum(SintaticoParser.IntnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SintaticoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SintaticoParser.IdContext ctx);
}