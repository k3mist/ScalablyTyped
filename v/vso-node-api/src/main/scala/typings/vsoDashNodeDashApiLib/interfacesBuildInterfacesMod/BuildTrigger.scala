package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildTrigger extends js.Object {
  /**
    * The type of the trigger.
    */
  var triggerType: DefinitionTriggerType
}

object BuildTrigger {
  @scala.inline
  def apply(triggerType: DefinitionTriggerType): BuildTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType)
  
    __obj.asInstanceOf[BuildTrigger]
  }
}

