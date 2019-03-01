package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External Url Object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
trait ExternalUrlObject extends js.Object {
  var spotify: java.lang.String
}

object ExternalUrlObject {
  @scala.inline
  def apply(spotify: java.lang.String): ExternalUrlObject = {
    val __obj = js.Dynamic.literal(spotify = spotify)
  
    __obj.asInstanceOf[ExternalUrlObject]
  }
}

