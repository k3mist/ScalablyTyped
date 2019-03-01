package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cursor Based Paging Object wrappers used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#cursor-based-paging-object)
  */
trait CursorBasedPagingObject[T] extends js.Object {
  var cursors: CursorObject
  var href: java.lang.String
  var items: js.Array[T]
  var limit: scala.Double
  var next: java.lang.String
  var total: scala.Double
}

object CursorBasedPagingObject {
  @scala.inline
  def apply[T](
    cursors: CursorObject,
    href: java.lang.String,
    items: js.Array[T],
    limit: scala.Double,
    next: java.lang.String,
    total: scala.Double
  ): CursorBasedPagingObject[T] = {
    val __obj = js.Dynamic.literal(cursors = cursors, href = href, items = items, limit = limit, next = next, total = total)
  
    __obj.asInstanceOf[CursorBasedPagingObject[T]]
  }
}

