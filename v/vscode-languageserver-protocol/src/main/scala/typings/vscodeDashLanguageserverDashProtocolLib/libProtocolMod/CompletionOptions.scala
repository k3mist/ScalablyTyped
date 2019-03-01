package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionOptions extends js.Object {
  /**
    * The list of all possible characters that commit a completion. This field can be used
    * if clients don't support individual commmit characters per completion item. See
    * `ClientCapabilities.textDocument.completion.completionItem.commitCharactersSupport`
    */
  var allCommitCharacters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The server provides support to resolve additional
    * information for a completion item.
    */
  var resolveProvider: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Most tools trigger completion request automatically without explicitly requesting
    * it using a keyboard shortcut (e.g. Ctrl+Space). Typically they do so when the user
    * starts to type an identifier. For example if the user types `c` in a JavaScript file
    * code complete will automatically pop up present `console` besides others as a
    * completion item. Characters that make up identifiers don't need to be listed here.
    *
    * If code complete should automatically be trigger on characters not being valid inside
    * an identifier (for example `.` in JavaScript) list them in `triggerCharacters`.
    */
  var triggerCharacters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CompletionOptions {
  @scala.inline
  def apply(
    allCommitCharacters: js.Array[java.lang.String] = null,
    resolveProvider: js.UndefOr[scala.Boolean] = js.undefined,
    triggerCharacters: js.Array[java.lang.String] = null
  ): CompletionOptions = {
    val __obj = js.Dynamic.literal()
    if (allCommitCharacters != null) __obj.updateDynamic("allCommitCharacters")(allCommitCharacters)
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider)
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters)
    __obj.asInstanceOf[CompletionOptions]
  }
}

