package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyButton
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.button
  def action(data: VisualizationOptions): scala.Unit
}

