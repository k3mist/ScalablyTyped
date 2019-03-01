package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxCell...
  */
trait INxCell extends js.Object {
  /**
    * Attribute dimensions values.
    */
  var qAttrDims: INxAttributeExpressionValues
  /**
    * Attribute expression values.
    */
  var qAttrExps: INxAttributeExpressionValues
  /**
    * Rank number of the value, starting from 0.
    * If the element number is a negative number, it means that the returned value is not an element number.
    *
    * You can get the following negative values:
    *
    * - 1: the cell is a Total cell. It shows a total.
    * - 2: the cell is collapsed. Applies to pivot tables.
    * - 3: the cell belongs to the group Others.
    * - 4: the cell is empty. Applies to pivot tables.
    */
  var qElemNumber: scala.Double
  /**
    * Frequency of the value.
    * This parameter is optional.
    */
  var qFrequency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Search hits.
    * The search hits are highlighted.
    * This parameter is optional.
    */
  var qHighlightRanges: js.UndefOr[INxHighlightRanges] = js.undefined
  /**
    * Is set to true, if qText and qNum are empty.
    * This parameter is optional. The default value is false.
    */
  var qIsEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is set to true if the value is Null.
    */
  var qIsNull: scala.Boolean
  /**
    * Is set to true if the cell belongs to the group Others.
    * Dimension values can be set as Others depending on what has been defined in OtherTotalSpecProp.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsOtherCell: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is set to true if a total is displayed in the cell.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsTotalCell: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A value.
    * This parameter is optional.
    */
  var qNum: js.UndefOr[scala.Double] = js.undefined
  /**
    * State of the value.
    * default state for a measure is "L".
    *
    * One of:
    *               L for Locked
    *               S for Selected
    *               O for Optional
    *               D for Deselected
    *               A for Alternative
    *               X for eXcluded
    *               XS for eXcluded Selected
    *               XL for eXcluded Locked
    */
  var qState: NxCellStateType
  /**
    * Some text.
    * This parameter is optional.
    */
  var qText: js.UndefOr[java.lang.String] = js.undefined
}

object INxCell {
  @scala.inline
  def apply(
    qAttrDims: INxAttributeExpressionValues,
    qAttrExps: INxAttributeExpressionValues,
    qElemNumber: scala.Double,
    qIsNull: scala.Boolean,
    qState: NxCellStateType,
    qFrequency: java.lang.String = null,
    qHighlightRanges: INxHighlightRanges = null,
    qIsEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    qIsOtherCell: js.UndefOr[scala.Boolean] = js.undefined,
    qIsTotalCell: js.UndefOr[scala.Boolean] = js.undefined,
    qNum: scala.Int | scala.Double = null,
    qText: java.lang.String = null
  ): INxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims, qAttrExps = qAttrExps, qElemNumber = qElemNumber, qIsNull = qIsNull, qState = qState)
    if (qFrequency != null) __obj.updateDynamic("qFrequency")(qFrequency)
    if (qHighlightRanges != null) __obj.updateDynamic("qHighlightRanges")(qHighlightRanges)
    if (!js.isUndefined(qIsEmpty)) __obj.updateDynamic("qIsEmpty")(qIsEmpty)
    if (!js.isUndefined(qIsOtherCell)) __obj.updateDynamic("qIsOtherCell")(qIsOtherCell)
    if (!js.isUndefined(qIsTotalCell)) __obj.updateDynamic("qIsTotalCell")(qIsTotalCell)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    if (qText != null) __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[INxCell]
  }
}

