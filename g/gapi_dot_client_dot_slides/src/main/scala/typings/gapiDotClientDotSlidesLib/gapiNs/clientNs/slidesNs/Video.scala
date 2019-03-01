package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  /** The video source's unique identifier for this video. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The video source. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An URL to a video. The URL is valid as long as the source video
    * exists and sharing settings do not change.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The properties of the video. */
  var videoProperties: js.UndefOr[VideoProperties] = js.undefined
}

object Video {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    source: java.lang.String = null,
    url: java.lang.String = null,
    videoProperties: VideoProperties = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (source != null) __obj.updateDynamic("source")(source)
    if (url != null) __obj.updateDynamic("url")(url)
    if (videoProperties != null) __obj.updateDynamic("videoProperties")(videoProperties)
    __obj.asInstanceOf[Video]
  }
}

