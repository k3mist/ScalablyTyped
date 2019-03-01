package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisTitle class.
  */
trait ASPxClientAxisTitle extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which the axis title belongs.
    * Value: An ASPxClientAxisBase descendant, which identifies the axis.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the text of the axis title.
    * Value: A string object which contains the axis title's text.
    */
  var text: java.lang.String
}

object ASPxClientAxisTitle {
  @scala.inline
  def apply(axis: ASPxClientAxisBase, chart: ASPxClientWebChart, text: java.lang.String): ASPxClientAxisTitle = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, text = text)
  
    __obj.asInstanceOf[ASPxClientAxisTitle]
  }
}

