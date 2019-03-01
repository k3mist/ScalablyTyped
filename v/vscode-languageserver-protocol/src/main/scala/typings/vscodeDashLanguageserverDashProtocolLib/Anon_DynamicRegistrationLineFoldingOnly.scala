package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistrationLineFoldingOnly extends js.Object {
  /**
    * Whether implementation supports dynamic registration for folding range providers. If this is set to `true`
    * the client supports the new `(FoldingRangeProviderOptions & TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, the client signals that it only supports folding complete lines. If set, client will
    * ignore specified `startCharacter` and `endCharacter` properties in a FoldingRange.
    */
  var lineFoldingOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum number of folding ranges that the client prefers to receive per document. The value serves as a
    * hint, servers are free to follow the limit.
    */
  var rangeLimit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DynamicRegistrationLineFoldingOnly {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined,
    lineFoldingOnly: js.UndefOr[scala.Boolean] = js.undefined,
    rangeLimit: scala.Int | scala.Double = null
  ): Anon_DynamicRegistrationLineFoldingOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    if (!js.isUndefined(lineFoldingOnly)) __obj.updateDynamic("lineFoldingOnly")(lineFoldingOnly)
    if (rangeLimit != null) __obj.updateDynamic("rangeLimit")(rangeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DynamicRegistrationLineFoldingOnly]
  }
}

