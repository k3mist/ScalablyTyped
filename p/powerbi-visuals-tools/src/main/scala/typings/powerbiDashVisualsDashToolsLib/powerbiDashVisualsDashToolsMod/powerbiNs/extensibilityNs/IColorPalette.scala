package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPalette extends js.Object {
  def getColor(key: java.lang.String): powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IColorInfo
}

object IColorPalette {
  @scala.inline
  def apply(
    getColor: java.lang.String => powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.IColorInfo
  ): IColorPalette = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction1(getColor))
  
    __obj.asInstanceOf[IColorPalette]
  }
}

