package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContinuousRangeSelectInfo with extends of RangeSelectInfo
  */
trait INxContinuousRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Dimension index.
    */
  var qDimIx: scala.Double
}

object INxContinuousRangeSelectInfo {
  @scala.inline
  def apply(qDimIx: scala.Double, qRange: IRange): INxContinuousRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qDimIx = qDimIx, qRange = qRange)
  
    __obj.asInstanceOf[INxContinuousRangeSelectInfo]
  }
}

