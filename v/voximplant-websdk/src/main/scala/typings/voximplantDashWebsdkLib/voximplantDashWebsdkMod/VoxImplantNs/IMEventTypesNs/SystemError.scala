package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of instant messaging subsystem error
		*/
trait SystemError
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	Error data object, contains the error details
  			*/
  var errorData: js.Object
  /**
  			*	Error type
  			*/
  var errorType: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMErrorType
}

