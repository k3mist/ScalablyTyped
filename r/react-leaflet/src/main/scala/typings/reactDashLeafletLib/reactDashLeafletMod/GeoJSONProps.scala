package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.GeoJSONOptions because var conflicts: attribution, pane. Inlined coordsToLatLng, filter, onEachFeature, pointToLayer, style- reactDashLeafletLib.reactDashLeafletMod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onmouseout, onmouseover. Inlined onlayeradd, onlayerremove */ trait GeoJSONProps extends PathProps {
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]), 
      leafletLib.leafletMod.LatLng
    ]
  ] = js.undefined
  var data: geojsonLib.geojsonMod.GeoJsonObject
  /**
    * A Function that will be used to decide whether to show a feature or not.
    *
    * The default is to show all features:
    *
    * ```
    * function (geoJsonFeature) {
    *     return true;
    * }
    * ```
    */
  var filter: js.UndefOr[
    js.Function1[
      /* geoJsonFeature */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * A Function that will be called once for each created Feature, after it
    * has been created and styled. Useful for attaching events and popups to features.
    *
    * The default is to do nothing with the newly created layers:
    *
    * ```
    * function (feature, layer) {}
    * ```
    */
  var onEachFeature: js.UndefOr[
    js.Function2[
      /* feature */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, js.Any], 
      /* layer */ leafletLib.leafletMod.Layer, 
      scala.Unit
    ]
  ] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit]] = js.undefined
  /**
    * A Function defining how GeoJSON points spawn Leaflet layers.
    * It is internally called when data is added, passing the GeoJSON point
    * feature and its LatLng.
    *
    * The default is to spawn a default Marker:
    *
    * ```
    * function(geoJsonPoint, latlng) {
    *     return L.marker(latlng);
    * }
    * ```
    */
  var pointToLayer: js.UndefOr[
    js.Function2[
      /* geoJsonPoint */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, js.Any], 
      /* latlng */ leafletLib.leafletMod.LatLng, 
      leafletLib.leafletMod.Layer
    ]
  ] = js.undefined
   // should import GeoJSON typings
  /**
    * PathOptions or a Function defining the Path options for styling GeoJSON lines and polygons,
    * called internally when data is added.
    *
    * The default value is to not override any defaults:
    *
    * ```
    * function (geoJsonFeature) {
    *     return {}
    * }
    * ```
    */
  var style: js.UndefOr[leafletLib.leafletMod.PathOptions | leafletLib.leafletMod.StyleFunction[js.Any]] = js.undefined
}

