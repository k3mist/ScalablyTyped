package typings
package tslintLib.libTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOutput extends js.Object {
  var errorsFromLinter: js.Array[tslintLib.libVerifyLintErrorMod.LintError]
  var errorsFromMarkup: js.Array[tslintLib.libVerifyLintErrorMod.LintError]
  var fixesFromLinter: java.lang.String
  var fixesFromMarkup: java.lang.String
  var markupFromLinter: java.lang.String
  var markupFromMarkup: java.lang.String
  var skipped: tslintLib.tslintLibNumbers.`false`
}

object TestOutput {
  @scala.inline
  def apply(
    errorsFromLinter: js.Array[tslintLib.libVerifyLintErrorMod.LintError],
    errorsFromMarkup: js.Array[tslintLib.libVerifyLintErrorMod.LintError],
    fixesFromLinter: java.lang.String,
    fixesFromMarkup: java.lang.String,
    markupFromLinter: java.lang.String,
    markupFromMarkup: java.lang.String,
    skipped: tslintLib.tslintLibNumbers.`false`
  ): TestOutput = {
    val __obj = js.Dynamic.literal(errorsFromLinter = errorsFromLinter, errorsFromMarkup = errorsFromMarkup, fixesFromLinter = fixesFromLinter, fixesFromMarkup = fixesFromMarkup, markupFromLinter = markupFromLinter, markupFromMarkup = markupFromMarkup, skipped = skipped)
  
    __obj.asInstanceOf[TestOutput]
  }
}

