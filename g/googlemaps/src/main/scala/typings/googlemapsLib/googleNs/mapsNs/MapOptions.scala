package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  /**
    * Color used for the background of the Map div. This color will be visible
    * when tiles have not yet loaded as the user pans. This option can only be
    * set when the map is initialized.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** The initial Map center. Required. */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /**
    * When false, map icons are not clickable. A map icon represents a point of
    * interest, also known as a POI. By default map icons are clickable.
    */
  var clickableIcons: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables all default UI. May be overridden individually. */
  var disableDefaultUI: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables zoom and center on double click. Enabled by default. */
  var disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, prevents the map from being dragged. Dragging is enabled by
    * default.
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name or url of the cursor to display when mousing over a draggable
    * map. This property uses the css cursor attribute to change the icon. As
    * with the css property, you must specify at least one fallback cursor that
    * is not a URL. For example: draggableCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggableCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name or url of the cursor to display when the map is being dragged.
    * This property uses the css cursor attribute to change the icon. As with
    * the css property, you must specify at least one fallback cursor that is
    * not a URL. For example: draggingCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggingCursor: js.UndefOr[java.lang.String] = js.undefined
  /** The enabled/disabled state of the Fullscreen control. */
  var fullscreenControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The display options for the Fullscreen control. */
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.undefined
  /**
    * This setting controls how gestures on the map are handled.
    */
  var gestureHandling: js.UndefOr[GestureHandlingOptions] = js.undefined
  /**
    * The heading for aerial imagery in degrees measured clockwise from
    * cardinal direction North. Headings are snapped to the nearest available
    * angle for which imagery is available.
    */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /**
    * If false, prevents the map from being controlled by the keyboard.
    * Keyboard shortcuts are enabled by default.
    */
  var keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined
  /** The initial enabled/disabled state of the Map type control. */
  var mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The initial display options for the Map type control. */
  var mapTypeControlOptions: js.UndefOr[MapTypeControlOptions] = js.undefined
  /** The initial Map mapTypeId. Defaults to ROADMAP. */
  var mapTypeId: js.UndefOr[MapTypeId] = js.undefined
  /**
    * The maximum zoom level which will be displayed on the map. If omitted, or
    * set to null, the maximum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum zoom level which will be displayed on the map. If omitted, or
    * set to null, the minimum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /** If true, do not clear the contents of the Map div. */
  var noClear: js.UndefOr[scala.Boolean] = js.undefined
  var overviewMapControl: js.UndefOr[scala.Boolean] = js.undefined
  var overviewMapControlOptions: js.UndefOr[OverviewMapControlOptions] = js.undefined
  /**
    * The enabled/disabled state of the Pan control.
    * Note: The Pan control is not available in the new set of controls
    * introduced in v3.22 of the Google Maps JavaScript API. While using v3.22
    * and v3.23, you can choose to use the earlier set of controls rather than
    * the new controls, thus making the Pan control available as part of the
    * old control set. See {@link
    * https://developers.google.com/maps/articles/v322-controls-diff|What's New
    * in the v3.22 Map Controls}.
    */
  var panControl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The display options for the Pan control.
    * Note: The Pan control is not available in the new set of controls
    * introduced in v3.22 of the Google Maps JavaScript API. While using v3.22
    * and v3.23, you can choose to use the earlier set of controls rather than
    * the new controls, thus making the Pan control available as part of the
    * old control set. See {@link
    * https://developers.google.com/maps/articles/v322-controls-diff|What's New
    * in the v3.22 Map Controls}.
    */
  var panControlOptions: js.UndefOr[PanControlOptions] = js.undefined
  /** The enabled/disabled state of the Rotate control. */
  var rotateControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The display options for the Rotate control. */
  var rotateControlOptions: js.UndefOr[RotateControlOptions] = js.undefined
  /** The initial enabled/disabled state of the Scale control. */
  var scaleControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The initial display options for the Scale control. */
  var scaleControlOptions: js.UndefOr[ScaleControlOptions] = js.undefined
  /**
    * If false, disables scrollwheel zooming on the map. The scrollwheel is
    * enabled by default.
    */
  var scrollwheel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The enabled/disabled state of the sign in control. This option only
    * applies if signed_in=true has been passed as a URL parameter in the
    * bootstrap request. You may want to use this option to hide the map's sign
    * in control if you have provided another way for your users to sign in,
    * such as the Google Sign-In button. This option does not affect the
    * visibility of the Google avatar shown when the user is already signed in.
    */
  var signInControl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A StreetViewPanorama to display when the Street View pegman is dropped on
    * the map. If no panorama is specified, a default StreetViewPanorama will
    * be displayed in the map's div when the pegman is dropped.
    */
  var streetView: js.UndefOr[StreetViewPanorama] = js.undefined
  /**
    * The initial enabled/disabled state of the Street View Pegman control.
    * This control is part of the default UI, and should be set to false when
    * displaying a map type on which the Street View road overlay should not
    * appear (e.g. a non-Earth map type).
    */
  var streetViewControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The initial display options for the Street View Pegman control. */
  var streetViewControlOptions: js.UndefOr[StreetViewControlOptions] = js.undefined
  /**
    * Styles to apply to each of the default map types. Note that for
    * satellite/hybrid and terrain modes, these styles will only apply to
    * labels and geometry.
    */
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.undefined
  /**
    * Controls the automatic switching behavior for the angle of incidence of
    * the map. The only allowed values are 0 and 45. The value 0 causes the map
    * to always use a 0° overhead view regardless of the zoom level and
    * viewport. The value 45 causes the tilt angle to automatically switch to
    * 45 whenever 45° imagery is available for the current zoom level and
    * viewport, and switch back to 0 whenever 45° imagery is not available
    * (this is the default behavior). 45° imagery is only available for
    * satellite and hybrid map types, within some locations, and at some zoom
    * levels. Note: getTilt returns the current tilt angle, not the value
    * specified by this option. Because getTilt and this option refer to
    * different things, do not bind() the tilt property; doing so may yield
    * unpredictable effects.
    */
  var tilt: js.UndefOr[scala.Double] = js.undefined
  /**
    * The initial Map zoom level. Required. Valid values: Integers between
    * zero, and up to the supported maximum zoom level.
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
  /** The enabled/disabled state of the Zoom control. */
  var zoomControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The display options for the Zoom control. */
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    center: LatLng | LatLngLiteral = null,
    clickableIcons: js.UndefOr[scala.Boolean] = js.undefined,
    disableDefaultUI: js.UndefOr[scala.Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    draggableCursor: java.lang.String = null,
    draggingCursor: java.lang.String = null,
    fullscreenControl: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenControlOptions: FullscreenControlOptions = null,
    gestureHandling: GestureHandlingOptions = null,
    heading: scala.Int | scala.Double = null,
    keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControlOptions: MapTypeControlOptions = null,
    mapTypeId: MapTypeId = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noClear: js.UndefOr[scala.Boolean] = js.undefined,
    overviewMapControl: js.UndefOr[scala.Boolean] = js.undefined,
    overviewMapControlOptions: OverviewMapControlOptions = null,
    panControl: js.UndefOr[scala.Boolean] = js.undefined,
    panControlOptions: PanControlOptions = null,
    rotateControl: js.UndefOr[scala.Boolean] = js.undefined,
    rotateControlOptions: RotateControlOptions = null,
    scaleControl: js.UndefOr[scala.Boolean] = js.undefined,
    scaleControlOptions: ScaleControlOptions = null,
    scrollwheel: js.UndefOr[scala.Boolean] = js.undefined,
    signInControl: js.UndefOr[scala.Boolean] = js.undefined,
    streetView: StreetViewPanorama = null,
    streetViewControl: js.UndefOr[scala.Boolean] = js.undefined,
    streetViewControlOptions: StreetViewControlOptions = null,
    styles: js.Array[MapTypeStyle] = null,
    tilt: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null,
    zoomControl: js.UndefOr[scala.Boolean] = js.undefined,
    zoomControlOptions: ZoomControlOptions = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(clickableIcons)) __obj.updateDynamic("clickableIcons")(clickableIcons)
    if (!js.isUndefined(disableDefaultUI)) __obj.updateDynamic("disableDefaultUI")(disableDefaultUI)
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggableCursor != null) __obj.updateDynamic("draggableCursor")(draggableCursor)
    if (draggingCursor != null) __obj.updateDynamic("draggingCursor")(draggingCursor)
    if (!js.isUndefined(fullscreenControl)) __obj.updateDynamic("fullscreenControl")(fullscreenControl)
    if (fullscreenControlOptions != null) __obj.updateDynamic("fullscreenControlOptions")(fullscreenControlOptions)
    if (gestureHandling != null) __obj.updateDynamic("gestureHandling")(gestureHandling)
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts)
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl)
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions)
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noClear)) __obj.updateDynamic("noClear")(noClear)
    if (!js.isUndefined(overviewMapControl)) __obj.updateDynamic("overviewMapControl")(overviewMapControl)
    if (overviewMapControlOptions != null) __obj.updateDynamic("overviewMapControlOptions")(overviewMapControlOptions)
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl)
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions)
    if (!js.isUndefined(rotateControl)) __obj.updateDynamic("rotateControl")(rotateControl)
    if (rotateControlOptions != null) __obj.updateDynamic("rotateControlOptions")(rotateControlOptions)
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl)
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions)
    if (!js.isUndefined(scrollwheel)) __obj.updateDynamic("scrollwheel")(scrollwheel)
    if (!js.isUndefined(signInControl)) __obj.updateDynamic("signInControl")(signInControl)
    if (streetView != null) __obj.updateDynamic("streetView")(streetView)
    if (!js.isUndefined(streetViewControl)) __obj.updateDynamic("streetViewControl")(streetViewControl)
    if (streetViewControlOptions != null) __obj.updateDynamic("streetViewControlOptions")(streetViewControlOptions)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions)
    __obj.asInstanceOf[MapOptions]
  }
}

