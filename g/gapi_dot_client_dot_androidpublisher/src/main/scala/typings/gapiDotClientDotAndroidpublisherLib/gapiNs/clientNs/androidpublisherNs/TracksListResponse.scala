package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracksListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#tracksListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var tracks: js.UndefOr[js.Array[Track]] = js.undefined
}

object TracksListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, tracks: js.Array[Track] = null): TracksListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (tracks != null) __obj.updateDynamic("tracks")(tracks)
    __obj.asInstanceOf[TracksListResponse]
  }
}

