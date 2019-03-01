package typings
package atPulumiAwsLib.apigatewayMethodSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSettingsArgs extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the REST API
    */
  val restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The settings block, see below.
    */
  val settings: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CacheDataEncryptedCacheTtlInSeconds]
  /**
    * The name of the stage
    */
  val stageName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object MethodSettingsArgs {
  @scala.inline
  def apply(
    methodPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    settings: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CacheDataEncryptedCacheTtlInSeconds],
    stageName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): MethodSettingsArgs = {
    val __obj = js.Dynamic.literal(methodPath = methodPath.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MethodSettingsArgs]
  }
}

