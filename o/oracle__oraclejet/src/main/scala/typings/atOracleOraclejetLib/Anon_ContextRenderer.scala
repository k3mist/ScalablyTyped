package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRenderer extends js.Object {
  var renderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojchartMod.ojSparkChartNs.TooltipContext, 
    Anon_Insert | Anon_PreventDefault
  ]) | scala.Null
}

object Anon_ContextRenderer {
  @scala.inline
  def apply(
    renderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojchartMod.ojSparkChartNs.TooltipContext, 
      Anon_Insert | Anon_PreventDefault
    ] = null
  ): Anon_ContextRenderer = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[Anon_ContextRenderer]
  }
}

