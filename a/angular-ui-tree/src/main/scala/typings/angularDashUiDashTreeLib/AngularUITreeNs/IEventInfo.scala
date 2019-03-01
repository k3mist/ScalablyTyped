package typings
package angularDashUiDashTreeLib.AngularUITreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventInfo extends js.Object {
  var dest: angularDashUiDashTreeLib.Anon_Index
  var elements: js.Any
  var pos: IPosition
  var source: IEventSourceInfo
}

object IEventInfo {
  @scala.inline
  def apply(
    dest: angularDashUiDashTreeLib.Anon_Index,
    elements: js.Any,
    pos: IPosition,
    source: IEventSourceInfo
  ): IEventInfo = {
    val __obj = js.Dynamic.literal(dest = dest, elements = elements, pos = pos, source = source)
  
    __obj.asInstanceOf[IEventInfo]
  }
}

