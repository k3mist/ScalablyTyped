package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  */
trait TimelineWall extends Control {
  /**
    * Refreshes the data displayed in a timelinewall and timer control.
    */
  def refresh(): scala.Unit
}

object TimelineWall {
  @scala.inline
  def apply(
    getControlType: js.Function0[ControlType | java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[Section],
    getVisible: js.Function0[scala.Boolean],
    refresh: js.Function0[scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = getControlType, getLabel = getLabel, getName = getName, getParent = getParent, getVisible = getVisible, refresh = refresh, setLabel = setLabel)
  
    __obj.asInstanceOf[TimelineWall]
  }
}

