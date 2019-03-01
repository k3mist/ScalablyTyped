package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlight extends js.Object {
  /**
    * The highlight kind, default is [text](#DocumentHighlightKind.Text).
    */
  var kind: js.UndefOr[DocumentHighlightKind] = js.undefined
  /**
    * The range this highlight applies to.
    */
  var range: Range
}

object DocumentHighlight {
  @scala.inline
  def apply(range: Range, kind: DocumentHighlightKind = null): DocumentHighlight = {
    val __obj = js.Dynamic.literal(range = range)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DocumentHighlight]
  }
}

