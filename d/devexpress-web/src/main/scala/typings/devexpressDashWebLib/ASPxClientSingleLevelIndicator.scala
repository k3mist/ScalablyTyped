package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the SingleLevelIndicator class.
  */
trait ASPxClientSingleLevelIndicator extends ASPxClientIndicator {
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    * Value: A string value.
    */
  var valueLevel: java.lang.String
}

object ASPxClientSingleLevelIndicator {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: java.lang.String,
    series: ASPxClientSeries,
    valueLevel: java.lang.String
  ): ASPxClientSingleLevelIndicator = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, series = series, valueLevel = valueLevel)
  
    __obj.asInstanceOf[ASPxClientSingleLevelIndicator]
  }
}

