package typings
package atPulumiAwsLib.kmsGrantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantArgs extends js.Object {
  /**
    * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
    */
  val constraints: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EncryptionContextEqualsEncryptionContextSubset]
      ]
    ]
  ] = js.undefined
  /**
    * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
    * * `retire_on_delete` -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
    * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
    */
  val grantCreationTokens: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, terraform's state may not always be refreshed to reflect what is true in AWS.
    */
  val granteePrincipal: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
    */
  val keyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A friendly name for identifying the grant.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
    */
  val operations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  val retireOnDelete: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  val retiringPrincipal: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object GrantArgs {
  @scala.inline
  def apply(
    granteePrincipal: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    keyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    operations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    constraints: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EncryptionContextEqualsEncryptionContextSubset]
      ]
    ] = null,
    grantCreationTokens: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    retireOnDelete: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    retiringPrincipal: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): GrantArgs = {
    val __obj = js.Dynamic.literal(granteePrincipal = granteePrincipal.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (grantCreationTokens != null) __obj.updateDynamic("grantCreationTokens")(grantCreationTokens.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retireOnDelete != null) __obj.updateDynamic("retireOnDelete")(retireOnDelete.asInstanceOf[js.Any])
    if (retiringPrincipal != null) __obj.updateDynamic("retiringPrincipal")(retiringPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantArgs]
  }
}

