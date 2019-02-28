package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshConstructor
  extends /**
  * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes). The vertices include geographic position, normals that affect lighting/shading and uv coordinates that can be used to map images to the mesh. Vertices are combined into 3D primitives to render the mesh in the scene (only triangle primitives are currently supported).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
  */
org.scalablytyped.runtime.Instantiable0[Mesh]
     with org.scalablytyped.runtime.Instantiable1[/* properties */ MeshProperties, Mesh] {
  /**
    * Creates a mesh representing a box. The spatial reference of the resulting mesh is the same as the location where it is placed.  **Box UV coordinate space**  The box geometry will have UV coordinates generated according to the following scheme:  <img src="../../assets/img/apiref/geometry/mesh-box-uv.png" width="300" height="300"/>
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    *
    * @param location The location bottom center of the box.
    * @param params Additional parameters.
    * @param params.size A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location.
    * @param params.geographic Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    * @param params.material The material to be used for the mesh.
    * @param params.imageFace The face for generating image uv coordinates. By default, a single set of unwrapped UV coordinates are generated for all the faces. By setting the `imageFace` parameter to one of `east`, `west`, `north`, `south`, `up` or `down`, the specified face will have full sized UV coordinates while the other faces will pertain their regular unwrapped UV coordinates. This is useful for applying an image only to a single face of the box. The provided `material` parameter will be applied to the specified `imageFace`. The resulting mesh will have two components, the first contains the selected image face and the second contains the other faces of the box.
    *
    */
  def createBox(location: Point): Mesh = js.native
  def createBox(location: Point, params: MeshCreateBoxParams): Mesh = js.native
  /**
    * Creates a mesh representing a cylinder. The spatial reference of the resulting mesh is the same as the location where it is placed.  **Cylinder UV coordinate space**  The cylinder geometry will have UV coordinates generated according to the following scheme (example is shown for 8 vertices cylinder):  <img src="../../assets/img/apiref/geometry/mesh-cylinder-uv.png" width="300" height="300"/>
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    *
    * @param location The location of the bottom center of the cylinder.
    * @param params Additional parameters.
    * @param params.size A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location.
    * @param params.geographic Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    * @param params.densificationFactor The additional number of subdivisions for generating the mesh representing a cylinder. A densificationFactor parameter of 0 will generate a default of 16 vertices to approximate the cylinder. A densificationFactor of 1 will generate 32 vertices, etc. The larger the densificationFactor, the better the mesh will approximate a perfect cylinder (at the cost of processing and rendering performance).
    * @param params.material The material to be used for the mesh.
    *
    */
  def createCylinder(location: Point): Mesh = js.native
  def createCylinder(location: Point, params: MeshCreateCylinderParams): Mesh = js.native
  /**
    * Creates a new mesh geometry from a polygon geometry. The resulting mesh contains only a position vertex attribute and a single component with faces. The default shading will be set to `flat`. The spatial reference of the resulting mesh is the same as the input polygon. The resulting mesh will not contain any uv nor normal vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    *
    * @param polygon The input polygon.
    * @param params Optional parameters.
    * @param params.material The material to be used for the mesh.
    *
    */
  def createFromPolygon(polygon: Polygon): Mesh = js.native
  def createFromPolygon(polygon: Polygon, params: MeshCreateFromPolygonParams): Mesh = js.native
  /**
    * Creates a mesh representing a plane. The spatial reference of the resulting mesh is the same as the location where it is placed. A plane consists of two triangles and may be conveniently oriented at creation time.  **Plane UV coordinate space**  The plane geometry will have UV coordinates generated according to the following scheme:  <img src="../../assets/img/apiref/geometry/mesh-plane-uv.png" width="300" height="300"/>
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    *
    * @param location The location of the bottom center of the plane.
    * @param params Additional parameters.
    * @param params.size A uniform size value or an object containing individual values width and height. The unit of the size values is derived from the spatial reference of the provided location.
    * @param params.facing Direction the plane is facing. Possible values are `east`, `west`, `north`, `south`, `up` and `down`. Defaults to `up`,
    * @param params.geographic Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    * @param params.material The material to be used for the mesh.
    *
    */
  def createPlane(location: Point): Mesh = js.native
  def createPlane(location: Point, params: MeshCreatePlaneParams): Mesh = js.native
  /**
    * Creates a mesh representing a sphere. The spatial reference of the resulting mesh is the same as the location where it is placed.  **Sphere UV coordinate space**  The sphere geometry will have UV coordinates generated according to the following scheme (example is shown for 8x8 vertices sphere):  <img src="../../assets/img/apiref/geometry/mesh-sphere-uv.png" width="300" height="300"/>
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    *
    * @param location The location of the bottom center of the sphere.
    * @param params Additional parameters.
    * @param params.size A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location.
    * @param params.geographic Indicates whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    * @param params.densificationFactor The additional number of subdivisions for generating the mesh representing a sphere. A densificationFactor parameter of 0 will generate a default of 16-by-16 vertices to approximate the sphere. A densificationFactor of 1 will generate 32-by-32 vertices, etc. The larger the densificationFactor, the better the mesh will approximate a perfect sphere (at the cost of processing and rendering performance).
    * @param params.material The material to be used for the mesh.
    *
    */
  def createSphere(location: Point): Mesh = js.native
  def createSphere(location: Point, params: MeshCreateSphereParams): Mesh = js.native
  def fromJSON(json: js.Any): Mesh = js.native
}

