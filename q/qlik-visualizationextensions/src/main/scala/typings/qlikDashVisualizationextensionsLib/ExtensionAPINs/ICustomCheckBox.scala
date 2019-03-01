package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomCheckBox extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.checkbox
  var defaultValue: scala.Boolean
}

object ICustomCheckBox {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.checkbox,
    defaultValue: scala.Boolean,
    label: java.lang.String,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomCheckBox = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, ref = ref, `type` = `type`)
  
    __obj.asInstanceOf[ICustomCheckBox]
  }
}

