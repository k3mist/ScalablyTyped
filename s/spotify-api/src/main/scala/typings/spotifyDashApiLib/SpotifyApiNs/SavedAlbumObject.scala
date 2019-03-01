package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait SavedAlbumObject extends js.Object {
  var added_at: java.lang.String
  var album: AlbumObjectFull
}

object SavedAlbumObject {
  @scala.inline
  def apply(added_at: java.lang.String, album: AlbumObjectFull): SavedAlbumObject = {
    val __obj = js.Dynamic.literal(added_at = added_at, album = album)
  
    __obj.asInstanceOf[SavedAlbumObject]
  }
}

