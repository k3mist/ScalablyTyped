package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a specific style. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: gapiDotClientDotFusiontablesLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  /** Updates an existing style. */
  def update(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
    ],
    insert: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
    ],
    list: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[StyleSettingList]
    ],
    patch: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
    ],
    update: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
    ]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[StyleResource]
  }
}

