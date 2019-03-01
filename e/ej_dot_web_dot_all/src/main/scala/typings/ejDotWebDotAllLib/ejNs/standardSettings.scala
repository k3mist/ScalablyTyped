package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait standardSettings extends js.Object {
  var AM: js.Array[java.lang.String]
  var PM: js.Array[java.lang.String]
  var days: daySettings
  var firstDay: scala.Double
  var months: monthSettings
  var patterns: patternSettings
  var twoDigitYearMax: scala.Double
}

object standardSettings {
  @scala.inline
  def apply(
    AM: js.Array[java.lang.String],
    PM: js.Array[java.lang.String],
    days: daySettings,
    firstDay: scala.Double,
    months: monthSettings,
    patterns: patternSettings,
    twoDigitYearMax: scala.Double
  ): standardSettings = {
    val __obj = js.Dynamic.literal(AM = AM, PM = PM, days = days, firstDay = firstDay, months = months, patterns = patterns, twoDigitYearMax = twoDigitYearMax)
  
    __obj.asInstanceOf[standardSettings]
  }
}

