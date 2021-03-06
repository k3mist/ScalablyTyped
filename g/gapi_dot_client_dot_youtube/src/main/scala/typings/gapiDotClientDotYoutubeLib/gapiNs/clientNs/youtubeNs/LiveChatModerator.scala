package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModerator extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the moderator. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatModerator". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the moderator. */
  var snippet: js.UndefOr[LiveChatModeratorSnippet] = js.undefined
}

object LiveChatModerator {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: LiveChatModeratorSnippet = null
  ): LiveChatModerator = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[LiveChatModerator]
  }
}

