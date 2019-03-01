package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationMetadata extends js.Object {
  /** App Engine Flexible Environment is available in the given location.@OutputOnly */
  var flexibleEnvironmentAvailable: js.UndefOr[scala.Boolean] = js.undefined
  /** App Engine Standard Environment is available in the given location.@OutputOnly */
  var standardEnvironmentAvailable: js.UndefOr[scala.Boolean] = js.undefined
}

object LocationMetadata {
  @scala.inline
  def apply(
    flexibleEnvironmentAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    standardEnvironmentAvailable: js.UndefOr[scala.Boolean] = js.undefined
  ): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flexibleEnvironmentAvailable)) __obj.updateDynamic("flexibleEnvironmentAvailable")(flexibleEnvironmentAvailable)
    if (!js.isUndefined(standardEnvironmentAvailable)) __obj.updateDynamic("standardEnvironmentAvailable")(standardEnvironmentAvailable)
    __obj.asInstanceOf[LocationMetadata]
  }
}

