package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RestApiStageName extends js.Object {
  var restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  var stageName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_RestApiStageName {
  @scala.inline
  def apply(
    restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    stageName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_RestApiStageName = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RestApiStageName]
  }
}

