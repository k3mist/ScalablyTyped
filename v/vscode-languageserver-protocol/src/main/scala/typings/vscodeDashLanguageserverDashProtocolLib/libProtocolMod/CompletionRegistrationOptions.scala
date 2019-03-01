package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with CompletionOptions

object CompletionRegistrationOptions {
  @scala.inline
  def apply(
    allCommitCharacters: js.Array[java.lang.String] = null,
    documentSelector: DocumentSelector = null,
    resolveProvider: js.UndefOr[scala.Boolean] = js.undefined,
    triggerCharacters: js.Array[java.lang.String] = null
  ): CompletionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (allCommitCharacters != null) __obj.updateDynamic("allCommitCharacters")(allCommitCharacters)
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider)
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters)
    __obj.asInstanceOf[CompletionRegistrationOptions]
  }
}

