package typings
package atPulumiAwsLib.inspectorAssessmentTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTemplateArgs extends js.Object {
  /**
    * The duration of the inspector run.
    */
  val duration: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object AssessmentTemplateArgs {
  @scala.inline
  def apply(
    duration: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    rulesPackageArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    targetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): AssessmentTemplateArgs = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateArgs]
  }
}

