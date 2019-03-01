package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializationSettings extends js.Object {
  /** defines whether the default diagram properties can be serialized or not.
    * @Default {false}
    */
  var preventDefaultValues: js.UndefOr[scala.Boolean] = js.undefined
}

object SerializationSettings {
  @scala.inline
  def apply(preventDefaultValues: js.UndefOr[scala.Boolean] = js.undefined): SerializationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventDefaultValues)) __obj.updateDynamic("preventDefaultValues")(preventDefaultValues)
    __obj.asInstanceOf[SerializationSettings]
  }
}

