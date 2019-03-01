package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDimensionInfo...
  */
trait INxDimensionInfo extends js.Object {
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: scala.Double
  /**
    * Array of attribute dimensions.
    * Array of NxAttrDimInfo
    */
  var qAttrDimInfo: INxAttrDimInfo
  /**
    * Array of attribute expressions.
    * Array of NxAttrExprInfo
    */
  var qAttrExprInfo: INxAttrExprInfo
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: scala.Double
  /**
    * Is continuous axis used.
    * Boolean
    */
  var qContinuousAxes: scala.Boolean
  /**
    * Is derived field is used as a dimension.
    * Boolean
    */
  var qDerivedField: scala.Boolean
  /**
    * Binary format of the field.
    * One of:
    *       # D for discrete (String)
    *       # N for numeric (Double)
    *       # T for Time (Timestamp)
    */
  var qDimensionType: DimensionType
  /**
    * This parameter is optional.
    * Gives information on the error.
    * Null or NxValidationError
    */
  var qError: js.UndefOr[INxValidationError] = js.undefined
  /**
    * Corresponds to the label of the dimension that is selected.
    * If the label is not defined then the field name is used.
    * String
    */
  var qFallbackTitle: java.lang.String
  /**
    * Array of dimension labels.
    * Contains the labels of all dimensions in a hierarchy group (for example the labels of all dimensions in a drill down group).
    * Array of String
    */
  var qGroupFallbackTitles: js.Array[java.lang.String]
  /**
    * Array of field names.
    * Array of String
    */
  var qGroupFieldDefs: js.Array[java.lang.String]
  /**
    * Index of the dimension that is currently in use.
    * qGroupPos is set to 0 if there are no hierarchical groups (drill-down groups) or cycle groups.
    * Integer
    */
  var qGroupPos: scala.Double
  /**
    * Defines the grouping.
    * One of:
    *       # N for no grouping
    *       # H for drill-down
    *       # C for cyclic
    */
  var qGrouping: NxGrpType
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown). The engine guesses the type of the field based on the field's definition.
    * Boolean
    */
  var qIsAutoFormat: scala.Boolean
  /**
    * Is a cyclic dimension used.
    * Boolean
    */
  var qIsCyclic: scala.Boolean
  /**
    * If set to true, it means that the field is a semantic.
    * Boolean
    */
  var qIsSemantic: scala.Boolean
  /**
    * Is set to true if the field is locked.
    * Boolean
    */
  var qLocked: scala.Boolean
  /**
    * Maximum value.
    * Double
    */
  var qMax: scala.Double
  /**
    * Minimum value.
    * Double
    */
  var qMin: scala.Double
  /**
    * Format of the field.
    * This parameter is optional.
    * FieldAttributes
    */
  var qNumFormat: js.UndefOr[FieldAttributesType] = js.undefined
  /**
    * If set to true, it inverts the sort criteria in the field.
    * Boolean
    */
  var qReverseSort: scala.Boolean
  /**
    * Sort indicator.
    * This parameter is optional.
    * The default value is no sorting.
    * One of:
    *       # N for no sorting
    *       # A for sorting ascending
    *       # D for sorting descending
    */
  var qSortIndicator: js.UndefOr[SortIndicatorType] = js.undefined
  /**
    * Number of values in a particular state.
    * NxStateCounts
    */
  var qStateCounts: INxStateCounts
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    * Array of String
    */
  var qTags: js.Array[java.lang.String]
}

object INxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: scala.Double,
    qAttrDimInfo: INxAttrDimInfo,
    qAttrExprInfo: INxAttrExprInfo,
    qCardinal: scala.Double,
    qContinuousAxes: scala.Boolean,
    qDerivedField: scala.Boolean,
    qDimensionType: DimensionType,
    qFallbackTitle: java.lang.String,
    qGroupFallbackTitles: js.Array[java.lang.String],
    qGroupFieldDefs: js.Array[java.lang.String],
    qGroupPos: scala.Double,
    qGrouping: NxGrpType,
    qIsAutoFormat: scala.Boolean,
    qIsCyclic: scala.Boolean,
    qIsSemantic: scala.Boolean,
    qLocked: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double,
    qReverseSort: scala.Boolean,
    qStateCounts: INxStateCounts,
    qTags: js.Array[java.lang.String],
    qError: INxValidationError = null,
    qNumFormat: FieldAttributesType = null,
    qSortIndicator: SortIndicatorType = null
  ): INxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount, qAttrDimInfo = qAttrDimInfo, qAttrExprInfo = qAttrExprInfo, qCardinal = qCardinal, qContinuousAxes = qContinuousAxes, qDerivedField = qDerivedField, qDimensionType = qDimensionType, qFallbackTitle = qFallbackTitle, qGroupFallbackTitles = qGroupFallbackTitles, qGroupFieldDefs = qGroupFieldDefs, qGroupPos = qGroupPos, qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat, qIsCyclic = qIsCyclic, qIsSemantic = qIsSemantic, qLocked = qLocked, qMax = qMax, qMin = qMin, qReverseSort = qReverseSort, qStateCounts = qStateCounts, qTags = qTags)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    if (qNumFormat != null) __obj.updateDynamic("qNumFormat")(qNumFormat)
    if (qSortIndicator != null) __obj.updateDynamic("qSortIndicator")(qSortIndicator)
    __obj.asInstanceOf[INxDimensionInfo]
  }
}

