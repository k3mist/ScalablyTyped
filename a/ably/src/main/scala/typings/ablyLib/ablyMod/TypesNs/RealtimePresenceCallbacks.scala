package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimePresenceCallbacks extends RealtimePresenceBase {
  def enter(): scala.Unit = js.native
  def enter(data: errorCallback): scala.Unit = js.native
  def enter(data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def enter(data: js.Any): scala.Unit = js.native
  def enter(data: js.Any, callback: errorCallback): scala.Unit = js.native
  def enterClient(clientId: java.lang.String): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: errorCallback): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: js.Any): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: js.Any, callback: errorCallback): scala.Unit = js.native
  def get(): scala.Unit = js.native
  def get(paramsOrCallback: RealtimePresenceParams): scala.Unit = js.native
  def get(paramsOrCallback: RealtimePresenceParams, callback: realtimePresenceGetCallback): scala.Unit = js.native
  def get(paramsOrCallback: realtimePresenceGetCallback): scala.Unit = js.native
  def get(paramsOrCallback: realtimePresenceGetCallback, callback: realtimePresenceGetCallback): scala.Unit = js.native
  def history(): scala.Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams): scala.Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams, callback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
  def leave(): scala.Unit = js.native
  def leave(data: errorCallback): scala.Unit = js.native
  def leave(data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def leave(data: js.Any): scala.Unit = js.native
  def leave(data: js.Any, callback: errorCallback): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: errorCallback): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: js.Any): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: js.Any, callback: errorCallback): scala.Unit = js.native
  def subscribe(presenceOrListener: PresenceAction): scala.Unit = js.native
  def subscribe(presenceOrListener: PresenceAction, listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(
    presenceOrListener: PresenceAction,
    listener: messageCallback[PresenceMessage],
    callbackWhenAttached: standardCallback
  ): scala.Unit = js.native
  def subscribe(presenceOrListener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(presenceOrListener: messageCallback[PresenceMessage], listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(
    presenceOrListener: messageCallback[PresenceMessage],
    listener: messageCallback[PresenceMessage],
    callbackWhenAttached: standardCallback
  ): scala.Unit = js.native
  def subscribe(presenceOrListener: js.Array[PresenceAction]): scala.Unit = js.native
  def subscribe(presenceOrListener: js.Array[PresenceAction], listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(
    presenceOrListener: js.Array[PresenceAction],
    listener: messageCallback[PresenceMessage],
    callbackWhenAttached: standardCallback
  ): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(presence: PresenceAction): scala.Unit = js.native
  def unsubscribe(presence: PresenceAction, listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(data: errorCallback): scala.Unit = js.native
  def update(data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def update(data: js.Any): scala.Unit = js.native
  def update(data: js.Any, callback: errorCallback): scala.Unit = js.native
  def updateClient(clientId: java.lang.String): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: errorCallback): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: js.Any, callback: errorCallback): scala.Unit = js.native
}

