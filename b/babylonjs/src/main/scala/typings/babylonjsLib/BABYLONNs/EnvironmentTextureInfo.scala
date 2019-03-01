package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raw texture data and descriptor sufficient for WebGL texture upload
  */
trait EnvironmentTextureInfo extends js.Object {
  /**
    * Irradiance information stored in the file.
    */
  var irradiance: js.Any
  /**
    * Specular information stored in the file.
    */
  var specular: js.Any
  /**
    * Version of the environment map
    */
  var version: scala.Double
  /**
    * Width of image
    */
  var width: scala.Double
}

object EnvironmentTextureInfo {
  @scala.inline
  def apply(irradiance: js.Any, specular: js.Any, version: scala.Double, width: scala.Double): EnvironmentTextureInfo = {
    val __obj = js.Dynamic.literal(irradiance = irradiance, specular = specular, version = version, width = width)
  
    __obj.asInstanceOf[EnvironmentTextureInfo]
  }
}

