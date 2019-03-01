package typings
package atPulumiAwsLib.apigatewayBasePathMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePathMappingState extends js.Object {
  /**
    * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
    */
  val basePath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The already-registered domain name to connect the API to.
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The id of the API to connect.
    */
  val restApi: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]] = js.undefined
  /**
    * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
    */
  val stageName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object BasePathMappingState {
  @scala.inline
  def apply(
    basePath: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    domainName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = null,
    stageName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): BasePathMappingState = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathMappingState]
  }
}

