package typings
package atPulumiAwsLib.inspectorResourceGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupArgs extends js.Object {
  /**
    * The tags on your EC2 Instance.
    */
  val tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
}

object ResourceGroupArgs {
  @scala.inline
  def apply(tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]): ResourceGroupArgs = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceGroupArgs]
  }
}

