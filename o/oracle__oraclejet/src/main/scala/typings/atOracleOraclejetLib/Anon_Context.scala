package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojchartMod.ojChartNs.TooltipContext): Anon_Insert | Anon_PreventDefault
}

object Anon_Context {
  @scala.inline
  def apply(
    renderer: atOracleOraclejetLib.ojchartMod.ojChartNs.TooltipContext => Anon_Insert | Anon_PreventDefault
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_Context]
  }
}

