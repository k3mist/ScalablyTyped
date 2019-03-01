package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxVisitor extends js.Object {
  def visitArgumentList(node: ArgumentListSyntax): js.Any
  def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any
  def visitArrayType(node: ArrayTypeSyntax): js.Any
  def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any
  def visitBlock(node: BlockSyntax): js.Any
  def visitBreakStatement(node: BreakStatementSyntax): js.Any
  def visitCallSignature(node: CallSignatureSyntax): js.Any
  def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any
  def visitCastExpression(node: CastExpressionSyntax): js.Any
  def visitCatchClause(node: CatchClauseSyntax): js.Any
  def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any
  def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any
  def visitConstraint(node: ConstraintSyntax): js.Any
  def visitConstructSignature(node: ConstructSignatureSyntax): js.Any
  def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any
  def visitConstructorType(node: ConstructorTypeSyntax): js.Any
  def visitContinueStatement(node: ContinueStatementSyntax): js.Any
  def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any
  def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any
  def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any
  def visitDoStatement(node: DoStatementSyntax): js.Any
  def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any
  def visitElseClause(node: ElseClauseSyntax): js.Any
  def visitEmptyStatement(node: EmptyStatementSyntax): js.Any
  def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any
  def visitEnumElement(node: EnumElementSyntax): js.Any
  def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any
  def visitExportAssignment(node: ExportAssignmentSyntax): js.Any
  def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any
  def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any
  def visitFinallyClause(node: FinallyClauseSyntax): js.Any
  def visitForInStatement(node: ForInStatementSyntax): js.Any
  def visitForStatement(node: ForStatementSyntax): js.Any
  def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any
  def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any
  def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any
  def visitFunctionType(node: FunctionTypeSyntax): js.Any
  def visitGenericType(node: GenericTypeSyntax): js.Any
  def visitGetAccessor(node: GetAccessorSyntax): js.Any
  def visitHeritageClause(node: HeritageClauseSyntax): js.Any
  def visitIfStatement(node: IfStatementSyntax): js.Any
  def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any
  def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any
  def visitIndexSignature(node: IndexSignatureSyntax): js.Any
  def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any
  def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any
  def visitLabeledStatement(node: LabeledStatementSyntax): js.Any
  def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any
  def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any
  def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any
  def visitMethodSignature(node: MethodSignatureSyntax): js.Any
  def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any
  def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any
  def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any
  def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any
  def visitObjectType(node: ObjectTypeSyntax): js.Any
  def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any
  def visitParameter(node: ParameterSyntax): js.Any
  def visitParameterList(node: ParameterListSyntax): js.Any
  def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any
  def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any
  def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any
  def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any
  def visitPropertySignature(node: PropertySignatureSyntax): js.Any
  def visitQualifiedName(node: QualifiedNameSyntax): js.Any
  def visitReturnStatement(node: ReturnStatementSyntax): js.Any
  def visitSetAccessor(node: SetAccessorSyntax): js.Any
  def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any
  def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any
  def visitSourceUnit(node: SourceUnitSyntax): js.Any
  def visitSwitchStatement(node: SwitchStatementSyntax): js.Any
  def visitThrowStatement(node: ThrowStatementSyntax): js.Any
  def visitToken(token: ISyntaxToken): js.Any
  def visitTryStatement(node: TryStatementSyntax): js.Any
  def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any
  def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any
  def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any
  def visitTypeParameter(node: TypeParameterSyntax): js.Any
  def visitTypeParameterList(node: TypeParameterListSyntax): js.Any
  def visitTypeQuery(node: TypeQuerySyntax): js.Any
  def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any
  def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any
  def visitVariableStatement(node: VariableStatementSyntax): js.Any
  def visitVoidExpression(node: VoidExpressionSyntax): js.Any
  def visitWhileStatement(node: WhileStatementSyntax): js.Any
  def visitWithStatement(node: WithStatementSyntax): js.Any
}

object ISyntaxVisitor {
  @scala.inline
  def apply(
    visitArgumentList: js.Function1[ArgumentListSyntax, js.Any],
    visitArrayLiteralExpression: js.Function1[ArrayLiteralExpressionSyntax, js.Any],
    visitArrayType: js.Function1[ArrayTypeSyntax, js.Any],
    visitBinaryExpression: js.Function1[BinaryExpressionSyntax, js.Any],
    visitBlock: js.Function1[BlockSyntax, js.Any],
    visitBreakStatement: js.Function1[BreakStatementSyntax, js.Any],
    visitCallSignature: js.Function1[CallSignatureSyntax, js.Any],
    visitCaseSwitchClause: js.Function1[CaseSwitchClauseSyntax, js.Any],
    visitCastExpression: js.Function1[CastExpressionSyntax, js.Any],
    visitCatchClause: js.Function1[CatchClauseSyntax, js.Any],
    visitClassDeclaration: js.Function1[ClassDeclarationSyntax, js.Any],
    visitConditionalExpression: js.Function1[ConditionalExpressionSyntax, js.Any],
    visitConstraint: js.Function1[ConstraintSyntax, js.Any],
    visitConstructSignature: js.Function1[ConstructSignatureSyntax, js.Any],
    visitConstructorDeclaration: js.Function1[ConstructorDeclarationSyntax, js.Any],
    visitConstructorType: js.Function1[ConstructorTypeSyntax, js.Any],
    visitContinueStatement: js.Function1[ContinueStatementSyntax, js.Any],
    visitDebuggerStatement: js.Function1[DebuggerStatementSyntax, js.Any],
    visitDefaultSwitchClause: js.Function1[DefaultSwitchClauseSyntax, js.Any],
    visitDeleteExpression: js.Function1[DeleteExpressionSyntax, js.Any],
    visitDoStatement: js.Function1[DoStatementSyntax, js.Any],
    visitElementAccessExpression: js.Function1[ElementAccessExpressionSyntax, js.Any],
    visitElseClause: js.Function1[ElseClauseSyntax, js.Any],
    visitEmptyStatement: js.Function1[EmptyStatementSyntax, js.Any],
    visitEnumDeclaration: js.Function1[EnumDeclarationSyntax, js.Any],
    visitEnumElement: js.Function1[EnumElementSyntax, js.Any],
    visitEqualsValueClause: js.Function1[EqualsValueClauseSyntax, js.Any],
    visitExportAssignment: js.Function1[ExportAssignmentSyntax, js.Any],
    visitExpressionStatement: js.Function1[ExpressionStatementSyntax, js.Any],
    visitExternalModuleReference: js.Function1[ExternalModuleReferenceSyntax, js.Any],
    visitFinallyClause: js.Function1[FinallyClauseSyntax, js.Any],
    visitForInStatement: js.Function1[ForInStatementSyntax, js.Any],
    visitForStatement: js.Function1[ForStatementSyntax, js.Any],
    visitFunctionDeclaration: js.Function1[FunctionDeclarationSyntax, js.Any],
    visitFunctionExpression: js.Function1[FunctionExpressionSyntax, js.Any],
    visitFunctionPropertyAssignment: js.Function1[FunctionPropertyAssignmentSyntax, js.Any],
    visitFunctionType: js.Function1[FunctionTypeSyntax, js.Any],
    visitGenericType: js.Function1[GenericTypeSyntax, js.Any],
    visitGetAccessor: js.Function1[GetAccessorSyntax, js.Any],
    visitHeritageClause: js.Function1[HeritageClauseSyntax, js.Any],
    visitIfStatement: js.Function1[IfStatementSyntax, js.Any],
    visitImportDeclaration: js.Function1[ImportDeclarationSyntax, js.Any],
    visitIndexMemberDeclaration: js.Function1[IndexMemberDeclarationSyntax, js.Any],
    visitIndexSignature: js.Function1[IndexSignatureSyntax, js.Any],
    visitInterfaceDeclaration: js.Function1[InterfaceDeclarationSyntax, js.Any],
    visitInvocationExpression: js.Function1[InvocationExpressionSyntax, js.Any],
    visitLabeledStatement: js.Function1[LabeledStatementSyntax, js.Any],
    visitMemberAccessExpression: js.Function1[MemberAccessExpressionSyntax, js.Any],
    visitMemberFunctionDeclaration: js.Function1[MemberFunctionDeclarationSyntax, js.Any],
    visitMemberVariableDeclaration: js.Function1[MemberVariableDeclarationSyntax, js.Any],
    visitMethodSignature: js.Function1[MethodSignatureSyntax, js.Any],
    visitModuleDeclaration: js.Function1[ModuleDeclarationSyntax, js.Any],
    visitModuleNameModuleReference: js.Function1[ModuleNameModuleReferenceSyntax, js.Any],
    visitObjectCreationExpression: js.Function1[ObjectCreationExpressionSyntax, js.Any],
    visitObjectLiteralExpression: js.Function1[ObjectLiteralExpressionSyntax, js.Any],
    visitObjectType: js.Function1[ObjectTypeSyntax, js.Any],
    visitOmittedExpression: js.Function1[OmittedExpressionSyntax, js.Any],
    visitParameter: js.Function1[ParameterSyntax, js.Any],
    visitParameterList: js.Function1[ParameterListSyntax, js.Any],
    visitParenthesizedArrowFunctionExpression: js.Function1[ParenthesizedArrowFunctionExpressionSyntax, js.Any],
    visitParenthesizedExpression: js.Function1[ParenthesizedExpressionSyntax, js.Any],
    visitPostfixUnaryExpression: js.Function1[PostfixUnaryExpressionSyntax, js.Any],
    visitPrefixUnaryExpression: js.Function1[PrefixUnaryExpressionSyntax, js.Any],
    visitPropertySignature: js.Function1[PropertySignatureSyntax, js.Any],
    visitQualifiedName: js.Function1[QualifiedNameSyntax, js.Any],
    visitReturnStatement: js.Function1[ReturnStatementSyntax, js.Any],
    visitSetAccessor: js.Function1[SetAccessorSyntax, js.Any],
    visitSimpleArrowFunctionExpression: js.Function1[SimpleArrowFunctionExpressionSyntax, js.Any],
    visitSimplePropertyAssignment: js.Function1[SimplePropertyAssignmentSyntax, js.Any],
    visitSourceUnit: js.Function1[SourceUnitSyntax, js.Any],
    visitSwitchStatement: js.Function1[SwitchStatementSyntax, js.Any],
    visitThrowStatement: js.Function1[ThrowStatementSyntax, js.Any],
    visitToken: js.Function1[ISyntaxToken, js.Any],
    visitTryStatement: js.Function1[TryStatementSyntax, js.Any],
    visitTypeAnnotation: js.Function1[TypeAnnotationSyntax, js.Any],
    visitTypeArgumentList: js.Function1[TypeArgumentListSyntax, js.Any],
    visitTypeOfExpression: js.Function1[TypeOfExpressionSyntax, js.Any],
    visitTypeParameter: js.Function1[TypeParameterSyntax, js.Any],
    visitTypeParameterList: js.Function1[TypeParameterListSyntax, js.Any],
    visitTypeQuery: js.Function1[TypeQuerySyntax, js.Any],
    visitVariableDeclaration: js.Function1[VariableDeclarationSyntax, js.Any],
    visitVariableDeclarator: js.Function1[VariableDeclaratorSyntax, js.Any],
    visitVariableStatement: js.Function1[VariableStatementSyntax, js.Any],
    visitVoidExpression: js.Function1[VoidExpressionSyntax, js.Any],
    visitWhileStatement: js.Function1[WhileStatementSyntax, js.Any],
    visitWithStatement: js.Function1[WithStatementSyntax, js.Any]
  ): ISyntaxVisitor = {
    val __obj = js.Dynamic.literal(visitArgumentList = visitArgumentList, visitArrayLiteralExpression = visitArrayLiteralExpression, visitArrayType = visitArrayType, visitBinaryExpression = visitBinaryExpression, visitBlock = visitBlock, visitBreakStatement = visitBreakStatement, visitCallSignature = visitCallSignature, visitCaseSwitchClause = visitCaseSwitchClause, visitCastExpression = visitCastExpression, visitCatchClause = visitCatchClause, visitClassDeclaration = visitClassDeclaration, visitConditionalExpression = visitConditionalExpression, visitConstraint = visitConstraint, visitConstructSignature = visitConstructSignature, visitConstructorDeclaration = visitConstructorDeclaration, visitConstructorType = visitConstructorType, visitContinueStatement = visitContinueStatement, visitDebuggerStatement = visitDebuggerStatement, visitDefaultSwitchClause = visitDefaultSwitchClause, visitDeleteExpression = visitDeleteExpression, visitDoStatement = visitDoStatement, visitElementAccessExpression = visitElementAccessExpression, visitElseClause = visitElseClause, visitEmptyStatement = visitEmptyStatement, visitEnumDeclaration = visitEnumDeclaration, visitEnumElement = visitEnumElement, visitEqualsValueClause = visitEqualsValueClause, visitExportAssignment = visitExportAssignment, visitExpressionStatement = visitExpressionStatement, visitExternalModuleReference = visitExternalModuleReference, visitFinallyClause = visitFinallyClause, visitForInStatement = visitForInStatement, visitForStatement = visitForStatement, visitFunctionDeclaration = visitFunctionDeclaration, visitFunctionExpression = visitFunctionExpression, visitFunctionPropertyAssignment = visitFunctionPropertyAssignment, visitFunctionType = visitFunctionType, visitGenericType = visitGenericType, visitGetAccessor = visitGetAccessor, visitHeritageClause = visitHeritageClause, visitIfStatement = visitIfStatement, visitImportDeclaration = visitImportDeclaration, visitIndexMemberDeclaration = visitIndexMemberDeclaration, visitIndexSignature = visitIndexSignature, visitInterfaceDeclaration = visitInterfaceDeclaration, visitInvocationExpression = visitInvocationExpression, visitLabeledStatement = visitLabeledStatement, visitMemberAccessExpression = visitMemberAccessExpression, visitMemberFunctionDeclaration = visitMemberFunctionDeclaration, visitMemberVariableDeclaration = visitMemberVariableDeclaration, visitMethodSignature = visitMethodSignature, visitModuleDeclaration = visitModuleDeclaration, visitModuleNameModuleReference = visitModuleNameModuleReference, visitObjectCreationExpression = visitObjectCreationExpression, visitObjectLiteralExpression = visitObjectLiteralExpression, visitObjectType = visitObjectType, visitOmittedExpression = visitOmittedExpression, visitParameter = visitParameter, visitParameterList = visitParameterList, visitParenthesizedArrowFunctionExpression = visitParenthesizedArrowFunctionExpression, visitParenthesizedExpression = visitParenthesizedExpression, visitPostfixUnaryExpression = visitPostfixUnaryExpression, visitPrefixUnaryExpression = visitPrefixUnaryExpression, visitPropertySignature = visitPropertySignature, visitQualifiedName = visitQualifiedName, visitReturnStatement = visitReturnStatement, visitSetAccessor = visitSetAccessor, visitSimpleArrowFunctionExpression = visitSimpleArrowFunctionExpression, visitSimplePropertyAssignment = visitSimplePropertyAssignment, visitSourceUnit = visitSourceUnit, visitSwitchStatement = visitSwitchStatement, visitThrowStatement = visitThrowStatement, visitToken = visitToken, visitTryStatement = visitTryStatement, visitTypeAnnotation = visitTypeAnnotation, visitTypeArgumentList = visitTypeArgumentList, visitTypeOfExpression = visitTypeOfExpression, visitTypeParameter = visitTypeParameter, visitTypeParameterList = visitTypeParameterList, visitTypeQuery = visitTypeQuery, visitVariableDeclaration = visitVariableDeclaration, visitVariableDeclarator = visitVariableDeclarator, visitVariableStatement = visitVariableStatement, visitVoidExpression = visitVoidExpression, visitWhileStatement = visitWhileStatement, visitWithStatement = visitWithStatement)
  
    __obj.asInstanceOf[ISyntaxVisitor]
  }
}

