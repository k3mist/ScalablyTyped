package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when sent message status changed
		*/
trait MessageStatus
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Message event type. See VoxImplant.MessageEventType enum
  			*/
  var `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType
}

object MessageStatus {
  @scala.inline
  def apply(
    id: java.lang.String,
    message_id: java.lang.String,
    `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.MessageEventType,
    resource: java.lang.String = null
  ): MessageStatus = {
    val __obj = js.Dynamic.literal(id = id, message_id = message_id, `type` = `type`)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[MessageStatus]
  }
}

