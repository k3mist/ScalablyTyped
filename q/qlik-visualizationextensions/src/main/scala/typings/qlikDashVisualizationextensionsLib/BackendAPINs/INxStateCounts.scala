package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxStateCounts extends js.Object {
  /**
    * Number of values in alternative state.
    * Integer
    */
  var qAlternative: scala.Double
  /**
    * Number of values in deselected state.
    * Integer
    */
  var qDeselected: scala.Double
  /**
    * Number of values in excluded state
    * Integer
    */
  var qExcluded: scala.Double
  /**
    * Number of values in locked state.
    * Integer
    */
  var qLocked: scala.Double
  /**
    * Number of values in locked excluded state.
    * Integer
    */
  var qLockedExcluded: scala.Double
  /**
    * Number of values in optional state.
    * Integer
    */
  var qOption: scala.Double
  /**
    * Number of values in selected state.
    * Integer
    */
  var qSelected: scala.Double
  /**
    * Number of values in selected excluded state.
    * Integer
    */
  var qSelectedExcluded: scala.Double
}

object INxStateCounts {
  @scala.inline
  def apply(
    qAlternative: scala.Double,
    qDeselected: scala.Double,
    qExcluded: scala.Double,
    qLocked: scala.Double,
    qLockedExcluded: scala.Double,
    qOption: scala.Double,
    qSelected: scala.Double,
    qSelectedExcluded: scala.Double
  ): INxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative, qDeselected = qDeselected, qExcluded = qExcluded, qLocked = qLocked, qLockedExcluded = qLockedExcluded, qOption = qOption, qSelected = qSelected, qSelectedExcluded = qSelectedExcluded)
  
    __obj.asInstanceOf[INxStateCounts]
  }
}

