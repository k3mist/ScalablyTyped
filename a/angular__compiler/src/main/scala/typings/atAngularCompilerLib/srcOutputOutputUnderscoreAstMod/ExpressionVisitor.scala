package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionVisitor extends js.Object {
  def visitAssertNotNullExpr(ast: AssertNotNull, context: js.Any): js.Any
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any
  def visitCastExpr(ast: CastExpr, context: js.Any): js.Any
  def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any
  def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any
  def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any
  def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any
  def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any
  def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any
  def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any
  def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any
  def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any
  def visitNotExpr(ast: NotExpr, context: js.Any): js.Any
  def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any
  def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any
  def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any
  def visitTypeofExpr(ast: TypeofExpr, context: js.Any): js.Any
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any
  def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any
  def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any
  def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any
}

object ExpressionVisitor {
  @scala.inline
  def apply(
    visitAssertNotNullExpr: (AssertNotNull, js.Any) => js.Any,
    visitBinaryOperatorExpr: (BinaryOperatorExpr, js.Any) => js.Any,
    visitCastExpr: (CastExpr, js.Any) => js.Any,
    visitCommaExpr: (CommaExpr, js.Any) => js.Any,
    visitConditionalExpr: (ConditionalExpr, js.Any) => js.Any,
    visitExternalExpr: (ExternalExpr, js.Any) => js.Any,
    visitFunctionExpr: (FunctionExpr, js.Any) => js.Any,
    visitInstantiateExpr: (InstantiateExpr, js.Any) => js.Any,
    visitInvokeFunctionExpr: (InvokeFunctionExpr, js.Any) => js.Any,
    visitInvokeMethodExpr: (InvokeMethodExpr, js.Any) => js.Any,
    visitLiteralArrayExpr: (LiteralArrayExpr, js.Any) => js.Any,
    visitLiteralExpr: (LiteralExpr, js.Any) => js.Any,
    visitLiteralMapExpr: (LiteralMapExpr, js.Any) => js.Any,
    visitNotExpr: (NotExpr, js.Any) => js.Any,
    visitReadKeyExpr: (ReadKeyExpr, js.Any) => js.Any,
    visitReadPropExpr: (ReadPropExpr, js.Any) => js.Any,
    visitReadVarExpr: (ReadVarExpr, js.Any) => js.Any,
    visitTypeofExpr: (TypeofExpr, js.Any) => js.Any,
    visitWrappedNodeExpr: (WrappedNodeExpr[_], js.Any) => js.Any,
    visitWriteKeyExpr: (WriteKeyExpr, js.Any) => js.Any,
    visitWritePropExpr: (WritePropExpr, js.Any) => js.Any,
    visitWriteVarExpr: (WriteVarExpr, js.Any) => js.Any
  ): ExpressionVisitor = {
    val __obj = js.Dynamic.literal(visitAssertNotNullExpr = js.Any.fromFunction2(visitAssertNotNullExpr), visitBinaryOperatorExpr = js.Any.fromFunction2(visitBinaryOperatorExpr), visitCastExpr = js.Any.fromFunction2(visitCastExpr), visitCommaExpr = js.Any.fromFunction2(visitCommaExpr), visitConditionalExpr = js.Any.fromFunction2(visitConditionalExpr), visitExternalExpr = js.Any.fromFunction2(visitExternalExpr), visitFunctionExpr = js.Any.fromFunction2(visitFunctionExpr), visitInstantiateExpr = js.Any.fromFunction2(visitInstantiateExpr), visitInvokeFunctionExpr = js.Any.fromFunction2(visitInvokeFunctionExpr), visitInvokeMethodExpr = js.Any.fromFunction2(visitInvokeMethodExpr), visitLiteralArrayExpr = js.Any.fromFunction2(visitLiteralArrayExpr), visitLiteralExpr = js.Any.fromFunction2(visitLiteralExpr), visitLiteralMapExpr = js.Any.fromFunction2(visitLiteralMapExpr), visitNotExpr = js.Any.fromFunction2(visitNotExpr), visitReadKeyExpr = js.Any.fromFunction2(visitReadKeyExpr), visitReadPropExpr = js.Any.fromFunction2(visitReadPropExpr), visitReadVarExpr = js.Any.fromFunction2(visitReadVarExpr), visitTypeofExpr = js.Any.fromFunction2(visitTypeofExpr), visitWrappedNodeExpr = js.Any.fromFunction2(visitWrappedNodeExpr), visitWriteKeyExpr = js.Any.fromFunction2(visitWriteKeyExpr), visitWritePropExpr = js.Any.fromFunction2(visitWritePropExpr), visitWriteVarExpr = js.Any.fromFunction2(visitWriteVarExpr))
  
    __obj.asInstanceOf[ExpressionVisitor]
  }
}

