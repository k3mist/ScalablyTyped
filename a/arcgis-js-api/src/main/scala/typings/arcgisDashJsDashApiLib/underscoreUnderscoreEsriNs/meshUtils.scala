package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait meshUtils extends js.Object {
  /**
    * Creates a mesh geometry by sampling elevation data from an elevation service on a regular grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    *
    * @param source The source from which to query the elevation data.
    * @param extent The extent from which to create the mesh.
    * @param params Optional parameters.
    * @param params.material The material.
    * @param params.demResolution Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer.queryElevation](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details on the different settings.
    *
    */
  def createFromElevation(source: ElevationLayer, extent: Extent): arcgisDashJsDashApiLib.IPromise[Mesh] = js.native
  def createFromElevation(source: ElevationLayer, extent: Extent, params: meshUtilsCreateFromElevationParams): arcgisDashJsDashApiLib.IPromise[Mesh] = js.native
  def createFromElevation(source: ElevationSampler, extent: Extent): arcgisDashJsDashApiLib.IPromise[Mesh] = js.native
  def createFromElevation(source: ElevationSampler, extent: Extent, params: meshUtilsCreateFromElevationParams): arcgisDashJsDashApiLib.IPromise[Mesh] = js.native
  def createFromElevation(source: Ground, extent: Extent): arcgisDashJsDashApiLib.IPromise[Mesh] = js.native
  def createFromElevation(source: Ground, extent: Extent, params: meshUtilsCreateFromElevationParams): arcgisDashJsDashApiLib.IPromise[Mesh] = js.native
  /**
    * Georeferences vertices specified in a Cartesian coordinate system. This is useful when converting general 3D model meshes not typically georeferenced. This method operates on mesh vertex attributes and will convert positions and normals (if specified) from a local (0, 0, 0) Cartesian system to the properly georeferenced coordinates at the specified `location`. The `location`'s coordinate system determines the units of the converted positions. If the coordinate system is WGS84, metric units are used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#georeference)
    *
    * @param vertexAttributes The position and normal buffers to georeference.
    * @param location The location at which to georeference the position and normal buffers.
    * @param params Optional parameters.
    * @param params.geographic Indicates whether to georeference relative to the globe or the projected coordinate system.
    *
    */
  def georeference(vertexAttributes: VertexAttributes, location: Point): VertexAttributes = js.native
  def georeference(vertexAttributes: VertexAttributes, location: Point, params: meshUtilsGeoreferenceParams): VertexAttributes = js.native
  /**
    * Merges multiple meshes into a single mesh. All mesh geometries must be in the same spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#merge)
    *
    * @param geometries One or more meshes.
    *
    */
  def merge(geometries: js.Array[Mesh]): Mesh = js.native
  /**
    * Projects georeferenced vertices to a Cartesian coordinate system. This is useful for converting existing scene geometry so that it can be used as source material for generating new 3D meshes. This method operates on mesh vertex attributes and will convert positions and normals (if specified) from georeferenced coordinates at the specified `location` to a local (0, 0, 0) Cartesian system. The units of the input positions are determined by the `location`'s coordinate system. If the coordinate system is WGS84, metric units are used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#ungeoreference)
    *
    * @param vertexAttributes The georeferenced position and normal buffers.
    * @param location The location to which the position and normal buffers are georeferenced.
    * @param params Optional parameters.
    * @param params.geographic Indicates whether the coordinates are georeferenced relative to the globe or the projected coordinate system.
    *
    */
  def ungeoreference(vertexAttributes: VertexAttributes, location: Point): VertexAttributes = js.native
  def ungeoreference(vertexAttributes: VertexAttributes, location: Point, params: meshUtilsUngeoreferenceParams): VertexAttributes = js.native
}

