package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapLoadOptions
  extends IMapOptions
     with IViewOptions {
  /** 
    * @deprecated
    * The Bing Maps Key used to authenticate the application.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference. This option will continue to work.
    */
  var credentials: js.UndefOr[java.lang.String] = js.undefined
}

object IMapLoadOptions {
  @scala.inline
  def apply(
    allowHidingLabelsOfRoad: js.UndefOr[scala.Boolean] = js.undefined,
    allowInfoboxOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | Color = null,
    bounds: LocationRect = null,
    center: Location = null,
    centerOffset: Point = null,
    credentials: java.lang.String = null,
    customMapStyle: ICustomMapStyle = null,
    disableBirdseye: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardInput: js.UndefOr[scala.Boolean] = js.undefined,
    disableMapTypeSelectorMouseOver: js.UndefOr[scala.Boolean] = js.undefined,
    disablePanning: js.UndefOr[scala.Boolean] = js.undefined,
    disableScrollWheelZoom: js.UndefOr[scala.Boolean] = js.undefined,
    disableStreetside: js.UndefOr[scala.Boolean] = js.undefined,
    disableStreetsideAutoCoverage: js.UndefOr[scala.Boolean] = js.undefined,
    disableZooming: js.UndefOr[scala.Boolean] = js.undefined,
    enableCORS: js.UndefOr[scala.Boolean] = js.undefined,
    enableClickableLogo: js.UndefOr[scala.Boolean] = js.undefined,
    enableHighDpi: js.UndefOr[scala.Boolean] = js.undefined,
    enableInertia: js.UndefOr[scala.Boolean] = js.undefined,
    heading: scala.Int | scala.Double = null,
    labelOverlay: LabelOverlay = null,
    liteMode: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeId: MapTypeId = null,
    maxBounds: LocationRect = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    navigationBarMode: NavigationBarMode = null,
    navigationBarOrientation: NavigationBarOrientation = null,
    padding: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null,
    showBreadcrumb: js.UndefOr[scala.Boolean] = js.undefined,
    showDashboard: js.UndefOr[scala.Boolean] = js.undefined,
    showLocateMeButton: js.UndefOr[scala.Boolean] = js.undefined,
    showLogo: js.UndefOr[scala.Boolean] = js.undefined,
    showMapTypeSelector: js.UndefOr[scala.Boolean] = js.undefined,
    showScalebar: js.UndefOr[scala.Boolean] = js.undefined,
    showTermsLink: js.UndefOr[scala.Boolean] = js.undefined,
    showTrafficButton: js.UndefOr[scala.Boolean] = js.undefined,
    showZoomButtons: js.UndefOr[scala.Boolean] = js.undefined,
    streetsideOptions: IStreetsideOptions = null,
    supportedMapTypes: js.Array[MapTypeId] = null,
    zoom: scala.Int | scala.Double = null
  ): IMapLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHidingLabelsOfRoad)) __obj.updateDynamic("allowHidingLabelsOfRoad")(allowHidingLabelsOfRoad)
    if (!js.isUndefined(allowInfoboxOverflow)) __obj.updateDynamic("allowInfoboxOverflow")(allowInfoboxOverflow)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center)
    if (centerOffset != null) __obj.updateDynamic("centerOffset")(centerOffset)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle)
    if (!js.isUndefined(disableBirdseye)) __obj.updateDynamic("disableBirdseye")(disableBirdseye)
    if (!js.isUndefined(disableKeyboardInput)) __obj.updateDynamic("disableKeyboardInput")(disableKeyboardInput)
    if (!js.isUndefined(disableMapTypeSelectorMouseOver)) __obj.updateDynamic("disableMapTypeSelectorMouseOver")(disableMapTypeSelectorMouseOver)
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning)
    if (!js.isUndefined(disableScrollWheelZoom)) __obj.updateDynamic("disableScrollWheelZoom")(disableScrollWheelZoom)
    if (!js.isUndefined(disableStreetside)) __obj.updateDynamic("disableStreetside")(disableStreetside)
    if (!js.isUndefined(disableStreetsideAutoCoverage)) __obj.updateDynamic("disableStreetsideAutoCoverage")(disableStreetsideAutoCoverage)
    if (!js.isUndefined(disableZooming)) __obj.updateDynamic("disableZooming")(disableZooming)
    if (!js.isUndefined(enableCORS)) __obj.updateDynamic("enableCORS")(enableCORS)
    if (!js.isUndefined(enableClickableLogo)) __obj.updateDynamic("enableClickableLogo")(enableClickableLogo)
    if (!js.isUndefined(enableHighDpi)) __obj.updateDynamic("enableHighDpi")(enableHighDpi)
    if (!js.isUndefined(enableInertia)) __obj.updateDynamic("enableInertia")(enableInertia)
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (labelOverlay != null) __obj.updateDynamic("labelOverlay")(labelOverlay)
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode)
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId)
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (navigationBarMode != null) __obj.updateDynamic("navigationBarMode")(navigationBarMode)
    if (navigationBarOrientation != null) __obj.updateDynamic("navigationBarOrientation")(navigationBarOrientation)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(showBreadcrumb)) __obj.updateDynamic("showBreadcrumb")(showBreadcrumb)
    if (!js.isUndefined(showDashboard)) __obj.updateDynamic("showDashboard")(showDashboard)
    if (!js.isUndefined(showLocateMeButton)) __obj.updateDynamic("showLocateMeButton")(showLocateMeButton)
    if (!js.isUndefined(showLogo)) __obj.updateDynamic("showLogo")(showLogo)
    if (!js.isUndefined(showMapTypeSelector)) __obj.updateDynamic("showMapTypeSelector")(showMapTypeSelector)
    if (!js.isUndefined(showScalebar)) __obj.updateDynamic("showScalebar")(showScalebar)
    if (!js.isUndefined(showTermsLink)) __obj.updateDynamic("showTermsLink")(showTermsLink)
    if (!js.isUndefined(showTrafficButton)) __obj.updateDynamic("showTrafficButton")(showTrafficButton)
    if (!js.isUndefined(showZoomButtons)) __obj.updateDynamic("showZoomButtons")(showZoomButtons)
    if (streetsideOptions != null) __obj.updateDynamic("streetsideOptions")(streetsideOptions)
    if (supportedMapTypes != null) __obj.updateDynamic("supportedMapTypes")(supportedMapTypes)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapLoadOptions]
  }
}

