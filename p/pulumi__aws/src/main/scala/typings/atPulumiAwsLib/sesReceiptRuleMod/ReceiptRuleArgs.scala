package typings
package atPulumiAwsLib.sesReceiptRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleArgs extends js.Object {
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HeaderNameHeaderValue]]
    ]
  ] = js.undefined
  /**
    * The name of the rule to place this rule after
    */
  val after: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MessagePosition]]
    ]
  ] = js.undefined
  /**
    * If true, the rule will be enabled
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FunctionArnInvocationTypePosition]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the rule
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of email addresses
    */
  val recipients: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnObjectKeyPrefix]
      ]
    ]
  ] = js.undefined
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PositionTopicArn]]
    ]
  ] = js.undefined
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PositionScopeTopicArn]]
    ]
  ] = js.undefined
  /**
    * Require or Optional
    */
  val tlsPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_OrganizationArnPosition]]
    ]
  ] = js.undefined
}

object ReceiptRuleArgs {
  @scala.inline
  def apply(
    ruleSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    addHeaderActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HeaderNameHeaderValue]]
    ] = null,
    after: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    bounceActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MessagePosition]]
    ] = null,
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    lambdaActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FunctionArnInvocationTypePosition]
      ]
    ] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    recipients: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    s3Actions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnObjectKeyPrefix]
      ]
    ] = null,
    scanEnabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    snsActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PositionTopicArn]]
    ] = null,
    stopActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PositionScopeTopicArn]]
    ] = null,
    tlsPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    workmailActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_OrganizationArnPosition]]
    ] = null
  ): ReceiptRuleArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
    if (addHeaderActions != null) __obj.updateDynamic("addHeaderActions")(addHeaderActions.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (bounceActions != null) __obj.updateDynamic("bounceActions")(bounceActions.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lambdaActions != null) __obj.updateDynamic("lambdaActions")(lambdaActions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (s3Actions != null) __obj.updateDynamic("s3Actions")(s3Actions.asInstanceOf[js.Any])
    if (scanEnabled != null) __obj.updateDynamic("scanEnabled")(scanEnabled.asInstanceOf[js.Any])
    if (snsActions != null) __obj.updateDynamic("snsActions")(snsActions.asInstanceOf[js.Any])
    if (stopActions != null) __obj.updateDynamic("stopActions")(stopActions.asInstanceOf[js.Any])
    if (tlsPolicy != null) __obj.updateDynamic("tlsPolicy")(tlsPolicy.asInstanceOf[js.Any])
    if (workmailActions != null) __obj.updateDynamic("workmailActions")(workmailActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleArgs]
  }
}

