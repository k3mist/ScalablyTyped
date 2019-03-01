package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the result of one element in the data pilot data array.
  * @see com.sun.star.sheet.XDataPilotResults
  */
trait DataResult extends js.Object {
  /**
    * contains boolean flags describing the result.
    * @see com.sun.star.sheet.DataResultFlags
    */
  var Flags: scala.Double
  /** contains the result value. */
  var Value: scala.Double
}

object DataResult {
  @scala.inline
  def apply(Flags: scala.Double, Value: scala.Double): DataResult = {
    val __obj = js.Dynamic.literal(Flags = Flags, Value = Value)
  
    __obj.asInstanceOf[DataResult]
  }
}

