package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var drafts: DraftsResource
  var history: HistoryResource
  var labels: LabelsResource
  var messages: MessagesResource
  var settings: SettingsResource
  var threads: ThreadsResource
  /** Gets the current user's Gmail profile. */
  def getProfile(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[WatchResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    drafts: DraftsResource,
    getProfile: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Profile]
    ],
    history: HistoryResource,
    labels: LabelsResource,
    messages: MessagesResource,
    settings: SettingsResource,
    stop: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    threads: ThreadsResource,
    watch: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[WatchResponse]
    ]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(drafts = drafts, getProfile = getProfile, history = history, labels = labels, messages = messages, settings = settings, stop = stop, threads = threads, watch = watch)
  
    __obj.asInstanceOf[UsersResource]
  }
}

