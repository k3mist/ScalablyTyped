package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext
  extends stdLib.Object {
  /**
    * The camera used to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var camera: RenderCamera
  /**
    * The WebGL rendering context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var gl: stdLib.WebGLRenderingContext
  /**
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def bindRenderTarget(): scala.Unit
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def resetWebGLState(): scala.Unit
}

object RenderContext {
  @scala.inline
  def apply(
    bindRenderTarget: () => scala.Unit,
    camera: RenderCamera,
    constructor: js.Function,
    gl: stdLib.WebGLRenderingContext,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    resetWebGLState: () => scala.Unit,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(bindRenderTarget = js.Any.fromFunction0(bindRenderTarget), camera = camera, constructor = constructor, gl = gl, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resetWebGLState = js.Any.fromFunction0(resetWebGLState), sunLight = sunLight)
  
    __obj.asInstanceOf[RenderContext]
  }
}

