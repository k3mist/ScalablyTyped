package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsListResponse extends js.Object {
  /** Floodlight configuration collection. */
  var floodlightConfigurations: js.UndefOr[js.Array[FloodlightConfiguration]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightConfigurationsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightConfigurationsListResponse {
  @scala.inline
  def apply(floodlightConfigurations: js.Array[FloodlightConfiguration] = null, kind: java.lang.String = null): FloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightConfigurations != null) __obj.updateDynamic("floodlightConfigurations")(floodlightConfigurations)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[FloodlightConfigurationsListResponse]
  }
}

