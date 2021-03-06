package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSpec extends js.Object {
  /**
    * The alternative text that describes the chart.  This is often used
    * for accessibility.
    */
  var altText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color of the entire chart.
    * Not applicable to Org charts.
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * A basic chart specification, can be one of many kinds of charts.
    * See BasicChartType for the list of all
    * charts this supports.
    */
  var basicChart: js.UndefOr[BasicChartSpec] = js.undefined
  /** A bubble chart specification. */
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.undefined
  /** A candlestick chart specification. */
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.undefined
  /**
    * The name of the font to use by default for all chart text (e.g. title,
    * axis labels, legend).  If a font is specified for a specific part of the
    * chart it will override this font name.
    */
  var fontName: js.UndefOr[java.lang.String] = js.undefined
  /** Determines how the charts will use hidden rows or columns. */
  var hiddenDimensionStrategy: js.UndefOr[java.lang.String] = js.undefined
  /** A histogram chart specification. */
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.undefined
  /**
    * True to make a chart fill the entire space in which it's rendered with
    * minimum padding.  False to use the default padding.
    * (Not applicable to Geo and Org charts.)
    */
  var maximized: js.UndefOr[scala.Boolean] = js.undefined
  /** An org chart specification. */
  var orgChart: js.UndefOr[OrgChartSpec] = js.undefined
  /** A pie chart specification. */
  var pieChart: js.UndefOr[PieChartSpec] = js.undefined
  /** The subtitle of the chart. */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The subtitle text format.
    * Strikethrough and underline are not supported.
    */
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.undefined
  /**
    * The subtitle text position.
    * This field is optional.
    */
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.undefined
  /** The title of the chart. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title text format.
    * Strikethrough and underline are not supported.
    */
  var titleTextFormat: js.UndefOr[TextFormat] = js.undefined
  /**
    * The title text position.
    * This field is optional.
    */
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
}

object ChartSpec {
  @scala.inline
  def apply(
    altText: java.lang.String = null,
    backgroundColor: Color = null,
    basicChart: BasicChartSpec = null,
    bubbleChart: BubbleChartSpec = null,
    candlestickChart: CandlestickChartSpec = null,
    fontName: java.lang.String = null,
    hiddenDimensionStrategy: java.lang.String = null,
    histogramChart: HistogramChartSpec = null,
    maximized: js.UndefOr[scala.Boolean] = js.undefined,
    orgChart: OrgChartSpec = null,
    pieChart: PieChartSpec = null,
    subtitle: java.lang.String = null,
    subtitleTextFormat: TextFormat = null,
    subtitleTextPosition: TextPosition = null,
    title: java.lang.String = null,
    titleTextFormat: TextFormat = null,
    titleTextPosition: TextPosition = null
  ): ChartSpec = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (basicChart != null) __obj.updateDynamic("basicChart")(basicChart)
    if (bubbleChart != null) __obj.updateDynamic("bubbleChart")(bubbleChart)
    if (candlestickChart != null) __obj.updateDynamic("candlestickChart")(candlestickChart)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (hiddenDimensionStrategy != null) __obj.updateDynamic("hiddenDimensionStrategy")(hiddenDimensionStrategy)
    if (histogramChart != null) __obj.updateDynamic("histogramChart")(histogramChart)
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized)
    if (orgChart != null) __obj.updateDynamic("orgChart")(orgChart)
    if (pieChart != null) __obj.updateDynamic("pieChart")(pieChart)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleTextFormat != null) __obj.updateDynamic("subtitleTextFormat")(subtitleTextFormat)
    if (subtitleTextPosition != null) __obj.updateDynamic("subtitleTextPosition")(subtitleTextPosition)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextFormat != null) __obj.updateDynamic("titleTextFormat")(titleTextFormat)
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition)
    __obj.asInstanceOf[ChartSpec]
  }
}

