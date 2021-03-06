package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TOOLS
trait IDragTool extends ITool {
  var series: ISeries
}

object IDragTool {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chart: IChart,
    clicked: IPoint => scala.Boolean,
    draw: () => scala.Unit,
    mousedown: js.Any => scala.Boolean,
    mousemove: js.Any => scala.Boolean,
    series: ISeries
  ): IDragTool = {
    val __obj = js.Dynamic.literal(active = active, chart = chart, clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), series = series)
  
    __obj.asInstanceOf[IDragTool]
  }
}

