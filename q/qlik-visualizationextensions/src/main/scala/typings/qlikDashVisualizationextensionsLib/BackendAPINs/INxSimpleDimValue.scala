package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxSimpleDimValue extends js.Object {
  /**
    * Element number.
    * Integer
    */
  var qElemNo: scala.Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    * String
    */
  var qText: java.lang.String
}

object INxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: scala.Double, qText: java.lang.String): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo, qText = qText)
  
    __obj.asInstanceOf[INxSimpleDimValue]
  }
}

