package typings
package fullcalendarLib.toolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Toolbar", "Default")
@js.native
class Default protected () extends js.Object {
  def this(calendar: js.Any, toolbarOptions: js.Any) = this()
  var calendar: js.Any = js.native
  var el: js.Any = js.native
  var toolbarOptions: js.Any = js.native
  var viewsWithButtons: js.Any = js.native
  def activateButton(buttonName: js.Any): scala.Unit = js.native
  def deactivateButton(buttonName: js.Any): scala.Unit = js.native
  def disableButton(buttonName: js.Any): scala.Unit = js.native
  def enableButton(buttonName: js.Any): scala.Unit = js.native
  def getViewsWithButtons(): js.Any = js.native
  def removeElement(): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def renderSection(position: js.Any): fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery = js.native
  def setToolbarOptions(newToolbarOptions: js.Any): scala.Unit = js.native
  def updateTitle(text: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/Toolbar", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any, toolbarOptions: js.Any) = this()
}

