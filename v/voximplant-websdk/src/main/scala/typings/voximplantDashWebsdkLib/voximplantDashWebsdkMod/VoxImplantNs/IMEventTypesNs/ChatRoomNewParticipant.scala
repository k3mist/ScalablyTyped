package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when new participant joined the chat room
		*/
trait ChatRoomNewParticipant
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* User display name
  			*/
  var displayName: java.lang.String
  /**
  			* User id
  			*/
  var participant: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

