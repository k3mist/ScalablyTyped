package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushAdminCallbacks extends js.Object {
  var channelSubscriptions: PushChannelSubscriptionsCallbacks = js.native
  var deviceRegistrations: PushDeviceRegistrationsCallbacks = js.native
  def publish(recipient: js.Any, payload: js.Any): scala.Unit = js.native
  def publish(recipient: js.Any, payload: js.Any, callback: errorCallback): scala.Unit = js.native
}

