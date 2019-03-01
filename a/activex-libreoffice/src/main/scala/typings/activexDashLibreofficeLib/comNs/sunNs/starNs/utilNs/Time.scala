package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a time value. */
trait Time extends js.Object {
  /** contains the hour (0-23). */
  var Hours: scala.Double
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: scala.Boolean
  /** contains the minutes (0-59). */
  var Minutes: scala.Double
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: scala.Double
  /** contains the seconds (0-59). */
  var Seconds: scala.Double
}

object Time {
  @scala.inline
  def apply(
    Hours: scala.Double,
    IsUTC: scala.Boolean,
    Minutes: scala.Double,
    NanoSeconds: scala.Double,
    Seconds: scala.Double
  ): Time = {
    val __obj = js.Dynamic.literal(Hours = Hours, IsUTC = IsUTC, Minutes = Minutes, NanoSeconds = NanoSeconds, Seconds = Seconds)
  
    __obj.asInstanceOf[Time]
  }
}

