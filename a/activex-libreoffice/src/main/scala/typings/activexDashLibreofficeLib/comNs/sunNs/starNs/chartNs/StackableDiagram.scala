package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a helper service for stackable chart types (e.g., charts in which the data rows may be displayed stacked on each other or in percent relation). */
trait StackableDiagram extends js.Object {
  /** If `TRUE` , the series of the diagram are stacked and each category sums up to 100%. */
  var Percent: scala.Boolean
  /**
    * If `TRUE` , the series of the diagram are stacked.
    *
    * If you have a stacked bar chart, you can easily determine the sum of data in each category, by taking the top of the topmost bar.
    */
  var Stacked: scala.Boolean
}

object StackableDiagram {
  @scala.inline
  def apply(Percent: scala.Boolean, Stacked: scala.Boolean): StackableDiagram = {
    val __obj = js.Dynamic.literal(Percent = Percent, Stacked = Stacked)
  
    __obj.asInstanceOf[StackableDiagram]
  }
}

