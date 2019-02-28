package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when invitation to chat room received
		*/
trait ChatRoomInvitation
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* The body of the message
  			*/
  var body: java.lang.String
  /**
  			* User id (inviter)
  			*/
  var from: java.lang.String
  /**
  			* Password for the room
  			*/
  var password: java.lang.String
  /**
  			* A reason of the invitation
  			*/
  var reason: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

