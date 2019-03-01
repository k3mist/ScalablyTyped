package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanorama extends js.Object {
  def getAngularBBox(): js.Array[scala.Double]
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow]
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker]
  def getCoordSystem(): ICoordSystem
  def getDefaultDirection(): js.Array[scala.Double]
  def getDefaultSpan(): js.Array[scala.Double]
  def getGraph(): IPanoramaGraph | scala.Null
  def getMarkers(): js.Array[IPanoramaMarker]
  def getName(): java.lang.String
  def getPosition(): js.Array[scala.Double]
  def getTileLevels(): js.Array[IPanoramaTileLevel]
  def getTileSize(): js.Array[scala.Double]
}

object IPanorama {
  @scala.inline
  def apply(
    getAngularBBox: js.Function0[js.Array[scala.Double]],
    getConnectionArrows: js.Function0[js.Array[IPanoramaConnectionArrow]],
    getConnectionMarkers: js.Function0[js.Array[IPanoramaConnectionMarker]],
    getCoordSystem: js.Function0[ICoordSystem],
    getDefaultDirection: js.Function0[js.Array[scala.Double]],
    getDefaultSpan: js.Function0[js.Array[scala.Double]],
    getGraph: js.Function0[IPanoramaGraph | scala.Null],
    getMarkers: js.Function0[js.Array[IPanoramaMarker]],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[js.Array[scala.Double]],
    getTileLevels: js.Function0[js.Array[IPanoramaTileLevel]],
    getTileSize: js.Function0[js.Array[scala.Double]]
  ): IPanorama = {
    val __obj = js.Dynamic.literal(getAngularBBox = getAngularBBox, getConnectionArrows = getConnectionArrows, getConnectionMarkers = getConnectionMarkers, getCoordSystem = getCoordSystem, getDefaultDirection = getDefaultDirection, getDefaultSpan = getDefaultSpan, getGraph = getGraph, getMarkers = getMarkers, getName = getName, getPosition = getPosition, getTileLevels = getTileLevels, getTileSize = getTileSize)
  
    __obj.asInstanceOf[IPanorama]
  }
}

