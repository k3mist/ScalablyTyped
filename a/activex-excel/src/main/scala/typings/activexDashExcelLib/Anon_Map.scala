package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Result: activexDashExcelLib.ExcelNs.XlXmlExportResult
  val Url: java.lang.String
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_Map {
  @scala.inline
  def apply(
    Map: activexDashExcelLib.ExcelNs.XmlMap,
    Result: activexDashExcelLib.ExcelNs.XlXmlExportResult,
    Url: java.lang.String,
    Wb: activexDashExcelLib.ExcelNs.Workbook
  ): Anon_Map = {
    val __obj = js.Dynamic.literal(Map = Map, Result = Result, Url = Url, Wb = Wb)
  
    __obj.asInstanceOf[Anon_Map]
  }
}

