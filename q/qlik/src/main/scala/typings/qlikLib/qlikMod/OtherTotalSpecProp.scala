package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherTotalSpecProp extends js.Object {
  var qApplyEvenWhenPossiblyWrongResult: scala.Boolean
  var qForceBadValueKeeping: scala.Boolean
  var qGlobalOtherGrouping: scala.Boolean
  var qOtherCollapseInnerDimensions: scala.Boolean
  var qOtherCounted: ValueExpr
  var qOtherLimit: ValueExpr
  var qOtherLimitMode: qlikLib.qlikLibStrings.OTHER_GE_LIMIT | qlikLib.qlikLibStrings.OTHER_LE_LIMIT | qlikLib.qlikLibStrings.OTHER_GT_LIMIT | qlikLib.qlikLibStrings.OTHER_LT_LIMIT
  var qOtherMode: qlikLib.qlikLibStrings.OTHER_OFF | qlikLib.qlikLibStrings.OTHER_COUNTED | qlikLib.qlikLibStrings.OTHER_ABS_LIMITED | qlikLib.qlikLibStrings.OTHER_ABS_ACC_TARGET | qlikLib.qlikLibStrings.OTHER_REL_LIMITED | qlikLib.qlikLibStrings.OTHER_REL_ACC_TARGET
  var qOtherSortMode: qlikLib.qlikLibStrings.OTHER_SORT_DEFAULT | qlikLib.qlikLibStrings.OTHER_SORT_DESCENDING | qlikLib.qlikLibStrings.OTHER_SORT_ASCENDING
  var qReferencedExpression: java.lang.String
  var qSupressOther: scala.Boolean
  var qTotalMode: qlikLib.qlikLibStrings.TOTAL_OFF | qlikLib.qlikLibStrings.TOTAL_EXPR
}

object OtherTotalSpecProp {
  @scala.inline
  def apply(
    qApplyEvenWhenPossiblyWrongResult: scala.Boolean,
    qForceBadValueKeeping: scala.Boolean,
    qGlobalOtherGrouping: scala.Boolean,
    qOtherCollapseInnerDimensions: scala.Boolean,
    qOtherCounted: ValueExpr,
    qOtherLimit: ValueExpr,
    qOtherLimitMode: qlikLib.qlikLibStrings.OTHER_GE_LIMIT | qlikLib.qlikLibStrings.OTHER_LE_LIMIT | qlikLib.qlikLibStrings.OTHER_GT_LIMIT | qlikLib.qlikLibStrings.OTHER_LT_LIMIT,
    qOtherMode: qlikLib.qlikLibStrings.OTHER_OFF | qlikLib.qlikLibStrings.OTHER_COUNTED | qlikLib.qlikLibStrings.OTHER_ABS_LIMITED | qlikLib.qlikLibStrings.OTHER_ABS_ACC_TARGET | qlikLib.qlikLibStrings.OTHER_REL_LIMITED | qlikLib.qlikLibStrings.OTHER_REL_ACC_TARGET,
    qOtherSortMode: qlikLib.qlikLibStrings.OTHER_SORT_DEFAULT | qlikLib.qlikLibStrings.OTHER_SORT_DESCENDING | qlikLib.qlikLibStrings.OTHER_SORT_ASCENDING,
    qReferencedExpression: java.lang.String,
    qSupressOther: scala.Boolean,
    qTotalMode: qlikLib.qlikLibStrings.TOTAL_OFF | qlikLib.qlikLibStrings.TOTAL_EXPR
  ): OtherTotalSpecProp = {
    val __obj = js.Dynamic.literal(qApplyEvenWhenPossiblyWrongResult = qApplyEvenWhenPossiblyWrongResult, qForceBadValueKeeping = qForceBadValueKeeping, qGlobalOtherGrouping = qGlobalOtherGrouping, qOtherCollapseInnerDimensions = qOtherCollapseInnerDimensions, qOtherCounted = qOtherCounted, qOtherLimit = qOtherLimit, qOtherLimitMode = qOtherLimitMode.asInstanceOf[js.Any], qOtherMode = qOtherMode.asInstanceOf[js.Any], qOtherSortMode = qOtherSortMode.asInstanceOf[js.Any], qReferencedExpression = qReferencedExpression, qSupressOther = qSupressOther, qTotalMode = qTotalMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherTotalSpecProp]
  }
}

