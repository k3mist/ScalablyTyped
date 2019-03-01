package typings
package heremapsLib.HNs.mapNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a layer which provides marker objects to the renderer.
  */
trait IMarkerLayer extends js.Object {
  /**
    * This method requests dom marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestDomMarkers(
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse
  /**
    * This method requests marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestMarkers(
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse
}

object IMarkerLayer {
  @scala.inline
  def apply(
    requestDomMarkers: js.Function4[
      heremapsLib.HNs.geoNs.Rect, 
      scala.Double, 
      scala.Boolean, 
      heremapsLib.HNs.mathNs.Point, 
      heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse
    ],
    requestMarkers: js.Function4[
      heremapsLib.HNs.geoNs.Rect, 
      scala.Double, 
      scala.Boolean, 
      heremapsLib.HNs.mathNs.Point, 
      heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse
    ]
  ): IMarkerLayer = {
    val __obj = js.Dynamic.literal(requestDomMarkers = requestDomMarkers, requestMarkers = requestMarkers)
  
    __obj.asInstanceOf[IMarkerLayer]
  }
}

