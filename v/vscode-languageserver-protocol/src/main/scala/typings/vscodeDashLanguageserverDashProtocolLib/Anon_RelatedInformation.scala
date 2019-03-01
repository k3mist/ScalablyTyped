package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RelatedInformation extends js.Object {
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Client supports the tag property to provide meta data about a diagnostic.
    */
  var tagSupport: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RelatedInformation {
  @scala.inline
  def apply(
    relatedInformation: js.UndefOr[scala.Boolean] = js.undefined,
    tagSupport: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_RelatedInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relatedInformation)) __obj.updateDynamic("relatedInformation")(relatedInformation)
    if (!js.isUndefined(tagSupport)) __obj.updateDynamic("tagSupport")(tagSupport)
    __obj.asInstanceOf[Anon_RelatedInformation]
  }
}

