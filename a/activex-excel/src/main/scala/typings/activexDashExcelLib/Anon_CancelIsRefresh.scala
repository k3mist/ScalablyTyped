package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelIsRefresh extends js.Object {
  var Cancel: scala.Boolean
  val IsRefresh: scala.Boolean
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Url: java.lang.String
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_CancelIsRefresh {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    IsRefresh: scala.Boolean,
    Map: activexDashExcelLib.ExcelNs.XmlMap,
    Url: java.lang.String,
    Wb: activexDashExcelLib.ExcelNs.Workbook
  ): Anon_CancelIsRefresh = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, IsRefresh = IsRefresh, Map = Map, Url = Url, Wb = Wb)
  
    __obj.asInstanceOf[Anon_CancelIsRefresh]
  }
}

