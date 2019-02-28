package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyColorPicker
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.`color-picker`
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyColorPicker: qlikLib.qlikLibStrings.integer
}

