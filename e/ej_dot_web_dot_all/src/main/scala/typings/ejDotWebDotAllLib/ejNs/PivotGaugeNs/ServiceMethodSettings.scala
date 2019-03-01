package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows the user to set the custom name for the service method responsible for initializing PivotGauge.
    * @Default {InitializeGauge}
    */
  var initialize: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(initialize: java.lang.String = null): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

