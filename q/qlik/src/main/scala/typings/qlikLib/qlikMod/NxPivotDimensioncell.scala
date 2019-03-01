package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPivotDimensioncell extends js.Object {
  var qAttrDims: js.Array[NxAttributeDimValues]
  var qAttrExps: js.Array[NxAttributeExpressionValues]
  var qCanCollapse: scala.Boolean
  var qCanExpand: scala.Boolean
  var qDown: scala.Double
  var qElemNo: scala.Double
  var qSubNodes: js.Array[NxPivotDimensioncell]
  var qText: java.lang.String
  var qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U
  var qUp: scala.Double
  var qValue: scala.Double
}

object NxPivotDimensioncell {
  @scala.inline
  def apply(
    qAttrDims: js.Array[NxAttributeDimValues],
    qAttrExps: js.Array[NxAttributeExpressionValues],
    qCanCollapse: scala.Boolean,
    qCanExpand: scala.Boolean,
    qDown: scala.Double,
    qElemNo: scala.Double,
    qSubNodes: js.Array[NxPivotDimensioncell],
    qText: java.lang.String,
    qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U,
    qUp: scala.Double,
    qValue: scala.Double
  ): NxPivotDimensioncell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims, qAttrExps = qAttrExps, qCanCollapse = qCanCollapse, qCanExpand = qCanExpand, qDown = qDown, qElemNo = qElemNo, qSubNodes = qSubNodes, qText = qText, qType = qType.asInstanceOf[js.Any], qUp = qUp, qValue = qValue)
  
    __obj.asInstanceOf[NxPivotDimensioncell]
  }
}

