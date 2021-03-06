package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new ban to the chat. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatBan]
}

object LiveChatBansResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotYoutubeLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[LiveChatBan]
  ): LiveChatBansResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[LiveChatBansResource]
  }
}

