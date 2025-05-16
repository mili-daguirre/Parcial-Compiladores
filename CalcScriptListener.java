// Generated from c:/Users/milid/OneDrive/Documentos/UPC/2025-01/Teoria de compiladores/Parcial/CalcScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcScriptParser}.
 */
public interface CalcScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalcScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalcScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalcScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalcScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalcScriptParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalcScriptParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CalcScriptParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CalcScriptParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CalcScriptParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CalcScriptParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(CalcScriptParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(CalcScriptParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(CalcScriptParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(CalcScriptParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(CalcScriptParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(CalcScriptParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(CalcScriptParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(CalcScriptParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(CalcScriptParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CalcScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(CalcScriptParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalcScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalcScriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalcScriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalcScriptParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalcScriptParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalcScriptParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CalcScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CalcScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CalcScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CalcScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CalcScriptParser.FunctionContext ctx);
}