package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a set of media capture parameters that a device supports. */
trait ConfigurationData extends js.Object {
  /** The height of the image or video in pixels. The value is zero for sound clips. */
  var height: scala.Double
  /** The ASCII-encoded lowercase string representing the media type. */
  var `type`: java.lang.String
  /** The width of the image or video in pixels. The value is zero for sound clips. */
  var width: scala.Double
}

object ConfigurationData {
  @scala.inline
  def apply(height: scala.Double, `type`: java.lang.String, width: scala.Double): ConfigurationData = {
    val __obj = js.Dynamic.literal(height = height, `type` = `type`, width = width)
  
    __obj.asInstanceOf[ConfigurationData]
  }
}

