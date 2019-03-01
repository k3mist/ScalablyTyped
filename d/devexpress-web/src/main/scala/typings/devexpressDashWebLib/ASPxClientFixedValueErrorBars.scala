package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FixedValueErrorBars class.
  */
trait ASPxClientFixedValueErrorBars extends ASPxClientIndicator {
  /**
    * Returns the fixed negative error value.
    * Value: A double value specifying the negative error value.
    */
  var negativeError: scala.Double
  /**
    * Gets or sets the fixed positive error value.
    * Value: A double value specifying the positive error value.
    */
  var positiveError: scala.Double
}

object ASPxClientFixedValueErrorBars {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: java.lang.String,
    negativeError: scala.Double,
    positiveError: scala.Double,
    series: ASPxClientSeries
  ): ASPxClientFixedValueErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, negativeError = negativeError, positiveError = positiveError, series = series)
  
    __obj.asInstanceOf[ASPxClientFixedValueErrorBars]
  }
}

