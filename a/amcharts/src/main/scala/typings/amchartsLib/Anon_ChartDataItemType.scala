package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataItemType extends js.Object {
  var chart: amchartsLib.amchartMod.default
   // Always "rollOverSlice".
  var dataItem: amchartsLib.sliceMod.default
  var `type`: java.lang.String
}

object Anon_ChartDataItemType {
  @scala.inline
  def apply(
    chart: amchartsLib.amchartMod.default,
    dataItem: amchartsLib.sliceMod.default,
    `type`: java.lang.String
  ): Anon_ChartDataItemType = {
    val __obj = js.Dynamic.literal(chart = chart, dataItem = dataItem, `type` = `type`)
  
    __obj.asInstanceOf[Anon_ChartDataItemType]
  }
}

