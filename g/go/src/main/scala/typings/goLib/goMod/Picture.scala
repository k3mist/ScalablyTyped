package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Picture is a GraphObject that shows an image, video-frame, or Canvas element.
  * You can specify what to show by either setting the .source URL property
  * to a URL string or the .element property to an HTMLImageElement,
  * HTMLCanvasElement, or HTMLVideoElement.
  */
@JSImport("go", "Picture")
@js.native
/**
  * The constructor creates a picture that shows nothing until the .source or .element is specified.
  */
class Picture ()
  extends goLib.goMod.goNs.Picture

/* static members */
@JSImport("go", "Picture")
@js.native
object Picture extends js.Object {
  def clearCache(): scala.Unit = js.native
  def clearCache(url: java.lang.String): scala.Unit = js.native
}

