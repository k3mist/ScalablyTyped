package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnFailureHadoopJarStep extends js.Object {
  var actionOnFailure: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var hadoopJarStep: atPulumiPulumiLib.resourceMod.Input[Anon_ArgsJarKey]
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ActionOnFailureHadoopJarStep {
  @scala.inline
  def apply(
    actionOnFailure: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    hadoopJarStep: atPulumiPulumiLib.resourceMod.Input[Anon_ArgsJarKey],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_ActionOnFailureHadoopJarStep = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure.asInstanceOf[js.Any], hadoopJarStep = hadoopJarStep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionOnFailureHadoopJarStep]
  }
}

