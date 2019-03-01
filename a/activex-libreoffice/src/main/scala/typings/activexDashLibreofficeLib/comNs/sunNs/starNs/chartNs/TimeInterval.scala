package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an interval on a date-axis
  * @since OOo 3.4
  */
trait TimeInterval extends js.Object {
  /** specifies the number of units */
  var Number: scala.Double
  /**
    * specifies a unit for the interval
    *
    * is a value out of the constant group {@link com.sun.star.chart.TimeUnit} .
    */
  var TimeUnit: scala.Double
}

object TimeInterval {
  @scala.inline
  def apply(Number: scala.Double, TimeUnit: scala.Double): TimeInterval = {
    val __obj = js.Dynamic.literal(Number = Number, TimeUnit = TimeUnit)
  
    __obj.asInstanceOf[TimeInterval]
  }
}

