package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Artist Object
  * [artist object (full)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectFull extends ArtistObjectSimplified {
  var followers: FollowersObject
  var genres: js.Array[java.lang.String]
  var images: js.Array[ImageObject]
  var popularity: scala.Double
}

object ArtistObjectFull {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    genres: js.Array[java.lang.String],
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    popularity: scala.Double,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.artist,
    uri: java.lang.String
  ): ArtistObjectFull = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, followers = followers, genres = genres, href = href, id = id, images = images, name = name, popularity = popularity, `type` = `type`, uri = uri)
  
    __obj.asInstanceOf[ArtistObjectFull]
  }
}

