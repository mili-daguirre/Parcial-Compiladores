import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class EvalVisitor extends CalcScriptBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<>();

    @Override
    public Double visitAssignment(CalcScriptParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Double visitPrint(CalcScriptParser.PrintContext ctx) {
        double value = visit(ctx.expr());
        System.out.println(value);
        return 0.0;
    }

    @Override
    public Double visitAdd(CalcScriptParser.AddContext ctx) {
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
    }

    @Override
    public Double visitSub(CalcScriptParser.SubContext ctx) {
        return visit(ctx.expr(0)) - visit(ctx.expr(1));
    }

    @Override
    public Double visitMul(CalcScriptParser.MulContext ctx) {
        return visit(ctx.expr(0)) * visit(ctx.expr(1));
    }

    @Override
    public Double visitDiv(CalcScriptParser.DivContext ctx) {
        return visit(ctx.expr(0)) / visit(ctx.expr(1));
    }

    @Override
    public Double visitPow(CalcScriptParser.PowContext ctx) {
        return Math.pow(visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public Double visitNeg(CalcScriptParser.NegContext ctx) {
        return -visit(ctx.expr());
    }

    @Override
    public Double visitAtomExpr(CalcScriptParser.AtomExprContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Double visitParens(CalcScriptParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitNumber(CalcScriptParser.NumberContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override
    public Double visitVariable(CalcScriptParser.VariableContext ctx) {
        String id = ctx.getText();
        return memory.getOrDefault(id, 0.0);
    }

    @Override
    public Double visitFunctionCall(CalcScriptParser.FunctionCallContext ctx) {
        String func = ctx.function().getChild(0).getText();
        double arg = visit(ctx.function().expr());

        return switch (func) {
            case "sin" -> Math.sin(arg);
            case "cos" -> Math.cos(arg);
            case "sqrt" -> Math.sqrt(arg);
            default -> 0.0;
        };
    }
}
