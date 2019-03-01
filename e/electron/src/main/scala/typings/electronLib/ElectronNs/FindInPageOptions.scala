package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindInPageOptions extends js.Object {
  /**
    * Whether the operation is first request or a follow up, defaults to false.
    */
  var findNext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to search forward or backward, defaults to true.
    */
  var forward: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether search should be case-sensitive, defaults to false.
    */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When combined with wordStart, accepts a match in the middle of a word if the
    * match begins with an uppercase letter followed by a lowercase or non-letter.
    * Accepts several other intra-word matches, defaults to false.
    */
  var medialCapitalAsWordStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to look only at the start of words. defaults to false.
    */
  var wordStart: js.UndefOr[scala.Boolean] = js.undefined
}

object FindInPageOptions {
  @scala.inline
  def apply(
    findNext: js.UndefOr[scala.Boolean] = js.undefined,
    forward: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined,
    medialCapitalAsWordStart: js.UndefOr[scala.Boolean] = js.undefined,
    wordStart: js.UndefOr[scala.Boolean] = js.undefined
  ): FindInPageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(findNext)) __obj.updateDynamic("findNext")(findNext)
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (!js.isUndefined(medialCapitalAsWordStart)) __obj.updateDynamic("medialCapitalAsWordStart")(medialCapitalAsWordStart)
    if (!js.isUndefined(wordStart)) __obj.updateDynamic("wordStart")(wordStart)
    __obj.asInstanceOf[FindInPageOptions]
  }
}

