// Generated from C:/Users/pmchrist/Desktop/SimpleParser/src\Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ParserParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ParserParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(ParserParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(ParserParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(ParserParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(ParserParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(ParserParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(ParserParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(ParserParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(ParserParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#opassign_expr}.
	 * @param ctx the parse tree
	 */
	void enterOpassign_expr(ParserParser.Opassign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#opassign_expr}.
	 * @param ctx the parse tree
	 */
	void exitOpassign_expr(ParserParser.Opassign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#opbool_expr}.
	 * @param ctx the parse tree
	 */
	void enterOpbool_expr(ParserParser.Opbool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#opbool_expr}.
	 * @param ctx the parse tree
	 */
	void exitOpbool_expr(ParserParser.Opbool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(ParserParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(ParserParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(ParserParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(ParserParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(ParserParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(ParserParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#comp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComp_stmt(ParserParser.Comp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#comp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComp_stmt(ParserParser.Comp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(ParserParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(ParserParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#stmp_list}.
	 * @param ctx the parse tree
	 */
	void enterStmp_list(ParserParser.Stmp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#stmp_list}.
	 * @param ctx the parse tree
	 */
	void exitStmp_list(ParserParser.Stmp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(ParserParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(ParserParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#rval}.
	 * @param ctx the parse tree
	 */
	void enterRval(ParserParser.RvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#rval}.
	 * @param ctx the parse tree
	 */
	void exitRval(ParserParser.RvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ParserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ParserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ParserParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ParserParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#c_op}.
	 * @param ctx the parse tree
	 */
	void enterC_op(ParserParser.C_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#c_op}.
	 * @param ctx the parse tree
	 */
	void exitC_op(ParserParser.C_opContext ctx);
}