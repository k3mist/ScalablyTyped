package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessage extends js.Object {
  /** The authorDetails object contains basic details about the user that posted this message. */
  var authorDetails: js.UndefOr[LiveChatMessageAuthorDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the message. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessage". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the message. */
  var snippet: js.UndefOr[LiveChatMessageSnippet] = js.undefined
}

object LiveChatMessage {
  @scala.inline
  def apply(
    authorDetails: LiveChatMessageAuthorDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: LiveChatMessageSnippet = null
  ): LiveChatMessage = {
    val __obj = js.Dynamic.literal()
    if (authorDetails != null) __obj.updateDynamic("authorDetails")(authorDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[LiveChatMessage]
  }
}

