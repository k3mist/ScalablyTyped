package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CatchClauseSyntax")
@js.native
class CatchClauseSyntax protected () extends SyntaxNode {
  def this(catchKeyword: ISyntaxToken, openParenToken: ISyntaxToken, identifier: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax, closeParenToken: ISyntaxToken, block: BlockSyntax, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var catchKeyword: ISyntaxToken = js.native
  var closeParenToken: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def update(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: BlockSyntax
  ): CatchClauseSyntax = js.native
  def withBlock(block: BlockSyntax): CatchClauseSyntax = js.native
  def withCatchKeyword(catchKeyword: ISyntaxToken): CatchClauseSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): CatchClauseSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): CatchClauseSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): CatchClauseSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): CatchClauseSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.CatchClauseSyntax")
@js.native
object CatchClauseSyntax extends js.Object {
  def create(
    catchKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax = js.native
  def create1(identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax = js.native
}

