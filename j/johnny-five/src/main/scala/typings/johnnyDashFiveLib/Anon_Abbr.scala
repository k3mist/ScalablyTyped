package typings
package johnnyDashFiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abbr extends js.Object {
  var abbr: java.lang.String
  var heading: scala.Double
  var high: scala.Double
  var low: scala.Double
  var name: java.lang.String
}

object Anon_Abbr {
  @scala.inline
  def apply(
    abbr: java.lang.String,
    heading: scala.Double,
    high: scala.Double,
    low: scala.Double,
    name: java.lang.String
  ): Anon_Abbr = {
    val __obj = js.Dynamic.literal(abbr = abbr, heading = heading, high = high, low = low, name = name)
  
    __obj.asInstanceOf[Anon_Abbr]
  }
}

