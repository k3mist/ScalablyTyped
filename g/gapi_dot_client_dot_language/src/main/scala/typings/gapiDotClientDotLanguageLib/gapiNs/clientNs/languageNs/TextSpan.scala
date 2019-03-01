package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSpan extends js.Object {
  /**
    * The API calculates the beginning offset of the content in the original
    * document according to the EncodingType specified in the API request.
    */
  var beginOffset: js.UndefOr[scala.Double] = js.undefined
  /** The content of the output text. */
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object TextSpan {
  @scala.inline
  def apply(beginOffset: scala.Int | scala.Double = null, content: java.lang.String = null): TextSpan = {
    val __obj = js.Dynamic.literal()
    if (beginOffset != null) __obj.updateDynamic("beginOffset")(beginOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[TextSpan]
  }
}

