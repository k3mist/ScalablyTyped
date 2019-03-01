package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyNumber
  extends CustomPropertyCommon
     with CustomProperty {
  var component: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_CustomPropertyNumber: qlikLib.qlikLibStrings.number
}

object CustomPropertyNumber {
  @scala.inline
  def apply(
    `type`: qlikLib.qlikLibStrings.number,
    component: java.lang.String = null,
    defaultValue: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyNumber = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (component != null) __obj.updateDynamic("component")(component)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyNumber]
  }
}

