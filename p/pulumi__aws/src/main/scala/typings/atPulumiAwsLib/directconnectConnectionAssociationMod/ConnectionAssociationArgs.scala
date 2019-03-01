package typings
package atPulumiAwsLib.directconnectConnectionAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAssociationArgs extends js.Object {
  /**
    * The ID of the connection.
    */
  val connectionId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object ConnectionAssociationArgs {
  @scala.inline
  def apply(
    connectionId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    lagId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): ConnectionAssociationArgs = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionAssociationArgs]
  }
}

