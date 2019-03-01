package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowPrevious extends js.Object {
  var allowPrevious: js.UndefOr[scala.Boolean] = js.undefined
  var includeNonWordCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var wordRegex: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Anon_AllowPrevious {
  @scala.inline
  def apply(
    allowPrevious: js.UndefOr[scala.Boolean] = js.undefined,
    includeNonWordCharacters: js.UndefOr[scala.Boolean] = js.undefined,
    wordRegex: stdLib.RegExp = null
  ): Anon_AllowPrevious = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrevious)) __obj.updateDynamic("allowPrevious")(allowPrevious)
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters)
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex)
    __obj.asInstanceOf[Anon_AllowPrevious]
  }
}

