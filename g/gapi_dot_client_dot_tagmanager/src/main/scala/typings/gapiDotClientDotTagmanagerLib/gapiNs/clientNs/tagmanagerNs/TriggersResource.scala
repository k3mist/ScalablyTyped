package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a GTM Trigger. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotTagmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Trigger],
    delete: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Trigger],
    list: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ListTriggersResponse],
    revert: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[RevertTriggerResponse],
    update: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TriggersResource]
  }
}

