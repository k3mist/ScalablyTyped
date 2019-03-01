package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaylistSettings extends VideoOrPlaylistSettings {
  /**
  		 * Start index of the playlist, if not 0.
  		 */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Identifier for the listType videos list.
  		 */
  var list: java.lang.String
  /**
  		 * Which type of content loads in the player.
  		 */
  var listType: js.UndefOr[ListType] = js.undefined
}

object IPlaylistSettings {
  @scala.inline
  def apply(
    list: java.lang.String,
    endSeconds: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    listType: ListType = null,
    startSeconds: scala.Int | scala.Double = null,
    suggestedQuality: SuggestedVideoQuality = null
  ): IPlaylistSettings = {
    val __obj = js.Dynamic.literal(list = list)
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaylistSettings]
  }
}

