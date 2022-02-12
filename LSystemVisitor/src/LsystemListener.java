// Generated from Lsystem.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LsystemParser}.
 */
public interface LsystemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LsystemParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LsystemParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsystemParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LsystemParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsystemParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(LsystemParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsystemParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(LsystemParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsystemParser#iter}.
	 * @param ctx the parse tree
	 */
	void enterIter(LsystemParser.IterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsystemParser#iter}.
	 * @param ctx the parse tree
	 */
	void exitIter(LsystemParser.IterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsystemParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LsystemParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsystemParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LsystemParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsystemParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(LsystemParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsystemParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(LsystemParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsystemParser#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(LsystemParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsystemParser#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(LsystemParser.WithContext ctx);
}