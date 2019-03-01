package typings
package xrmLib.XrmNs.PageNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
  * the ViewSelector.setCurrentView method.
  * @deprecated Use {@link Xrm.Controls.ViewSelectorItem} instead.
  */
trait ViewSelectorItem
  extends xrmLib.XrmNs.ControlsNs.ViewSelectorItem

object ViewSelectorItem {
  @scala.inline
  def apply(getEntityReference: js.Function0[xrmLib.XrmNs.LookupValue]): ViewSelectorItem = {
    val __obj = js.Dynamic.literal(getEntityReference = getEntityReference)
  
    __obj.asInstanceOf[ViewSelectorItem]
  }
}

