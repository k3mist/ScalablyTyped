package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Silverlight control.
  * @see {@link Control}
  * @deprecated Use {@link Xrm.Controls.SilverlightControl} instead.
  */
trait SilverlightControl
  extends xrmLib.XrmNs.ControlsNs.SilverlightControl

object SilverlightControl {
  @scala.inline
  def apply(
    getControlType: js.Function0[xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String],
    getData: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getObject: js.Function0[stdLib.HTMLObjectElement],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Section],
    getVisible: js.Function0[scala.Boolean],
    setData: js.Function1[java.lang.String, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal(getControlType = getControlType, getData = getData, getLabel = getLabel, getName = getName, getObject = getObject, getParent = getParent, getVisible = getVisible, setData = setData, setLabel = setLabel)
  
    __obj.asInstanceOf[SilverlightControl]
  }
}

