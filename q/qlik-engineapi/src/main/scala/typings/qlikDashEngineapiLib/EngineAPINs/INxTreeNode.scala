package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxTreeNode extends js.Object {
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.undefined
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.undefined
  /**
    * Element number
    */
  var qElemNo: scala.Double
  /**
    * A generated number applicable to this page only. Used so that children can easily identify who their parents are.
    */
  var qNodeNr: scala.Double
  /**
    * The children of this node in the tree structure.
    */
  var qNodes: INxTreeNode
  /**
    * The qNodeNr of this node's parent for the current page.
    */
  var qParentNode: scala.Double
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: scala.Double
  /**
    * The text version of the value, if available.
    */
  var qText: java.lang.String
  /**
    * Type of the cell.
    */
  var qType: NxTreeNodeType
  /**
    * The measures for this node.
    */
  var qValues: INxTreeValue
}

object INxTreeNode {
  @scala.inline
  def apply(
    qElemNo: scala.Double,
    qNodeNr: scala.Double,
    qNodes: INxTreeNode,
    qParentNode: scala.Double,
    qRow: scala.Double,
    qText: java.lang.String,
    qType: NxTreeNodeType,
    qValues: INxTreeValue,
    qAttrDims: INxAttributeDimValues = null,
    qAttrExps: INxAttributeExpressionValues = null
  ): INxTreeNode = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo, qNodeNr = qNodeNr, qNodes = qNodes, qParentNode = qParentNode, qRow = qRow, qText = qText, qType = qType, qValues = qValues)
    if (qAttrDims != null) __obj.updateDynamic("qAttrDims")(qAttrDims)
    if (qAttrExps != null) __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.asInstanceOf[INxTreeNode]
  }
}

