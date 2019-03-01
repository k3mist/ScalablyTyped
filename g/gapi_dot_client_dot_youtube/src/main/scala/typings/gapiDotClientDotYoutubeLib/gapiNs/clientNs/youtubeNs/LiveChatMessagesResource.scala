package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a message to a live chat. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatMessage]
  /** Lists live chat messages for a specific chat. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKeyLiveChatId): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatMessageListResponse]
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveChatMessage]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKeyLiveChatId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveChatMessageListResponse]
    ]
  ): LiveChatMessagesResource = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list)
  
    __obj.asInstanceOf[LiveChatMessagesResource]
  }
}

