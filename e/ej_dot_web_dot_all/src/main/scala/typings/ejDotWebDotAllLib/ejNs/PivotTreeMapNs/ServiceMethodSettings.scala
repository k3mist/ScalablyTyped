package typings
package ejDotWebDotAllLib.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows the user to set the custom name for the service method responsible for drilling up/down operation in PivotTreeMap.
    * @Default {DrillTreeMap}
    */
  var drillDown: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to set the custom name for the service method responsible for initializing PivotTreeMap.
    * @Default {InitializeTreemap}
    */
  var initialize: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(drillDown: java.lang.String = null, initialize: java.lang.String = null): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (drillDown != null) __obj.updateDynamic("drillDown")(drillDown)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

