package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html5AdBuilder[Html5Ad] extends AdBuilder[Html5AdBuilder[Html5Ad]] {
  def withDimensions(dimensions: java.lang.String): Html5AdBuilder[Html5Ad]
  def withDisplayUrl(displayUrl: java.lang.String): Html5AdBuilder[Html5Ad]
  def withEntryPoint(entryPoint: java.lang.String): Html5AdBuilder[Html5Ad]
  def withMediaBundle(mediaBundle: Media): Html5AdBuilder[Html5Ad]
  def withName(name: java.lang.String): Html5AdBuilder[Html5Ad]
}

object Html5AdBuilder {
  @scala.inline
  def apply[Html5Ad](
    build: js.Function0[AdWordsOperation[Html5AdBuilder[Html5Ad]]],
    withCustomParameters: js.Function1[js.Object, Html5AdBuilder[Html5Ad]],
    withDimensions: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]],
    withDisplayUrl: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]],
    withEntryPoint: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]],
    withFinalUrl: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]],
    withMediaBundle: js.Function1[Media, Html5AdBuilder[Html5Ad]],
    withMobileFinalUrl: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]],
    withName: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]],
    withTrackingTemplate: js.Function1[java.lang.String, Html5AdBuilder[Html5Ad]]
  ): Html5AdBuilder[Html5Ad] = {
    val __obj = js.Dynamic.literal(build = build, withCustomParameters = withCustomParameters, withDimensions = withDimensions, withDisplayUrl = withDisplayUrl, withEntryPoint = withEntryPoint, withFinalUrl = withFinalUrl, withMediaBundle = withMediaBundle, withMobileFinalUrl = withMobileFinalUrl, withName = withName, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[Html5AdBuilder[Html5Ad]]
  }
}

