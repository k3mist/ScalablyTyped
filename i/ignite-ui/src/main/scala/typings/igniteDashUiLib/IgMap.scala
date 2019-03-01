package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMap
  extends /**
	 * Option for igMap
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets or gets the automatic height to add when automatically adding margins to the map.
  	 */
  var autoMarginHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets or gets the automatic width to add when automatically adding margins to the map.
  	 */
  var autoMarginWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Background content object
  	 */
  var backgroundContent: js.UndefOr[IgMapBackgroundContent] = js.undefined
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.undefined
  /**
  	 * Gets or sets the template to use for circle markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of circle.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the cross hair point (in world coordinates)
  	 * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
  	 * case the relevant crosshair line is hidden.
  	 */
  var crosshairPoint: js.UndefOr[IgMapCrosshairPoint] = js.undefined
  /**
  	 * Gets or sets the current Map's crosshair visibility override.
  	 *
  	 * Valid values:
  	 * "visible" Crosshair should be visible.
  	 * "collapsed" Crosshair should not be visible.
  	 */
  var crosshairVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the DefaultInteraction property. The default interaction state defines the map's response to mouse events.
  	 *
  	 * Valid values:
  	 * "none" User gesture will not change the state of the map.
  	 * "dragZoom" User gesture will start a drag rectangle to zoom the map.
  	 * "dragPan" User gesture will start a pan action to move the map's window.
  	 */
  var defaultInteraction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the template to use for diamond markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of diamond.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the current Map's DragModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var dragModifier: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Occurs just after the current Map's grid area rectangle is changed.
  	 * The grid area may change as the result of the Map being resized.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.newHeight to get new height value.
  	 * Use ui.newLeft to get new left value.
  	 * Use ui.newTop to get new top value.
  	 * Use ui.newWidth to get new top value.
  	 * Use ui.oldHeight to get old height value.
  	 * Use ui.oldLeft to get old left value.
  	 * Use ui.oldTop to get old top value.
  	 * Use ui.oldWidth to get old top value.
  	 */
  var gridAreaRectChanged: js.UndefOr[GridAreaRectChangedEvent] = js.undefined
  /**
  	 * The height of the map. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets or sets the template to use for hexagon markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of hexagon.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the template to use for hexagram markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of hexagram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The background image uri use in the overview detail pane.
  	 */
  var overviewPlusDetailPaneBackgroundImageUri: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the current Map's PanModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var panModifier: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the template to use for pentagon markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of pentagon.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the template to use for pentragram markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of pentagram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the brush used as the background for the current Map object's plot area.
  	 */
  var plotAreaBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets whether the series viewer should prefer selecting higher resolution tiles over lower resolution tiles when performing tile zooming. Setting this to true will lower performance but increase quality.
  	 */
  var preferHigherResolutionTiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the preview rectangle.
  	 * The preview rectangle may be set to Rect.Empty, in which case the visible preview
  	 * strokePath is hidden.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var previewRect: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the template to use for pyramid markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of pyramid.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Raised when the map's processing for an update has completed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
  	 */
  var refreshCompleted: js.UndefOr[RefreshCompletedEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of series objects
  	 */
  var series: js.UndefOr[js.Array[IgMapSeries]] = js.undefined
  /**
  	 * Occurs when the cursors are moved over a series in this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.undefined
  /**
  	 * Occurs when the left mouse pointer enters an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.undefined
  /**
  	 * Occurs when the left mouse pointer leaves an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.undefined
  /**
  	 * Occurs when the left mouse button is pressed while the mouse pointer is over an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.undefined
  /**
  	 * Occurs when the left mouse button is released while the mouse pointer is over an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.undefined
  /**
  	 * Occurs when the left mouse pointer moves while over an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.undefined
  /**
  	 * Gets or sets the template to use for square markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of square.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the template to use for tetragram markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of tetragram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var tetragramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
  /**
  	 * Event fired when the mouse has left a series and the tooltip is about to hide
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
  /**
  	 * Event fired when the mouse has hovered on a series and the tooltip is about to show
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
  /**
  	 * Event fired after a tooltip is shown
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
  	 * Gets or sets the template to use for triangle markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of triangle.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired when the status of an ongoing Triangulation has changed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.currentStatus to get current status.
  	 */
  var triangulationStatusChanged: js.UndefOr[TriangulationStatusChangedEvent] = js.undefined
  /**
  	 * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
  	 */
  var useTiledZooming: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The width of the map. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * A number between 0 and 1 determining the position of the horizontal scroll.
  	 * This property is effectively a shortcut to the X position of the WindowRect property.
  	 */
  var windowPositionHorizontal: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A number between 0 and 1 determining the position of the vertical scroll.
  	 * This property is effectively a shortcut to the Y position of the WindowRect property.
  	 */
  var windowPositionVertical: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A rectangle representing the portion of the map currently in view.
  	 * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var windowRect: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Occurs just after the current Map's window rectangle is changed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.newHeight to get new height value.
  	 * Use ui.newLeft to get new left value.
  	 * Use ui.newTop to get new top value.
  	 * Use ui.newWidth to get new top value.
  	 * Use ui.oldHeight to get old height value.
  	 * Use ui.oldLeft to get old left value.
  	 * Use ui.oldTop to get old top value.
  	 * Use ui.oldWidth to get old top value.
  	 */
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.undefined
  /**
  	 * Sets or gets the minimum width that the window rect is allowed to reach before being clamped.
  	 * Decrease this value if you want to allow for further zooming into the viewer.
  	 * If this value is lowered too much it can cause graphical corruption due to floating point arithmetic inaccuracy.
  	 */
  var windowRectMinWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The response to user panning and zooming: whether to update the view immediately while the user action is happening, or to defer the update to after the user action is complete.  The user action will be an action such as a mouse drag which causes panning and/or zooming to occur.
  	 *
  	 *
  	 * Valid values:
  	 * "deferred" Defer the view update until after the user action is complete.
  	 * "immediate" Update the view immediately while the user action is happening.
  	 */
  var windowResponse: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the current Map's zoom scale.
  	 */
  var windowScale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
  	 */
  var zoomTileCacheSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the current Map's zoomability.
  	 */
  var zoomable: js.UndefOr[scala.Boolean] = js.undefined
}

object IgMap {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igMap
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    autoMarginHeight: scala.Int | scala.Double = null,
    autoMarginWidth: scala.Int | scala.Double = null,
    backgroundContent: IgMapBackgroundContent = null,
    browserNotSupported: BrowserNotSupportedEvent = null,
    circleMarkerTemplate: js.Any = null,
    crosshairPoint: IgMapCrosshairPoint = null,
    crosshairVisibility: java.lang.String = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    defaultInteraction: java.lang.String = null,
    diamondMarkerTemplate: js.Any = null,
    dragModifier: java.lang.String = null,
    gridAreaRectChanged: GridAreaRectChangedEvent = null,
    height: java.lang.String | scala.Double = null,
    hexagonMarkerTemplate: js.Any = null,
    hexagramMarkerTemplate: js.Any = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    overviewPlusDetailPaneBackgroundImageUri: java.lang.String = null,
    panModifier: java.lang.String = null,
    pentagonMarkerTemplate: js.Any = null,
    pentagramMarkerTemplate: js.Any = null,
    plotAreaBackground: java.lang.String = null,
    preferHigherResolutionTiles: js.UndefOr[scala.Boolean] = js.undefined,
    previewRect: js.Any = null,
    pyramidMarkerTemplate: js.Any = null,
    refreshCompleted: RefreshCompletedEvent = null,
    regional: java.lang.String | js.Object = null,
    responseDataKey: java.lang.String = null,
    series: js.Array[IgMapSeries] = null,
    seriesCursorMouseMove: SeriesCursorMouseMoveEvent = null,
    seriesMouseEnter: SeriesMouseEnterEvent = null,
    seriesMouseLeave: SeriesMouseLeaveEvent = null,
    seriesMouseLeftButtonDown: SeriesMouseLeftButtonDownEvent = null,
    seriesMouseLeftButtonUp: SeriesMouseLeftButtonUpEvent = null,
    seriesMouseMove: SeriesMouseMoveEvent = null,
    squareMarkerTemplate: js.Any = null,
    tetragramMarkerTemplate: js.Any = null,
    theme: java.lang.String = null,
    tooltipHidden: TooltipHiddenEvent = null,
    tooltipHiding: TooltipHidingEvent = null,
    tooltipShowing: TooltipShowingEvent = null,
    tooltipShown: TooltipShownEvent = null,
    triangleMarkerTemplate: js.Any = null,
    triangulationStatusChanged: TriangulationStatusChangedEvent = null,
    useTiledZooming: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null,
    windowPositionHorizontal: scala.Int | scala.Double = null,
    windowPositionVertical: scala.Int | scala.Double = null,
    windowRect: js.Any = null,
    windowRectChanged: WindowRectChangedEvent = null,
    windowRectMinWidth: scala.Int | scala.Double = null,
    windowResponse: java.lang.String = null,
    windowScale: scala.Int | scala.Double = null,
    zoomTileCacheSize: scala.Int | scala.Double = null,
    zoomable: js.UndefOr[scala.Boolean] = js.undefined
  ): IgMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (autoMarginHeight != null) __obj.updateDynamic("autoMarginHeight")(autoMarginHeight.asInstanceOf[js.Any])
    if (autoMarginWidth != null) __obj.updateDynamic("autoMarginWidth")(autoMarginWidth.asInstanceOf[js.Any])
    if (backgroundContent != null) __obj.updateDynamic("backgroundContent")(backgroundContent)
    if (browserNotSupported != null) __obj.updateDynamic("browserNotSupported")(browserNotSupported)
    if (circleMarkerTemplate != null) __obj.updateDynamic("circleMarkerTemplate")(circleMarkerTemplate)
    if (crosshairPoint != null) __obj.updateDynamic("crosshairPoint")(crosshairPoint)
    if (crosshairVisibility != null) __obj.updateDynamic("crosshairVisibility")(crosshairVisibility)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (defaultInteraction != null) __obj.updateDynamic("defaultInteraction")(defaultInteraction)
    if (diamondMarkerTemplate != null) __obj.updateDynamic("diamondMarkerTemplate")(diamondMarkerTemplate)
    if (dragModifier != null) __obj.updateDynamic("dragModifier")(dragModifier)
    if (gridAreaRectChanged != null) __obj.updateDynamic("gridAreaRectChanged")(gridAreaRectChanged)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hexagonMarkerTemplate != null) __obj.updateDynamic("hexagonMarkerTemplate")(hexagonMarkerTemplate)
    if (hexagramMarkerTemplate != null) __obj.updateDynamic("hexagramMarkerTemplate")(hexagramMarkerTemplate)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (overviewPlusDetailPaneBackgroundImageUri != null) __obj.updateDynamic("overviewPlusDetailPaneBackgroundImageUri")(overviewPlusDetailPaneBackgroundImageUri)
    if (panModifier != null) __obj.updateDynamic("panModifier")(panModifier)
    if (pentagonMarkerTemplate != null) __obj.updateDynamic("pentagonMarkerTemplate")(pentagonMarkerTemplate)
    if (pentagramMarkerTemplate != null) __obj.updateDynamic("pentagramMarkerTemplate")(pentagramMarkerTemplate)
    if (plotAreaBackground != null) __obj.updateDynamic("plotAreaBackground")(plotAreaBackground)
    if (!js.isUndefined(preferHigherResolutionTiles)) __obj.updateDynamic("preferHigherResolutionTiles")(preferHigherResolutionTiles)
    if (previewRect != null) __obj.updateDynamic("previewRect")(previewRect)
    if (pyramidMarkerTemplate != null) __obj.updateDynamic("pyramidMarkerTemplate")(pyramidMarkerTemplate)
    if (refreshCompleted != null) __obj.updateDynamic("refreshCompleted")(refreshCompleted)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesCursorMouseMove != null) __obj.updateDynamic("seriesCursorMouseMove")(seriesCursorMouseMove)
    if (seriesMouseEnter != null) __obj.updateDynamic("seriesMouseEnter")(seriesMouseEnter)
    if (seriesMouseLeave != null) __obj.updateDynamic("seriesMouseLeave")(seriesMouseLeave)
    if (seriesMouseLeftButtonDown != null) __obj.updateDynamic("seriesMouseLeftButtonDown")(seriesMouseLeftButtonDown)
    if (seriesMouseLeftButtonUp != null) __obj.updateDynamic("seriesMouseLeftButtonUp")(seriesMouseLeftButtonUp)
    if (seriesMouseMove != null) __obj.updateDynamic("seriesMouseMove")(seriesMouseMove)
    if (squareMarkerTemplate != null) __obj.updateDynamic("squareMarkerTemplate")(squareMarkerTemplate)
    if (tetragramMarkerTemplate != null) __obj.updateDynamic("tetragramMarkerTemplate")(tetragramMarkerTemplate)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipHidden != null) __obj.updateDynamic("tooltipHidden")(tooltipHidden)
    if (tooltipHiding != null) __obj.updateDynamic("tooltipHiding")(tooltipHiding)
    if (tooltipShowing != null) __obj.updateDynamic("tooltipShowing")(tooltipShowing)
    if (tooltipShown != null) __obj.updateDynamic("tooltipShown")(tooltipShown)
    if (triangleMarkerTemplate != null) __obj.updateDynamic("triangleMarkerTemplate")(triangleMarkerTemplate)
    if (triangulationStatusChanged != null) __obj.updateDynamic("triangulationStatusChanged")(triangulationStatusChanged)
    if (!js.isUndefined(useTiledZooming)) __obj.updateDynamic("useTiledZooming")(useTiledZooming)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowPositionHorizontal != null) __obj.updateDynamic("windowPositionHorizontal")(windowPositionHorizontal.asInstanceOf[js.Any])
    if (windowPositionVertical != null) __obj.updateDynamic("windowPositionVertical")(windowPositionVertical.asInstanceOf[js.Any])
    if (windowRect != null) __obj.updateDynamic("windowRect")(windowRect)
    if (windowRectChanged != null) __obj.updateDynamic("windowRectChanged")(windowRectChanged)
    if (windowRectMinWidth != null) __obj.updateDynamic("windowRectMinWidth")(windowRectMinWidth.asInstanceOf[js.Any])
    if (windowResponse != null) __obj.updateDynamic("windowResponse")(windowResponse)
    if (windowScale != null) __obj.updateDynamic("windowScale")(windowScale.asInstanceOf[js.Any])
    if (zoomTileCacheSize != null) __obj.updateDynamic("zoomTileCacheSize")(zoomTileCacheSize.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    __obj.asInstanceOf[IgMap]
  }
}

