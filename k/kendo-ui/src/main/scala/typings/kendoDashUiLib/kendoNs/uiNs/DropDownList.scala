package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DropDownList")
@js.native
class DropDownList protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DropDownListOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var filterInput: kendoDashUiLib.JQuery = js.native
  var list: kendoDashUiLib.JQuery = js.native
  @JSName("options")
  var options_DropDownList: DropDownListOptions = js.native
  var span: kendoDashUiLib.JQuery = js.native
  var ul: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def dataItem(): js.Any = js.native
  def dataItem(index: kendoDashUiLib.JQuery): js.Any = js.native
  def dataItem(index: scala.Double): js.Any = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def items(): js.Any = js.native
  def open(): scala.Unit = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def search(word: java.lang.String): scala.Unit = js.native
  def select(): scala.Double = js.native
  def select(li: js.Function): scala.Unit = js.native
  def select(li: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(li: scala.Double): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def text(): java.lang.String = js.native
  def text(text: java.lang.String): scala.Unit = js.native
  def toggle(toggle: scala.Boolean): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DropDownList")
@js.native
object DropDownList extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.DropDownList = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.DropDownList = js.native
}

