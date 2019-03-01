package typings
package atPulumiAwsLib.glueClassifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierArgs extends js.Object {
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClassificationCustomPatterns]
  ] = js.undefined
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_JsonPathInput]] = js.undefined
  /**
    * The name of the classifier.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClassificationRowTagInput]
  ] = js.undefined
}

object ClassifierArgs {
  @scala.inline
  def apply(
    grokClassifier: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClassificationCustomPatterns] = null,
    jsonClassifier: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_JsonPathInput] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    xmlClassifier: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClassificationRowTagInput] = null
  ): ClassifierArgs = {
    val __obj = js.Dynamic.literal()
    if (grokClassifier != null) __obj.updateDynamic("grokClassifier")(grokClassifier.asInstanceOf[js.Any])
    if (jsonClassifier != null) __obj.updateDynamic("jsonClassifier")(jsonClassifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xmlClassifier != null) __obj.updateDynamic("xmlClassifier")(xmlClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierArgs]
  }
}

