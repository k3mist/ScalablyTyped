package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channel"s favorite videos. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var favorites: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s liked videos. Use the   playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var likes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s uploaded videos. Use the  videos.insert method to upload new videos and the videos.delete method to
    * delete previously uploaded videos.
    */
  var uploads: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s watch history. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var watchHistory: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s watch later playlist. Use the playlistItems.insert and  playlistItems.delete to add or remove items
    * from that list.
    */
  var watchLater: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Favorites {
  @scala.inline
  def apply(
    favorites: java.lang.String = null,
    likes: java.lang.String = null,
    uploads: java.lang.String = null,
    watchHistory: java.lang.String = null,
    watchLater: java.lang.String = null
  ): Anon_Favorites = {
    val __obj = js.Dynamic.literal()
    if (favorites != null) __obj.updateDynamic("favorites")(favorites)
    if (likes != null) __obj.updateDynamic("likes")(likes)
    if (uploads != null) __obj.updateDynamic("uploads")(uploads)
    if (watchHistory != null) __obj.updateDynamic("watchHistory")(watchHistory)
    if (watchLater != null) __obj.updateDynamic("watchLater")(watchLater)
    __obj.asInstanceOf[Anon_Favorites]
  }
}

