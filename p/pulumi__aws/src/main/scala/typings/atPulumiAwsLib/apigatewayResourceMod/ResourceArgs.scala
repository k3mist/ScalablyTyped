package typings
package atPulumiAwsLib.apigatewayResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceArgs extends js.Object {
  /**
    * The ID of the parent API resource
    */
  val parentId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The last path segment of this API resource.
    */
  val pathPart: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
}

object ResourceArgs {
  @scala.inline
  def apply(
    parentId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    pathPart: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  ): ResourceArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceArgs]
  }
}

