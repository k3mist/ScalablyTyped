package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationArnFormat extends js.Object {
  var destinationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var format: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DestinationArnFormat {
  @scala.inline
  def apply(
    destinationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    format: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_DestinationArnFormat = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DestinationArnFormat]
  }
}

