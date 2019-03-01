package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAdBuilder[ImageAd] extends AdBuilder[ImageAdBuilder[ImageAd]] {
  def withDisplayUrl(displayUrl: java.lang.String): ImageAdBuilder[ImageAd]
  def withImage(image: Media): ImageAdBuilder[ImageAd]
  def withName(name: java.lang.String): ImageAdBuilder[ImageAd]
}

object ImageAdBuilder {
  @scala.inline
  def apply[ImageAd](
    build: js.Function0[AdWordsOperation[ImageAdBuilder[ImageAd]]],
    withCustomParameters: js.Function1[js.Object, ImageAdBuilder[ImageAd]],
    withDisplayUrl: js.Function1[java.lang.String, ImageAdBuilder[ImageAd]],
    withFinalUrl: js.Function1[java.lang.String, ImageAdBuilder[ImageAd]],
    withImage: js.Function1[Media, ImageAdBuilder[ImageAd]],
    withMobileFinalUrl: js.Function1[java.lang.String, ImageAdBuilder[ImageAd]],
    withName: js.Function1[java.lang.String, ImageAdBuilder[ImageAd]],
    withTrackingTemplate: js.Function1[java.lang.String, ImageAdBuilder[ImageAd]]
  ): ImageAdBuilder[ImageAd] = {
    val __obj = js.Dynamic.literal(build = build, withCustomParameters = withCustomParameters, withDisplayUrl = withDisplayUrl, withFinalUrl = withFinalUrl, withImage = withImage, withMobileFinalUrl = withMobileFinalUrl, withName = withName, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[ImageAdBuilder[ImageAd]]
  }
}

