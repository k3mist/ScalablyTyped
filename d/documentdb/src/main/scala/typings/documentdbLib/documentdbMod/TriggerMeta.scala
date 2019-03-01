package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerMeta extends AbstractMeta {
  var body: java.lang.String
  var triggerOperation: java.lang.String
  var triggerType: java.lang.String
}

object TriggerMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: scala.Double,
    body: java.lang.String,
    id: java.lang.String,
    triggerOperation: java.lang.String,
    triggerType: java.lang.String,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null
  ): TriggerMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, body = body, id = id, triggerOperation = triggerOperation, triggerType = triggerType)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[TriggerMeta]
  }
}

