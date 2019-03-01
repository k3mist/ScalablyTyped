package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryManager[TCacheShape] extends js.Object {
  var queryManager: apolloDashClientLib.coreQueryManagerMod.QueryManager[TCacheShape]
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_QueryManager {
  @scala.inline
  def apply[TCacheShape](
    queryManager: apolloDashClientLib.coreQueryManagerMod.QueryManager[TCacheShape],
    ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_QueryManager[TCacheShape] = {
    val __obj = js.Dynamic.literal(queryManager = queryManager)
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode)
    __obj.asInstanceOf[Anon_QueryManager[TCacheShape]]
  }
}

