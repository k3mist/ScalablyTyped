package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPhotosResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of photos. The maximum number of items returned is based on the
    * pageSize field
    * in the request.
    */
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
}

object ListPhotosResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, photos: js.Array[Photo] = null): ListPhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    __obj.asInstanceOf[ListPhotosResponse]
  }
}

