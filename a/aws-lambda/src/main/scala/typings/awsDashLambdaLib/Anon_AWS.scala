package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AWS extends js.Object {
  var category: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionCategory
  var owner: awsDashLambdaLib.awsDashLambdaLibStrings.AWS | awsDashLambdaLib.awsDashLambdaLibStrings.Custom | awsDashLambdaLib.awsDashLambdaLibStrings.ThirdParty
  var provider: java.lang.String
  var version: scala.Double
}

object Anon_AWS {
  @scala.inline
  def apply(
    category: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionCategory,
    owner: awsDashLambdaLib.awsDashLambdaLibStrings.AWS | awsDashLambdaLib.awsDashLambdaLibStrings.Custom | awsDashLambdaLib.awsDashLambdaLibStrings.ThirdParty,
    provider: java.lang.String,
    version: scala.Double
  ): Anon_AWS = {
    val __obj = js.Dynamic.literal(category = category, owner = owner.asInstanceOf[js.Any], provider = provider, version = version)
  
    __obj.asInstanceOf[Anon_AWS]
  }
}

