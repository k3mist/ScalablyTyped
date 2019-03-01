package typings
package reactDashHighlightDashWordsLib.reactDashHighlightDashWordsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindChunks extends js.Object {
  var autoEscape: js.UndefOr[scala.Boolean] = js.undefined
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var sanitize: js.UndefOr[js.Function1[/* text */ java.lang.String, java.lang.String]] = js.undefined
  var searchWords: js.Array[java.lang.String]
  var textToHighlight: java.lang.String
}

object FindChunks {
  @scala.inline
  def apply(
    searchWords: js.Array[java.lang.String],
    textToHighlight: java.lang.String,
    autoEscape: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    sanitize: js.Function1[/* text */ java.lang.String, java.lang.String] = null
  ): FindChunks = {
    val __obj = js.Dynamic.literal(searchWords = searchWords, textToHighlight = textToHighlight)
    if (!js.isUndefined(autoEscape)) __obj.updateDynamic("autoEscape")(autoEscape)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize)
    __obj.asInstanceOf[FindChunks]
  }
}

