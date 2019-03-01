package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: gapiDotClientDotVisionLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchAnnotateImagesResponse]
}

object ImagesResource {
  @scala.inline
  def apply(
    annotate: js.Function1[
      gapiDotClientDotVisionLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchAnnotateImagesResponse]
    ]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(annotate = annotate)
  
    __obj.asInstanceOf[ImagesResource]
  }
}

