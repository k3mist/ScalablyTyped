package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartBoxQuartileCalculation extends js.Object

/**
  *
  * Represents the quartile calculation type of chart series layout, only applicable in Box & Whisker chart.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ChartBoxQuartileCalculation")
@js.native
object ChartBoxQuartileCalculation extends js.Object {
  @js.native
  sealed trait exclusive
    extends officeDashJsDashPreviewLib.ExcelNs.ChartBoxQuartileCalculation
  
  @js.native
  sealed trait inclusive
    extends officeDashJsDashPreviewLib.ExcelNs.ChartBoxQuartileCalculation
  
  /* "Exclusive" */ val exclusive: exclusive with java.lang.String = js.native
  /* "Inclusive" */ val inclusive: inclusive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartBoxQuartileCalculation with java.lang.String
  ] = js.native
}

