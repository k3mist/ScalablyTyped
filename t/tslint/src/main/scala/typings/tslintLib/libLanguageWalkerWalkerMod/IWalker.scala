package typings
package tslintLib.libLanguageWalkerWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWalker extends js.Object {
  def getFailures(): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  def getSourceFile(): typescriptLib.typescriptMod.tsNs.SourceFile
  def walk(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): scala.Unit
}

object IWalker {
  @scala.inline
  def apply(
    getFailures: () => js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure],
    getSourceFile: () => typescriptLib.typescriptMod.tsNs.SourceFile,
    walk: typescriptLib.typescriptMod.tsNs.SourceFile => scala.Unit
  ): IWalker = {
    val __obj = js.Dynamic.literal(getFailures = js.Any.fromFunction0(getFailures), getSourceFile = js.Any.fromFunction0(getSourceFile), walk = js.Any.fromFunction1(walk))
  
    __obj.asInstanceOf[IWalker]
  }
}

