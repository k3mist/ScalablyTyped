package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcBranchMapping extends js.Object {
  /**
    * Depth of the branch.
    */
  var depth: java.lang.String
  /**
    * Server item for the branch.
    */
  var serverItem: java.lang.String
  /**
    * Type of the branch.
    */
  var `type`: java.lang.String
}

object TfvcBranchMapping {
  @scala.inline
  def apply(depth: java.lang.String, serverItem: java.lang.String, `type`: java.lang.String): TfvcBranchMapping = {
    val __obj = js.Dynamic.literal(depth = depth, serverItem = serverItem, `type` = `type`)
  
    __obj.asInstanceOf[TfvcBranchMapping]
  }
}

