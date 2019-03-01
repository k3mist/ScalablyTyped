package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxis extends js.Object {
  /** Specifies the position of the axis labels.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[LabelAlignment | java.lang.String] = js.undefined
  /** Options for customizing horizontal axis alternate grid band.
    */
  var alternateGridBand: js.UndefOr[PrimaryXAxisAlternateGridBand] = js.undefined
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[PrimaryXAxisAxisLine] = js.undefined
  /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
    * @Default {null}
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the number of columns or plot areas an axis has to span horizontally.
    * @Default {null}
    */
  var columnSpan: js.UndefOr[scala.Double] = js.undefined
  /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
    * value of crossing axis, then axis will be placed at the opposite side.
    * @Default {null}
    */
  var crossesAt: js.UndefOr[scala.Double] = js.undefined
  /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
    * axis or primary Y axis will be used for crossing
    * @Default {null}
    */
  var crossesInAxis: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the crosshair label.
    */
  var crosshairLabel: js.UndefOr[PrimaryXAxisCrosshairLabel] = js.undefined
  /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
    * @Default {null}
    */
  var desiredIntervals: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position of labels at the edge of the axis.
    * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
    */
  var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | java.lang.String] = js.undefined
  /** Specifies the interval of the axis according to the zoomed data of the chart.
    * @Default {true}
    */
  var enableAutoIntervalOnZooming: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the font of the axis Labels.
    */
  var font: js.UndefOr[PrimaryXAxisFont] = js.undefined
  /** Specifies the type of interval in date time axis.
    * @Default {null. See IntervalType}
    */
  var intervalType: js.UndefOr[IntervalType | java.lang.String] = js.undefined
  /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
    * @Default {false}
    */
  var isIndexed: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to inverse the axis.
    * @Default {false}
    */
  var isInversed: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the border of the labels.
    */
  var labelBorder: js.UndefOr[PrimaryXAxisLabelBorder] = js.undefined
  /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
    * @Default {null}
    */
  var labelFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the action to take when the axis labels are overlapping with each other.
    * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | java.lang.String] = js.undefined
  /** Specifies the placement of labels.
    * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | java.lang.String] = js.undefined
  /** Specifies the position of the axis labels.
    * @Default {outside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | java.lang.String] = js.undefined
  /** Angle in degrees to rotate the axis labels.
    * @Default {null}
    */
  var labelRotation: js.UndefOr[scala.Double] = js.undefined
  /** Logarithmic base value. This is applicable only for logarithmic axis.
    * @Default {10}
    */
  var logBase: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing major gird lines.
    */
  var majorGridLines: js.UndefOr[PrimaryXAxisMajorGridLines] = js.undefined
  /** Options for customizing the major tick lines.
    */
  var majorTickLines: js.UndefOr[PrimaryXAxisMajorTickLines] = js.undefined
  /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
    * @Default {34}
    */
  var maximumLabelWidth: js.UndefOr[scala.Double] = js.undefined
  /** Maximum number of labels to be displayed in every 100 pixels.
    * @Default {3}
    */
  var maximumLabels: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the minor grid lines.
    */
  var minorGridLines: js.UndefOr[PrimaryXAxisMinorGridLines] = js.undefined
  /** Options for customizing the minor tick lines.
    */
  var minorTickLines: js.UndefOr[PrimaryXAxisMinorTickLines] = js.undefined
  /** Specifies the number of minor ticks per interval.
    * @Default {null}
    */
  var minorTicksPerInterval: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the multi level labels.
    * @Default {[ ]}
    */
  var multiLevelLabels: js.UndefOr[js.Array[PrimaryXAxisMultiLevelLabel]] = js.undefined
  /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
    * @Default {null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether to render the axis at the opposite side of its default position.
    * @Default {false}
    */
  var opposedPosition: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the orientation of the axis line
    * @Default {Horizontal}
    */
  var orientation: js.UndefOr[AxisOrientation | java.lang.String] = js.undefined
  /** Specifies the padding for the plot area.
    * @Default {10}
    */
  var plotOffset: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the range of the axis.
    */
  var range: js.UndefOr[PrimaryXAxisRange] = js.undefined
  /** Specifies the padding for the axis range.
    * @Default {None. See RangePadding}
    */
  var rangePadding: js.UndefOr[RangePadding | java.lang.String] = js.undefined
  /** Rounds the number to the given number of decimals.
    * @Default {null}
    */
  var roundingPlaces: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the axis scrollbar
    */
  var scrollbarSettings: js.UndefOr[PrimaryXAxisScrollbarSettings] = js.undefined
  /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
    * @Default {true}
    */
  var showNextToAxisLine: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the strip lines.
    * @Default {[ ]}
    */
  var stripLine: js.UndefOr[js.Array[PrimaryXAxisStripLine]] = js.undefined
  /** Specifies the position of the axis tick lines.
    * @Default {outside. See TickLinesPosition}
    */
  var tickLinesPosition: js.UndefOr[TickLinesPosition | java.lang.String] = js.undefined
  /** Options for customizing the axis title.
    */
  var title: js.UndefOr[PrimaryXAxisTitle] = js.undefined
  /** Specifies the type of data the axis is handling.
    * @Default {null. See ValueType}
    */
  var valueType: js.UndefOr[ValueType | java.lang.String] = js.undefined
  /** Show/hides the axis.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
  /** Position of the zoomed axis. Value ranges from 0 to 1.
    * @Default {0}
    */
  var zoomPosition: js.UndefOr[scala.Double] = js.undefined
}

object PrimaryXAxis {
  @scala.inline
  def apply(
    alignment: LabelAlignment | java.lang.String = null,
    alternateGridBand: PrimaryXAxisAlternateGridBand = null,
    axisLine: PrimaryXAxisAxisLine = null,
    columnIndex: scala.Int | scala.Double = null,
    columnSpan: scala.Int | scala.Double = null,
    crossesAt: scala.Int | scala.Double = null,
    crossesInAxis: java.lang.String = null,
    crosshairLabel: PrimaryXAxisCrosshairLabel = null,
    desiredIntervals: scala.Int | scala.Double = null,
    edgeLabelPlacement: EdgeLabelPlacement | java.lang.String = null,
    enableAutoIntervalOnZooming: js.UndefOr[scala.Boolean] = js.undefined,
    enableTrim: js.UndefOr[scala.Boolean] = js.undefined,
    font: PrimaryXAxisFont = null,
    intervalType: IntervalType | java.lang.String = null,
    isIndexed: js.UndefOr[scala.Boolean] = js.undefined,
    isInversed: js.UndefOr[scala.Boolean] = js.undefined,
    labelBorder: PrimaryXAxisLabelBorder = null,
    labelFormat: java.lang.String = null,
    labelIntersectAction: LabelIntersectAction | java.lang.String = null,
    labelPlacement: LabelPlacement | java.lang.String = null,
    labelPosition: LabelPosition | java.lang.String = null,
    labelRotation: scala.Int | scala.Double = null,
    logBase: scala.Int | scala.Double = null,
    majorGridLines: PrimaryXAxisMajorGridLines = null,
    majorTickLines: PrimaryXAxisMajorTickLines = null,
    maximumLabelWidth: scala.Int | scala.Double = null,
    maximumLabels: scala.Int | scala.Double = null,
    minorGridLines: PrimaryXAxisMinorGridLines = null,
    minorTickLines: PrimaryXAxisMinorTickLines = null,
    minorTicksPerInterval: scala.Int | scala.Double = null,
    multiLevelLabels: js.Array[PrimaryXAxisMultiLevelLabel] = null,
    name: java.lang.String = null,
    opposedPosition: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: AxisOrientation | java.lang.String = null,
    plotOffset: scala.Int | scala.Double = null,
    range: PrimaryXAxisRange = null,
    rangePadding: RangePadding | java.lang.String = null,
    roundingPlaces: scala.Int | scala.Double = null,
    scrollbarSettings: PrimaryXAxisScrollbarSettings = null,
    showNextToAxisLine: js.UndefOr[scala.Boolean] = js.undefined,
    stripLine: js.Array[PrimaryXAxisStripLine] = null,
    tickLinesPosition: TickLinesPosition | java.lang.String = null,
    title: PrimaryXAxisTitle = null,
    valueType: ValueType | java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoomFactor: scala.Int | scala.Double = null,
    zoomPosition: scala.Int | scala.Double = null
  ): PrimaryXAxis = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (alternateGridBand != null) __obj.updateDynamic("alternateGridBand")(alternateGridBand)
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (crossesAt != null) __obj.updateDynamic("crossesAt")(crossesAt.asInstanceOf[js.Any])
    if (crossesInAxis != null) __obj.updateDynamic("crossesInAxis")(crossesInAxis)
    if (crosshairLabel != null) __obj.updateDynamic("crosshairLabel")(crosshairLabel)
    if (desiredIntervals != null) __obj.updateDynamic("desiredIntervals")(desiredIntervals.asInstanceOf[js.Any])
    if (edgeLabelPlacement != null) __obj.updateDynamic("edgeLabelPlacement")(edgeLabelPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoIntervalOnZooming)) __obj.updateDynamic("enableAutoIntervalOnZooming")(enableAutoIntervalOnZooming)
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim)
    if (font != null) __obj.updateDynamic("font")(font)
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndexed)) __obj.updateDynamic("isIndexed")(isIndexed)
    if (!js.isUndefined(isInversed)) __obj.updateDynamic("isInversed")(isInversed)
    if (labelBorder != null) __obj.updateDynamic("labelBorder")(labelBorder)
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat)
    if (labelIntersectAction != null) __obj.updateDynamic("labelIntersectAction")(labelIntersectAction.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelRotation != null) __obj.updateDynamic("labelRotation")(labelRotation.asInstanceOf[js.Any])
    if (logBase != null) __obj.updateDynamic("logBase")(logBase.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTickLines != null) __obj.updateDynamic("majorTickLines")(majorTickLines)
    if (maximumLabelWidth != null) __obj.updateDynamic("maximumLabelWidth")(maximumLabelWidth.asInstanceOf[js.Any])
    if (maximumLabels != null) __obj.updateDynamic("maximumLabels")(maximumLabels.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTickLines != null) __obj.updateDynamic("minorTickLines")(minorTickLines)
    if (minorTicksPerInterval != null) __obj.updateDynamic("minorTicksPerInterval")(minorTicksPerInterval.asInstanceOf[js.Any])
    if (multiLevelLabels != null) __obj.updateDynamic("multiLevelLabels")(multiLevelLabels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(opposedPosition)) __obj.updateDynamic("opposedPosition")(opposedPosition)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (plotOffset != null) __obj.updateDynamic("plotOffset")(plotOffset.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (rangePadding != null) __obj.updateDynamic("rangePadding")(rangePadding.asInstanceOf[js.Any])
    if (roundingPlaces != null) __obj.updateDynamic("roundingPlaces")(roundingPlaces.asInstanceOf[js.Any])
    if (scrollbarSettings != null) __obj.updateDynamic("scrollbarSettings")(scrollbarSettings)
    if (!js.isUndefined(showNextToAxisLine)) __obj.updateDynamic("showNextToAxisLine")(showNextToAxisLine)
    if (stripLine != null) __obj.updateDynamic("stripLine")(stripLine)
    if (tickLinesPosition != null) __obj.updateDynamic("tickLinesPosition")(tickLinesPosition.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    if (zoomPosition != null) __obj.updateDynamic("zoomPosition")(zoomPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxis]
  }
}

