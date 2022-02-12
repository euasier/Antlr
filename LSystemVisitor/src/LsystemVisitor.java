// Generated from Lsystem.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LsystemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LsystemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LsystemParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LsystemParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsystemParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(LsystemParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsystemParser#iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter(LsystemParser.IterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsystemParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LsystemParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsystemParser#rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep(LsystemParser.RepContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsystemParser#with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(LsystemParser.WithContext ctx);
}